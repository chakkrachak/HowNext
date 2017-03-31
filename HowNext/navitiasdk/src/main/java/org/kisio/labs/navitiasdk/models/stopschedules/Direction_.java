
package org.kisio.labs.navitiasdk.models.stopschedules;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Direction_ {

    @SerializedName("embedded_type")
    @Expose
    private String embeddedType;
    @SerializedName("quality")
    @Expose
    private Integer quality;
    @SerializedName("stop_area")
    @Expose
    private StopArea__ stopArea;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;

    public String getEmbeddedType() {
        return embeddedType;
    }

    public void setEmbeddedType(String embeddedType) {
        this.embeddedType = embeddedType;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public StopArea__ getStopArea() {
        return stopArea;
    }

    public void setStopArea(StopArea__ stopArea) {
        this.stopArea = stopArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return new HashCodeBuilder().append(embeddedType).append(quality).append(stopArea).append(name).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Direction_) == false) {
            return false;
        }
        Direction_ rhs = ((Direction_) other);
        return new EqualsBuilder().append(embeddedType, rhs.embeddedType).append(quality, rhs.quality).append(stopArea, rhs.stopArea).append(name, rhs.name).append(id, rhs.id).isEquals();
    }

}
