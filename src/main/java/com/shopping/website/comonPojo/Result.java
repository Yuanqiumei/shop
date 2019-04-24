package com.shopping.website.comonPojo;

import java.io.Serializable;



public class Result implements Serializable{

	private boolean result;
	private String message;
	private Object object;
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	@Override
	public String toString() {
		return "Result [result=" + result + ", message=" + message + ", object=" + object + "]";
	}
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Result(boolean result, String message, Object object) {
		super();
		this.result = result;
		this.message = message;
		this.object = object;
	}
	
}
