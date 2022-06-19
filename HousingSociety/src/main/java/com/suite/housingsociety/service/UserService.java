package com.suite.housingsociety.service;

import java.util.Map;
import java.util.Optional;

import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

import com.suite.housingsociety.dto.LocalUser;
import com.suite.housingsociety.dto.SignUpRequest;
import com.suite.housingsociety.exception.UserAlreadyExistAuthenticationException;
import com.suite.housingsociety.model.User;

public interface UserService {
	 
    public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;
 
    User findUserByEmail(String email);
 
    Optional<User> findUserById(Long id);
 
    LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}
