
package org.kisio.labs.navitiasdk.models.journeys;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Address_ {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("house_number")
    @Expose
    private Integer houseNumber;
    @SerializedName("coord")
    @Expose
    private Coord__________ coord;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("administrative_regions")
    @Expose
    private List<AdministrativeRegion_____> administrativeRegions = new ArrayList<AdministrativeRegion_____>();
    @SerializedName("id")
    @Expose
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Coord__________ getCoord() {
        return coord;
    }

    public void setCoord(Coord__________ coord) {
        this.coord = coord;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<AdministrativeRegion_____> getAdministrativeRegions() {
        return administrativeRegions;
    }

    public void setAdministrativeRegions(List<AdministrativeRegion_____> administrativeRegions) {
        this.administrativeRegions = administrativeRegions;
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
        return new HashCodeBuilder().append(name).append(houseNumber).append(coord).append(label).append(administrativeRegions).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address_) == false) {
            return false;
        }
        Address_ rhs = ((Address_) other);
        return new EqualsBuilder().append(name, rhs.name).append(houseNumber, rhs.houseNumber).append(coord, rhs.coord).append(label, rhs.label).append(administrativeRegions, rhs.administrativeRegions).append(id, rhs.id).isEquals();
    }

}
