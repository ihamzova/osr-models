package com.tsystems.tm.acc.domain.osr.csv;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true, fluent = true)
@JsonPropertyOrder({
        "NEG.name",
        "NEG.description",
        "NE.VPSZ",
        "NE.FSZ",
        "NE.description"})
public class A4ResourceInventoryEntry {
    @JsonProperty("NEG.name")
    private String negName;

    @JsonProperty("NEG.description")
    private String negDescription;

    @JsonProperty("NE.VPSZ")
    private String neVpsz;

    @JsonProperty("NE.FSZ")
    private String neFsz;

    @JsonProperty("NE.description")
    private String neDescription;
}
