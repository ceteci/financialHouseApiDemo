package com.hus.financialDemo.client;

import com.hus.financialDemo.model.request.TransactionListRequest;
import com.hus.financialDemo.model.request.TransactionReportRequest;
import com.hus.financialDemo.model.response.TransactionList;
import com.hus.financialDemo.model.response.TransactionReport;
import com.hus.financialDemo.model.response.TransactionResponse;
import feign.QueryMap;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="transactionApiClient", url="${financial.api.versionedUrl}")
public interface TransactionApiClient {

    @PostMapping(value = "/transactions/report", consumes = MediaType.APPLICATION_JSON_VALUE)
    TransactionReport getTransactionReport(@QueryMap TransactionReportRequest request);

    @PostMapping(value = "/transaction/list", consumes = MediaType.APPLICATION_JSON_VALUE)
    TransactionList getTransactionList(TransactionListRequest request);

    @PostMapping(value = "/transaction", consumes = MediaType.APPLICATION_JSON_VALUE)
    TransactionResponse getTransaction(@RequestParam("transactionId") String transactionId);

}
