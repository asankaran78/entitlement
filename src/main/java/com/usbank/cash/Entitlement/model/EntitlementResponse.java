package com.usbank.cash.Entitlement.model;

public class EntitlementResponse {
	
	private String featureName;
	
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public void setFeatureType(String featureType) {
		this.featureType = featureType;
	}

	private String featureType;
	
	public String getFeatureName() {
		return featureName;
	}

	public String getFeatureType() {
		return featureType;
	}

	

}
