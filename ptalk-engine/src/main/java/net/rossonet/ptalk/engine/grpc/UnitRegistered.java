package net.rossonet.ptalk.engine.grpc;

import java.util.List;

import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.base.grpc.RegisterRequest;
import net.rossonet.ptalk.base.grpc.Tag;

public class UnitRegistered {

	private final String description;
	private final String displayName;
	private final String certificateCrt;
	private final String jsonHealth;
	private final List<Tag> tagsList;
	private final String superAbilityCode;
	private final List<Data> additionalDatasList;

	public UnitRegistered(RegisterRequest request) {
		this.description = request.getDescription();
		this.displayName = request.getDisplayName();
		this.certificateCrt = request.getCertificateCrt();
		this.jsonHealth = request.getJsonHealth();
		this.tagsList = request.getTagsList();
		this.superAbilityCode = request.getSelfSuperAbilityCode();
		this.additionalDatasList = request.getAdditionalDatasList();
	}

	public List<Data> getAdditionalDatasList() {
		return additionalDatasList;
	}

	public String getCertificateCrt() {
		return certificateCrt;
	}

	public String getDescription() {
		return description;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getJsonHealth() {
		return jsonHealth;
	}

	public String getSuperAbilityCode() {
		return superAbilityCode;
	}

	public List<Tag> getTagsList() {
		return tagsList;
	}

}
