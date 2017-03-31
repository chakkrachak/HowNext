
package org.kisio.labs.navitiasdk.models.journeys;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class AdministrativeRegion____ {

    @SerializedName("insee")
    @Expose
    private String insee;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("coord")
    @Expose
    private Coord_________ coord;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("zip_code")
    @Expose
    private String zipCode;

    public String getInsee() {
        return insee;
    }

    public void setInsee(String insee) {
        this.insee = insee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Coord_________ getCoord() {
        return coord;
    }

    public void setCoord(Coord_________ coord) {
        this.coord = coord;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(insee).append(name).append(level).append(coord).append(label).append(id).append(zipCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdministrativeRegion____) == false) {
            return false;
        }
        AdministrativeRegion____ rhs = ((AdministrativeRegion____) other);
        return new EqualsBuilder().append(insee, rhs.insee).append(name, rhs.name).append(level, rhs.level).append(coord, rhs.coord).append(label, rhs.label).append(id, rhs.id).append(zipCode, rhs.zipCode).isEquals();
    }

}
