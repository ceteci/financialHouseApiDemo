package com.hus.financialDemo.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "merchant"
})
public class TransactionResponseTransaction {
    @JsonProperty("merchant")
    private TransactionResponseTransactionMerchant merchant;
}
