package com.hus.financialDemo.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "transactionId",
        "referenceNo",
        "amount",
        "currency",
        "date",
        "code",
        "message",
        "operation",
        "type",
        "status",
        "customData",
        "chainId",
        "paymentType",
        "token",
        "convertedAmount",
        "convertedCurrency",
        "IPNUrl",
        "ipnType",
        "authTransactionId"
})
public class IpnMerchant {
    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("referenceNo")
    private String referenceNo;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("date")
    private Integer date;
    @JsonProperty("code")
    private String code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("operation")
    private String operation;
    @JsonProperty("type")
    private String type;
    @JsonProperty("status")
    private String status;
    @JsonProperty("customData")
    private Object customData;
    @JsonProperty("chainId")
    private String chainId;
    @JsonProperty("paymentType")
    private String paymentType;
    @JsonProperty("token")
    private String token;
    @JsonProperty("convertedAmount")
    private Integer convertedAmount;
    @JsonProperty("convertedCurrency")
    private String convertedCurrency;
    @JsonProperty("IPNUrl")
    private String iPNUrl;
    @JsonProperty("ipnType")
    private String ipnType;
    @JsonProperty("authTransactionId")
    private String authTransactionId;
}
