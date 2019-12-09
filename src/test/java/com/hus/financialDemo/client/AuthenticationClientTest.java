package com.hus.financialDemo.client;

import com.hus.financialDemo.model.response.Token;
import com.hus.financialDemo.util.ResponseStatus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@TestPropertySource(locations = {"classpath:testApp.properties"})
class AuthenticationClientTest {

    @Value("${email}")
    private String email;

    @Value("${password}")
    private String password;

    @Autowired
    private AuthenticationApiClient authenticationClient;

    @Test
    void loginInternal() {
        Token token = authenticationClient.loginInternal(email, password);
        assertAll(() -> assertNotNull(token.getToken()),
                  () -> assertEquals(token.getStatus(), ResponseStatus.APPROVED.name()));
    }

}