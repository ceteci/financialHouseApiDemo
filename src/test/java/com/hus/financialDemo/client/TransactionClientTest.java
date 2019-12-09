package com.hus.financialDemo.client;

import com.hus.financialDemo.TestInitializer;
import com.hus.financialDemo.model.request.TransactionListRequest;
import com.hus.financialDemo.model.request.TransactionReportRequest;
import com.hus.financialDemo.model.response.*;
import com.hus.financialDemo.util.ResponseStatus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TransactionClientTest extends TestInitializer {

    @Autowired private TransactionApiClient transactionClient;
    @Autowired private ClientApiClient clientApiClient;

    @Test
    void getReport(){
        TransactionReportRequest request = new TransactionReportRequest(r -> {
            r.setFromDate("2010-07-01");
            r.setToDate("2019-10-01");
        });

        TransactionReport report = transactionClient.getTransactionReport(request);
        assertAll(() -> assertEquals(report.getStatus(), ResponseStatus.APPROVED.name()),
                  () -> assertEquals(report.getResponse().size(), 5));
    }

    @Test
    void getList(){
        TransactionListRequest request = new TransactionListRequest(r -> {
            r.setFromDate("2018-10-12");
            r.setToDate("2019-01-12");
        });

        TransactionList transactionList = transactionClient.getTransactionList(request);
        assertAll(() -> assertNotNull(transactionList),
                  () -> assertEquals(transactionList.getData().size(), 12),
                  () -> assertEquals(((TransactionListData)transactionList.getData().get(0)).getRefundable(), false));
    }

    @Test
    void getTransaction(){
        TransactionResponse transaction = transactionClient.getTransaction("1011028-1539357144-1293");
        assertAll(() -> assertNotNull(transaction),
                  () -> assertEquals(transaction.getFx().getMerchant().getOriginalAmount(), 1500));
    }

    @Test
    void getClient(){
        ClientResponse client = clientApiClient.getClient("1011028-1539357144-1293");
        assertAll(() -> assertNotNull(client),
                  () -> assertEquals(client.getCustomerInfo().getId(), 706784));
    }

}