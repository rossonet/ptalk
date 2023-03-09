package net.rossonet.ptalk.engine.parameter;

import com.hazelcast.nio.serialization.compact.CompactReader;
import com.hazelcast.nio.serialization.compact.CompactSerializer;
import com.hazelcast.nio.serialization.compact.CompactWriter;

public class UnitRegisteredSerializer implements CompactSerializer<UnitRegistered> {

	@Override
	public Class<UnitRegistered> getCompactClass() {
		return UnitRegistered.class;
	}

	@Override
	public String getTypeName() {
		return "unitRegistered";
	}

	@Override
	public UnitRegistered read(CompactReader reader) {
		final UnitRegistered result = new UnitRegistered(reader.readString("description"),
				reader.readString("displayName"), reader.readString("certificateCrt"), reader.readString("jsonHealth"),
				reader.readString("superAbilityCode"), reader.readString("host"), reader.readInt32("port"),
				reader.readArrayOfCompact("tagsList", RegisterTag.class),
				reader.readArrayOfCompact("additionalDatasList", RegisterData.class));
		return result;
	}

	@Override
	public void write(CompactWriter writer, UnitRegistered unitRegistered) {
		writer.writeString("description", unitRegistered.getDescription());
		writer.writeString("displayName", unitRegistered.getDisplayName());
		writer.writeString("certificateCrt", unitRegistered.getCertificateCrt());
		writer.writeString("jsonHealth", unitRegistered.getJsonHealth());
		writer.writeString("superAbilityCode", unitRegistered.getSuperAbilityCode());
		writer.writeString("host", unitRegistered.getHost());
		writer.writeInt32("port", unitRegistered.getPort());
		writer.writeArrayOfCompact("tagsList", unitRegistered.getTagsList().toArray(new RegisterTag[0]));
		writer.writeArrayOfCompact("additionalDatasList",
				unitRegistered.getAdditionalDatasList().toArray(new RegisterData[0]));

	}

}
