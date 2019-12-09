package com.hus.financialDemo.client;

import com.hus.financialDemo.model.response.ClientResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="clientApiClient", url="${financial.api.versionedUrl}")
public interface ClientApiClient {

    @PostMapping(value = "/client", consumes = MediaType.APPLICATION_JSON_VALUE)
    ClientResponse getClient(@RequestParam("transactionId") String transactionId);

}
