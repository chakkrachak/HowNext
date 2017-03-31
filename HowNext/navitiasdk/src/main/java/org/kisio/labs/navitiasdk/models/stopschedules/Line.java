
package org.kisio.labs.navitiasdk.models.stopschedules;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Line {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("links")
    @Expose
    private List<Object> links = new ArrayList<Object>();
    @SerializedName("physical_modes")
    @Expose
    private List<PhysicalMode_> physicalModes = new ArrayList<PhysicalMode_>();
    @SerializedName("opening_time")
    @Expose
    private String openingTime;
    @SerializedName("geojson")
    @Expose
    private Geojson_ geojson;
    @SerializedName("text_color")
    @Expose
    private String textColor;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("codes")
    @Expose
    private List<Code____> codes = new ArrayList<Code____>();
    @SerializedName("closing_time")
    @Expose
    private String closingTime;
    @SerializedName("routes")
    @Expose
    private List<Route_> routes = new ArrayList<Route_>();
    @SerializedName("commercial_mode")
    @Expose
    private CommercialMode_ commercialMode;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("network")
    @Expose
    private Network network;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getLinks() {
        return links;
    }

    public void setLinks(List<Object> links) {
        this.links = links;
    }

    public List<PhysicalMode_> getPhysicalModes() {
        return physicalModes;
    }

    public void setPhysicalModes(List<PhysicalMode_> physicalModes) {
        this.physicalModes = physicalModes;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public Geojson_ getGeojson() {
        return geojson;
    }

    public void setGeojson(Geojson_ geojson) {
        this.geojson = geojson;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Code____> getCodes() {
        return codes;
    }

    public void setCodes(List<Code____> codes) {
        this.codes = codes;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public List<Route_> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route_> routes) {
        this.routes = routes;
    }

    public CommercialMode_ getCommercialMode() {
        return commercialMode;
    }

    public void setCommercialMode(CommercialMode_ commercialMode) {
        this.commercialMode = commercialMode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(name).append(links).append(physicalModes).append(openingTime).append(geojson).append(textColor).append(color).append(codes).append(closingTime).append(routes).append(commercialMode).append(id).append(network).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Line) == false) {
            return false;
        }
        Line rhs = ((Line) other);
        return new EqualsBuilder().append(code, rhs.code).append(name, rhs.name).append(links, rhs.links).append(physicalModes, rhs.physicalModes).append(openingTime, rhs.openingTime).append(geojson, rhs.geojson).append(textColor, rhs.textColor).append(color, rhs.color).append(codes, rhs.codes).append(closingTime, rhs.closingTime).append(routes, rhs.routes).append(commercialMode, rhs.commercialMode).append(id, rhs.id).append(network, rhs.network).isEquals();
    }

}
