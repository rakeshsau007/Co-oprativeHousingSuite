package com.suite.housingsociety.dto;

import lombok.Value;

@Value
public class JwtAuthenticationResponse {
    public JwtAuthenticationResponse(String accessToken, UserInfo user) {
		super();
		this.accessToken = accessToken;
		this.user = user;
	}
	private String accessToken;
    private UserInfo user;
}
