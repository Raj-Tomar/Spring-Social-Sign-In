package com.raj.social.service;

import org.springframework.security.core.userdetails.UserDetails;

import com.raj.social.dto.UserRegistrationForm;
import com.raj.social.exception.UserAlreadyExistAuthenticationException;


public interface UserService {

    /**
     * @param UserRegistrationForm
     * @return
     * @throws UserAlreadyExistAuthenticationException
     */
    public UserDetails registerNewUser(UserRegistrationForm UserRegistrationForm)throws UserAlreadyExistAuthenticationException;

}
