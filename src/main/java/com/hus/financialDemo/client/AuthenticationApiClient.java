package com.hus.financialDemo.client;

import com.hus.financialDemo.model.response.Token;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="authenticationApiClient", url="${financial.api.versionedUrl}")
public interface AuthenticationApiClient {

    @PostMapping(value = "${financial.api.loginPath}")
    Token loginInternal(@RequestParam("email") String email, @RequestParam("password") String password);

}
