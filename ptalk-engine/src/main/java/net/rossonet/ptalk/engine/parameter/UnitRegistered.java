package net.rossonet.ptalk.engine.parameter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.base.grpc.RegisterRequest;
import net.rossonet.ptalk.base.grpc.Tag;

public class UnitRegistered {

	private final String description;
	private final String displayName;
	private final String certificateCrt;
	private final String jsonHealth;
	private final List<RegisterTag> tagsList = new ArrayList<>();
	private final String superAbilityCode;
	private final List<RegisterData> additionalDatasList = new ArrayList<>();
	private final String host;
	private final int port;

	public UnitRegistered(RegisterRequest request) {
		this.description = request.getDescription();
		this.displayName = request.getDisplayName();
		this.certificateCrt = request.getCertificateCrt();
		this.jsonHealth = request.getJsonHealth();
		this.host = request.getHost();
		this.port = request.getPort();
		for (final Tag t : request.getTagsList()) {
			this.tagsList.add(new RegisterTag(t));
		}
		this.superAbilityCode = request.getSelfSuperAbilityCode();
		for (final Data d : request.getAdditionalDatasList()) {
			this.additionalDatasList.add(new RegisterData(d));
		}
	}

	public UnitRegistered(String description, String displayName, String certificateCrt, String jsonHealth,
			String superAbilityCode, String host, int port, RegisterTag[] tagsList,
			RegisterData[] additionalDatasList) {
		this.description = description;
		this.displayName = displayName;
		this.certificateCrt = certificateCrt;
		this.jsonHealth = jsonHealth;
		this.superAbilityCode = superAbilityCode;
		this.host = host;
		this.port = port;
		this.tagsList.addAll(Arrays.asList(tagsList));
		this.additionalDatasList.addAll(Arrays.asList(additionalDatasList));
	}

	public Collection<RegisterData> getAdditionalDatasList() {
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

	public String getHost() {
		return host;
	}

	public String getJsonHealth() {
		return jsonHealth;
	}

	public int getPort() {
		return port;
	}

	public String getSuperAbilityCode() {
		return superAbilityCode;
	}

	public Collection<RegisterTag> getTagsList() {
		return tagsList;
	}

}
