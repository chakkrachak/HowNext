
package org.kisio.labs.navitiasdk.models;

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
    @SerializedName("network")
    @Expose
    private String network;
    @SerializedName("links")
    @Expose
    private List<Object> links = new ArrayList<Object>();
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("commercial_mode")
    @Expose
    private String commercialMode;
    @SerializedName("text_color")
    @Expose
    private String textColor;
    @SerializedName("label")
    @Expose
    private String label;

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

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
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

    public String getCommercialMode() {
        return commercialMode;
    }

    public void setCommercialMode(String commercialMode) {
        this.commercialMode = commercialMode;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(direction).append(code).append(network).append(links).append(color).append(commercialMode).append(textColor).append(label).toHashCode();
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
        return new EqualsBuilder().append(direction, rhs.direction).append(code, rhs.code).append(network, rhs.network).append(links, rhs.links).append(color, rhs.color).append(commercialMode, rhs.commercialMode).append(textColor, rhs.textColor).append(label, rhs.label).isEquals();
    }

}
