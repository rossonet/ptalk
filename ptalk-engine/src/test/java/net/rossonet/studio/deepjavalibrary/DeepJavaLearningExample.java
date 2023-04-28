/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package net.rossonet.studio.deepjavalibrary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import ai.djl.Application;
import ai.djl.ModelException;
import ai.djl.engine.Engine;
import ai.djl.inference.Predictor;
import ai.djl.modality.nlp.qa.QAInput;
import ai.djl.repository.Artifact;
import ai.djl.repository.zoo.Criteria;
import ai.djl.repository.zoo.ModelLoader;
import ai.djl.repository.zoo.ModelNotFoundException;
import ai.djl.repository.zoo.ModelZoo;
import ai.djl.repository.zoo.ZooModel;
import ai.djl.training.util.ProgressBar;
import ai.djl.translate.TranslateException;

/**
 * An example of inference using BertQA.
 *
 * <p>
 * See:
 *
 * <ul>
 * <li>the <a href=
 * "https://github.com/deepjavalibrary/djl/blob/master/jupyter/BERTQA.ipynb">jupyter
 * demo</a> with more information about BERT.
 * <li>the <a href=
 * "https://github.com/deepjavalibrary/djl/blob/master/examples/docs/BERT_question_and_answer.md">docs</a>
 * for information about running this example.
 * </ul>
 */
public final class DeepJavaLearningExample {

	@Test
	public void listModels() throws ModelNotFoundException, IOException {
		for (final ModelZoo mz : ModelZoo.listModelZoo()) {
			System.out.println(mz.getGroupId() + " " + mz.getSupportedEngines());
			for (final ModelLoader ml : mz.getModelLoaders()) {
				System.out.println("\t" + ml.getArtifactId() + " " + ml.getApplication().toString());
				for (final Artifact a : ml.listModels()) {
					System.out.println("\t\t" + a.toString());
				}
			}
		}
	}

	@Test
	public void mainTest() throws IOException, TranslateException, ModelException {
		final String answer = predict();
		System.out.println("Answer: " + answer);
		assertEquals("december 2004", answer);
	}

	public String predict() throws IOException, TranslateException, ModelException {
		final String question = "When did BBC Japan start broadcasting?";
		final String paragraph = "BBC Japan was a general entertainment Channel. "
				+ "Which operated between December 2004 and April 2006. "
				+ "It ceased operations after its Japanese distributor folded.";

		final QAInput input = new QAInput(question, paragraph);
		System.out.println("Paragraph: " + input.getParagraph());
		System.out.println("Question: " + input.getQuestion());

		final Criteria<QAInput, String> criteria = Criteria.builder().optApplication(Application.NLP.QUESTION_ANSWER)
				.setTypes(QAInput.class, String.class).optFilter("backbone", "bert")
				.optEngine(Engine.getDefaultEngineName()).optProgress(new ProgressBar()).build();

		try (ZooModel<QAInput, String> model = criteria.loadModel()) {
			try (Predictor<QAInput, String> predictor = model.newPredictor()) {
				return predictor.predict(input);
			}
		}
	}
}
