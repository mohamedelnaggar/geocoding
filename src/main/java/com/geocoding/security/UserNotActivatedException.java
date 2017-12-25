package com.geocoding.security;

import org.springframework.security.core.AuthenticationException;

/**
 * Custom exception to handle not activated users
 */
public class UserNotActivatedException extends AuthenticationException {

    public UserNotActivatedException(String msg, Throwable t) {
        super(msg, t);
    }

    public UserNotActivatedException(String msg) {
        super(msg);
    }
}
