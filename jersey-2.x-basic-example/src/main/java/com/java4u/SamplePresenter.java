package com.java4u;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sample")
public class SamplePresenter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String response;

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public SamplePresenter(String response) {
		super();
		this.response = response;
	}

	public SamplePresenter() {
		super();
	}

}
