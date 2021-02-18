package com.xero.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class XeroBaseModel {

	@JsonIgnore
	private ActionEnum action;

	public ActionEnum getAction() {
		return action;
	}

	public void setAction(ActionEnum action) {
		this.action = action;
	}

}
