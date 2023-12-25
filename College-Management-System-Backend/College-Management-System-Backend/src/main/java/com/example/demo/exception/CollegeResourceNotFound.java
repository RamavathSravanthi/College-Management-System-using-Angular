package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class CollegeResourceNotFound extends RuntimeException {
	private static final long serivalVersionUID=1L;
	private String resourceName;
	private String fieldName;
	private String fieldValue;
	
	public CollegeResourceNotFound(String resourceName, String fieldName, String fieldValue) {
		super(String.format("%s not found with %s:'%s'", resourceName, fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public static long getSerivalversionuid() {
		return serivalVersionUID;
	}
	
	
	
	
}
