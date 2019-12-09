package com.hus.financialDemo;

import com.hus.financialDemo.client.AuthenticationApiClient;
import com.hus.financialDemo.model.response.Token;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@TestPropertySource(locations = {"classpath:testApp.properties"})
@SpringBootTest
public abstract class TestInitializer {
    public static final String FINANCIAL_DEMO_DATE_FORMAT = "yyyy-MM-dd";

    @Value("${email}")
    private String email;

    @Value("${password}")
    private String password;

    @Autowired private AuthenticationApiClient authenticationClient;

    @BeforeEach
    public void init() {
        Token token = authenticationClient.loginInternal(email, password);
        SecurityContextHolder.setContext(new SecurityContextImpl(new UsernamePasswordAuthenticationToken(email, token.getToken())));
    }
}
