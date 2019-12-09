package com.hus.financialDemo.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "customerIp",
        "customerUserAgent",
        "merchantIp"
})
public class Agent {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("customerIp")
    private String customerIp;
    @JsonProperty("customerUserAgent")
    private String customerUserAgent;
    @JsonProperty("merchantIp")
    private String merchantIp;
}
