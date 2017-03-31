
package org.kisio.labs.navitiasdk.models.journeys;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Path {

    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("length")
    @Expose
    private Integer length;
    @SerializedName("direction")
    @Expose
    private Integer direction;
    @SerializedName("name")
    @Expose
    private String name;

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(duration).append(length).append(direction).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Path) == false) {
            return false;
        }
        Path rhs = ((Path) other);
        return new EqualsBuilder().append(duration, rhs.duration).append(length, rhs.length).append(direction, rhs.direction).append(name, rhs.name).isEquals();
    }

}
