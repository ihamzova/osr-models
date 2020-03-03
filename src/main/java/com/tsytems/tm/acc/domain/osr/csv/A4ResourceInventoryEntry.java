package com.tsytems.tm.acc.domain.osr.csv;

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
        "NEG.CNO",
        "NEG.description",
        "NE.VPSZ",
        "NE.FSZ",
        "NE.planningDeviceName",
        "NE.type",
        "NE.VSP",
        "NE.loc.KLS_ID",
        "NE.loc.address",
        "NE.loc.RackId",
        "NE.loc.RackPosition",
        "NE.description"})
public class A4ResourceInventoryEntry {
    @JsonProperty("NEG.name")
    private String negName;

    @JsonProperty("NEG.CNO")
    private String negCno;

    @JsonProperty("NEG.description")
    private String negDescription;

    @JsonProperty("NE.VPSZ")
    private String neVpsz;

    @JsonProperty("NE.FSZ")
    private String neFsz;

    @JsonProperty("NE.planningDeviceName")
    private String nePlanningDeviceName;

    @JsonProperty("NE.type")
    private String neType;

    @JsonProperty("NE.VSP")
    private String neVsp;

    @JsonProperty("NE.loc.KLS_ID")
    private String neLocKlsId;

    @JsonProperty("NE.loc.address")
    private String neLocAddress;

    @JsonProperty("NE.loc.RackId")
    private String neLocRackId;

    @JsonProperty("NE.loc.RackPosition")
    private String neLocRackPosition;

    @JsonProperty("NE.description")
    private String neDescription;
}
