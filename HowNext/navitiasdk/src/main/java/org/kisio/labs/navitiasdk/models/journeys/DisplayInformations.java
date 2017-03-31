
package org.kisio.labs.navitiasdk.models.journeys;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DisplayInformations {

    @SerializedName("direction")
    @Expose
    private String direction;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("links")
    @Expose
    private List<Object> links = new ArrayList<Object>();
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("physical_mode")
    @Expose
    private String physicalMode;
    @SerializedName("headsign")
    @Expose
    private String headsign;
    @SerializedName("commercial_mode")
    @Expose
    private String commercialMode;
    @SerializedName("equipments")
    @Expose
    private List<Object> equipments = new ArrayList<Object>();
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("text_color")
    @Expose
    private String textColor;
    @SerializedName("network")
    @Expose
    private String network;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Object> getLinks() {
        return links;
    }

    public void setLinks(List<Object> links) {
        this.links = links;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPhysicalMode() {
        return physicalMode;
    }

    public void setPhysicalMode(String physicalMode) {
        this.physicalMode = physicalMode;
    }

    public String getHeadsign() {
        return headsign;
    }

    public void setHeadsign(String headsign) {
        this.headsign = headsign;
    }

    public String getCommercialMode() {
        return commercialMode;
    }

    public void setCommercialMode(String commercialMode) {
        this.commercialMode = commercialMode;
    }

    public List<Object> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Object> equipments) {
        this.equipments = equipments;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(direction).append(code).append(description).append(links).append(color).append(physicalMode).append(headsign).append(commercialMode).append(equipments).append(label).append(textColor).append(network).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DisplayInformations) == false) {
            return false;
        }
        DisplayInformations rhs = ((DisplayInformations) other);
        return new EqualsBuilder().append(direction, rhs.direction).append(code, rhs.code).append(description, rhs.description).append(links, rhs.links).append(color, rhs.color).append(physicalMode, rhs.physicalMode).append(headsign, rhs.headsign).append(commercialMode, rhs.commercialMode).append(equipments, rhs.equipments).append(label, rhs.label).append(textColor, rhs.textColor).append(network, rhs.network).isEquals();
    }

}
