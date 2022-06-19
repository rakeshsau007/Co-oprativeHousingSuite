package com.suite.housingsociety.dto;

import lombok.Value;

@Value
public class ApiResponse {
    public ApiResponse(Boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	private Boolean success;
    private String message;
}