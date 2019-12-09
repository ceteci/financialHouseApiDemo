package com.hus.financialDemo.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "referenceNo",
        "status",
        "customData",
        "type",
        "operation",
        "created_at",
        "message",
        "transactionId"
})
public class TransactionMerchant {
    @JsonProperty("referenceNo")
    private String referenceNo;
    @JsonProperty("status")
    private String status;
    @JsonProperty("customData")
    private Object customData;
    @JsonProperty("type")
    private String type;
    @JsonProperty("operation")
    private String operation;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("message")
    private String message;
    @JsonProperty("transactionId")
    private String transactionId;
}
