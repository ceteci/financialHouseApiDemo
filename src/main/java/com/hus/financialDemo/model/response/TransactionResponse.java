package com.hus.financialDemo.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerInfo",
        "fx",
        "transaction",
        "merchant"
})
public class TransactionResponse {
    @JsonProperty("customerInfo")
    private CustomerInfo customerInfo;
    @JsonProperty("fx")
    private TransactionResponseFx fx;
    @JsonProperty("transaction")
    private TransactionResponseTransaction transaction;
    @JsonProperty("merchant")
    private TransactionResponseMerchant merchant;
}
