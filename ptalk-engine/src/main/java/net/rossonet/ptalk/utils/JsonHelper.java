package net.rossonet.ptalk.utils;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.base.grpc.Data.Builder;
import net.rossonet.ptalk.base.grpc.DataType;
import net.rossonet.ptalk.base.grpc.Quality;
import net.rossonet.ptalk.engine.ConfigurationTasksManager;
import net.rossonet.ptalk.engine.GlobalConfiguration;
import net.rossonet.ptalk.engine.exceptions.BadConfigurationVersionException;
import net.rossonet.ptalk.engine.exceptions.TaskManagerException;

public class JsonHelper {

	public static final String RULE_NAME_LABEL = "name";
	private static final String VALUE_LABEL = "value";
	private static final String SHORT_DESCRIPTION_LABEL = "short_description";
	private static final String KEY_LABEL = "key";
	private static final String DISPLAY_NAME_LABEL = "display_name";
	private static final String DESCRIPTION_LABEL = "description";
	private static final String WEIGHT_LABEL = "weight";
	private static final String TYPEDATA_LABEL = "typedata";
	private static final String QUALITY_LABEL = "quality";
	private static final String PRIORITY_LABEL = "priority";
	private static final String TASK_CONFIGURATION_LABEL = "task_configuration";
	private static final String GLOBAL_CONFIGURATION_LABEL = "global_configuration";
	private static final String CONFIGURATION_TYPE_LABEL = "configuration_type";
	private static final String PTALK_CONF_VERSION = "ptalk_conf_v.1.0";

	public static Data dataFromJson(JSONObject jsonObject) {
		final Builder replyBuilder = Data.newBuilder();
		if (jsonObject.has(VALUE_LABEL)) {
			replyBuilder.setValue(jsonObject.getString(VALUE_LABEL));
		}

		if (jsonObject.has(KEY_LABEL)) {
			replyBuilder.setValue(jsonObject.getString(KEY_LABEL));
		}
		if (jsonObject.has(TYPEDATA_LABEL)) {
			replyBuilder.setTypeData(DataType.valueOf(jsonObject.getString(TYPEDATA_LABEL)));
		}
		if (jsonObject.has(DISPLAY_NAME_LABEL)) {
			replyBuilder.setDisplayName(jsonObject.getString(DISPLAY_NAME_LABEL));
		}
		if (jsonObject.has(SHORT_DESCRIPTION_LABEL)) {
			replyBuilder.setShortDescription(jsonObject.getString(SHORT_DESCRIPTION_LABEL));
		}
		if (jsonObject.has(DESCRIPTION_LABEL)) {
			replyBuilder.setDescription(jsonObject.getString(DESCRIPTION_LABEL));
		}
		if (jsonObject.has(QUALITY_LABEL)) {
			replyBuilder.setQuality(Quality.valueOf(jsonObject.getString(QUALITY_LABEL)));
		}
		if (jsonObject.has(PRIORITY_LABEL)) {
			replyBuilder.setPriority(jsonObject.getInt(PRIORITY_LABEL));
		}
		if (jsonObject.has(WEIGHT_LABEL)) {
			replyBuilder.setWeight(jsonObject.getInt(WEIGHT_LABEL));
		}

		return replyBuilder.build();
	}

	public static JSONObject generateJsonConfiguration(GlobalConfiguration globalConfiguration,
			ConfigurationTasksManager configurationTasksManager) {
		final JSONObject reply = new JSONObject();
		reply.put(CONFIGURATION_TYPE_LABEL, PTALK_CONF_VERSION);
		reply.put(GLOBAL_CONFIGURATION_LABEL, globalConfiguration.toJson());
		reply.put(TASK_CONFIGURATION_LABEL, configurationTasksManager.toJson());
		return reply;
	}

	public static JSONArray getJsonArrayFromStringSet(Set<String> rulesStringSet) {
		final JSONArray result = new JSONArray();
		for (final String r : rulesStringSet) {
			result.put(new JSONObject(r));
		}
		return result;
	}

	public static JSONObject jsonFromData(Data data) {
		final JSONObject reply = new JSONObject();
		reply.put(VALUE_LABEL, data.getValue());
		reply.put(KEY_LABEL, data.getKey());
		reply.put(TYPEDATA_LABEL, data.getTypeData().name());
		reply.put(DISPLAY_NAME_LABEL, data.getDisplayName());
		reply.put(SHORT_DESCRIPTION_LABEL, data.getShortDescription());
		reply.put(DESCRIPTION_LABEL, data.getDescription());
		reply.put(QUALITY_LABEL, data.getQualityValue());
		reply.put(PRIORITY_LABEL, data.getPriority());
		reply.put(WEIGHT_LABEL, data.getWeight());
		return reply;
	}

	public static void updateJsonConfiguration(JSONObject jsonConfiguration, GlobalConfiguration globalConfiguration,
			ConfigurationTasksManager configurationTasksManager) throws TaskManagerException {
		if (jsonConfiguration.has(CONFIGURATION_TYPE_LABEL)
				&& jsonConfiguration.getString(CONFIGURATION_TYPE_LABEL).equals(PTALK_CONF_VERSION)) {
			globalConfiguration.updateFromJson(jsonConfiguration.optJSONObject(GLOBAL_CONFIGURATION_LABEL));
			configurationTasksManager.updateFromJson(jsonConfiguration.optJSONObject(TASK_CONFIGURATION_LABEL));
		} else {
			if (jsonConfiguration.has(CONFIGURATION_TYPE_LABEL)) {
				throw new BadConfigurationVersionException("Need configuration version " + PTALK_CONF_VERSION
						+ " but the json version is " + jsonConfiguration.getString(CONFIGURATION_TYPE_LABEL));
			} else {
				throw new BadConfigurationVersionException(
						"in json configuration is NOT present the version [" + CONFIGURATION_TYPE_LABEL + "]");
			}
		}
	}

	private JsonHelper() {
		// only static use
	}

}
