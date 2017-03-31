
package org.kisio.labs.navitiasdk.models.journeys;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class StopArea {

    @SerializedName("codes")
    @Expose
    private List<Code_> codes = new ArrayList<Code_>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("links")
    @Expose
    private List<Object> links = new ArrayList<Object>();
    @SerializedName("coord")
    @Expose
    private Coord____ coord;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("administrative_regions")
    @Expose
    private List<AdministrativeRegion__> administrativeRegions = new ArrayList<AdministrativeRegion__>();

    public List<Code_> getCodes() {
        return codes;
    }

    public void setCodes(List<Code_> codes) {
        this.codes = codes;
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

    public Coord____ getCoord() {
        return coord;
    }

    public void setCoord(Coord____ coord) {
        this.coord = coord;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<AdministrativeRegion__> getAdministrativeRegions() {
        return administrativeRegions;
    }

    public void setAdministrativeRegions(List<AdministrativeRegion__> administrativeRegions) {
        this.administrativeRegions = administrativeRegions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codes).append(name).append(links).append(coord).append(label).append(timezone).append(id).append(administrativeRegions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StopArea) == false) {
            return false;
        }
        StopArea rhs = ((StopArea) other);
        return new EqualsBuilder().append(codes, rhs.codes).append(name, rhs.name).append(links, rhs.links).append(coord, rhs.coord).append(label, rhs.label).append(timezone, rhs.timezone).append(id, rhs.id).append(administrativeRegions, rhs.administrativeRegions).isEquals();
    }

}
