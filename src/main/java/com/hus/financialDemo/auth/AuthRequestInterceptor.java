package com.hus.financialDemo.auth;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthRequestInterceptor implements RequestInterceptor {

    private String authPath;

    public AuthRequestInterceptor(@Value("${financial.api.loginPath}") String authPath) {
        this.authPath = authPath;
    }

    @Override
    public void apply(RequestTemplate requestTemplate) {
        //auth request
        if(authPath.equals(requestTemplate.path())) {
            return;
        }

        String authToken = (String) SecurityContextHolder.getContext().getAuthentication().getCredentials();
        requestTemplate.header(HttpHeaders.AUTHORIZATION, authToken);
    }

}
