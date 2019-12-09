package com.hus.financialDemo.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import java.util.function.Consumer;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "fromDate",
        "toDate",
        "status",
        "operation",
        "merchantId",
        "acquirerId",
        "paymentMethod",
        "errorCode",
        "filterField",
        "filterValue",
        "page"
})
public class TransactionListRequest {
    @JsonProperty("fromDate")
    private String fromDate;
    @JsonProperty("toDate")
    private String toDate;
    @JsonProperty("status")
    private String status;
    @JsonProperty("operation")
    private String operation;
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("acquirerId")
    private Integer acquirerId;
    @JsonProperty("paymentMethod")
    private String paymentMethod;
    @JsonProperty("errorCode")
    private String errorCode;
    @JsonProperty("filterField")
    private String filterField;
    @JsonProperty("filterValue")
    private String filterValue;
    @JsonProperty("page")
    private Integer page;

    public TransactionListRequest(Consumer<TransactionListRequest> builder) {
        builder.accept(this);
    }
}
