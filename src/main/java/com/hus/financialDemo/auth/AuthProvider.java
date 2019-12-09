package com.hus.financialDemo.auth;

import com.hus.financialDemo.client.AuthenticationApiClient;
import com.hus.financialDemo.model.response.Token;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class AuthProvider implements AuthenticationProvider {

    private AuthenticationApiClient authenticationClient;
    private String email;
    private String password;

    public AuthProvider(AuthenticationApiClient authenticationClient,
                        @Value("${email}") String email,
                        @Value("${password}") String password
    ) {
        this.authenticationClient = authenticationClient;
        this.email = email;
        this.password = password;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        if(authentication.isAuthenticated()) {
            return authentication;
        }

        try {
            Token token = authenticationClient.loginInternal(email, password);
            return new UsernamePasswordAuthenticationToken(email, token.getToken(), Collections.singleton(new SimpleGrantedAuthority("USER")));
        } catch (Exception e) {
            throw new BadCredentialsException(e.getMessage());
        }

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(
                UsernamePasswordAuthenticationToken.class);
    }
}
