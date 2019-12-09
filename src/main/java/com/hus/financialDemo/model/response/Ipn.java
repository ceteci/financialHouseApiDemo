package com.hus.financialDemo.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sent",
        "merchant"
})
public class Ipn {
    @JsonProperty("sent")
    private Boolean sent;
    @JsonProperty("merchant")
    private IpnMerchant merchant;
}
