package net.rossonet.ptalk.tools;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.rossonet.utils.LogHelper;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class CsvWorks {

	private static final int CHARS_IN_TRASCRIPTION = 200;
	private static final Logger logger = Logger.getLogger(CsvWorks.class.getName());

	// @Test
	public void openCsvFile() throws Exception {
		final List<String[]> datas = new ArrayList<>();
		final StringBuilder sb = new StringBuilder();
		try (CSVReader csvReader = new CSVReader(
				new FileReader("/home/andrea/Scaricati/archive/2020-05-01/ted_talks_it.csv"));) {
			String[] values = null;
			int counter = 1;
			while (counter < 120 && ((values = csvReader.readNext()) != null)) {
				for (final String v : values) {
					sb.append(v + "\n");
				}
				final JSONObject header = new JSONObject();
				header.put("all_speakers", values[3]);
				header.put("occupations", values[4]);
				header.put("about_speakers", values[5]);
				System.out.println("HEADER: " + header.toString());
				final String payload = values[18].substring(0,
						values[18].length() > CHARS_IN_TRASCRIPTION ? CHARS_IN_TRASCRIPTION - 1
								: values[18].length() - 1);
				final String[] csvLine = new String[] { header.toString(), payload };
				System.out.println("PAYLOAD: " + values[18]);
				if (counter > 10) {
					datas.add(csvLine);
				}
				counter++;
			}
			writeLineByLine(datas, Path.of("/home/andrea/Scaricati/nlu_example_input.csv"));
			System.out.println(sb.toString());

		}
	}

	@Test
	public void testExceptionError() {
		try {
			final int a = 6 / 0;
		} catch (final Exception a) {
			logger.severe(LogHelper.stackTraceToString(a, 4));
		}

	}

	public void writeLineByLine(List<String[]> lines, Path path) throws Exception {
		try (CSVWriter writer = new CSVWriter(new FileWriter(path.toString()))) {
			for (final String[] line : lines) {
				writer.writeNext(line);
			}
			writer.flush();
		}

	}
}
