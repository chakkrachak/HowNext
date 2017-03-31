
package org.kisio.labs.navitiasdk.models.journeys;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class StopArea_ {

    @SerializedName("codes")
    @Expose
    private List<Code___> codes = new ArrayList<Code___>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("links")
    @Expose
    private List<Object> links = new ArrayList<Object>();
    @SerializedName("coord")
    @Expose
    private Coord________ coord;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("administrative_regions")
    @Expose
    private List<AdministrativeRegion____> administrativeRegions = new ArrayList<AdministrativeRegion____>();
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("id")
    @Expose
    private String id;

    public List<Code___> getCodes() {
        return codes;
    }

    public void setCodes(List<Code___> codes) {
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

    public Coord________ getCoord() {
        return coord;
    }

    public void setCoord(Coord________ coord) {
        this.coord = coord;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<AdministrativeRegion____> getAdministrativeRegions() {
        return administrativeRegions;
    }

    public void setAdministrativeRegions(List<AdministrativeRegion____> administrativeRegions) {
        this.administrativeRegions = administrativeRegions;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codes).append(name).append(links).append(coord).append(label).append(administrativeRegions).append(timezone).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StopArea_) == false) {
            return false;
        }
        StopArea_ rhs = ((StopArea_) other);
        return new EqualsBuilder().append(codes, rhs.codes).append(name, rhs.name).append(links, rhs.links).append(coord, rhs.coord).append(label, rhs.label).append(administrativeRegions, rhs.administrativeRegions).append(timezone, rhs.timezone).append(id, rhs.id).isEquals();
    }

}
