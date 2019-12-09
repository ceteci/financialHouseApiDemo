package com.hus.financialDemo.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "referenceNo",
        "merchantId",
        "status",
        "channel",
        "customData",
        "chainId",
        "type",
        "agentInfoId",
        "operation",
        "updated_at",
        "created_at",
        "id",
        "fxTransactionId",
        "acquirerTransactionId",
        "code",
        "message",
        "transactionId",
        "agent"
})
public class TransactionResponseTransactionMerchant {
    @JsonProperty("referenceNo")
    private String referenceNo;
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("customData")
    private Object customData;
    @JsonProperty("chainId")
    private String chainId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("agentInfoId")
    private Integer agentInfoId;
    @JsonProperty("operation")
    private String operation;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("fxTransactionId")
    private Integer fxTransactionId;
    @JsonProperty("acquirerTransactionId")
    private Integer acquirerTransactionId;
    @JsonProperty("code")
    private String code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("agent")
    private Agent agent;
}
