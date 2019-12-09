package com.hus.financialDemo.controller;

import com.hus.financialDemo.FinancialDemoApplication;
import com.hus.financialDemo.client.TransactionApiClient;
import com.hus.financialDemo.model.request.TransactionListRequest;
import com.hus.financialDemo.model.request.TransactionReportRequest;
import com.hus.financialDemo.model.response.TransactionListData;
import com.hus.financialDemo.model.response.TransactionReportResponse;
import com.hus.financialDemo.model.response.TransactionResponse;
import feign.QueryMap;
import org.apache.tomcat.jni.Local;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TransactionController {

    @Autowired
    private TransactionApiClient transactionClient;

    @GetMapping("/report")
    public List<TransactionReportResponse> getReport(@QueryMap TransactionReportRequest request){
        return transactionClient.getTransactionReport(request).getResponse();
    }

    @GetMapping("/report/currency/{currency}")
    public List<TransactionReportResponse> getAllReportByCurrency( @PathVariable String currency) {
        return transactionClient.getTransactionReport(new TransactionReportRequest(request -> {
            request.setFromDate(LocalDate.of(2000, 1, 1).toString());
            request.setToDate(LocalDate.now().toString());
        })).getResponse().stream().filter(response -> response.getCurrency().equals(currency.toUpperCase())).collect(Collectors.toList());
    }

    @GetMapping("/list")
    public List<TransactionListData> getAllList(@QueryMap TransactionListRequest request) {
        return transactionClient.getTransactionList(request).getData();
    }

    @GetMapping("/list/status/{status}")
    public List<TransactionListData> getAllListByStatus(@PathVariable String status) {
        return transactionClient.getTransactionList(new TransactionListRequest(request -> {
            request.setFromDate(LocalDate.of(2000, 1, 1).toString());
            request.setToDate(LocalDate.now().toString());
            request.setStatus(status.toUpperCase());
        })).getData();
    }

    @GetMapping("/transaction/{transactionId}")
    public TransactionResponse getTransaction(@PathVariable String transactionId){
        return transactionClient.getTransaction(transactionId);
    }

}
