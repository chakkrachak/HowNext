
package org.kisio.labs.navitiasdk.models.journeys;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class To {

    @SerializedName("embedded_type")
    @Expose
    private String embeddedType;
    @SerializedName("stop_point")
    @Expose
    private StopPoint_ stopPoint;
    @SerializedName("quality")
    @Expose
    private Integer quality;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("address")
    @Expose
    private Address_ address;

    public String getEmbeddedType() {
        return embeddedType;
    }

    public void setEmbeddedType(String embeddedType) {
        this.embeddedType = embeddedType;
    }

    public StopPoint_ getStopPoint() {
        return stopPoint;
    }

    public void setStopPoint(StopPoint_ stopPoint) {
        this.stopPoint = stopPoint;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address_ getAddress() {
        return address;
    }

    public void setAddress(Address_ address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(embeddedType).append(stopPoint).append(quality).append(id).append(name).append(address).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof To) == false) {
            return false;
        }
        To rhs = ((To) other);
        return new EqualsBuilder().append(embeddedType, rhs.embeddedType).append(stopPoint, rhs.stopPoint).append(quality, rhs.quality).append(id, rhs.id).append(name, rhs.name).append(address, rhs.address).isEquals();
    }

}
