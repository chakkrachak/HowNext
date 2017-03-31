
package org.kisio.labs.navitiasdk.models.journeys;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Durations {

    @SerializedName("walking")
    @Expose
    private Integer walking;
    @SerializedName("total")
    @Expose
    private Integer total;

    public Integer getWalking() {
        return walking;
    }

    public void setWalking(Integer walking) {
        this.walking = walking;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(walking).append(total).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Durations) == false) {
            return false;
        }
        Durations rhs = ((Durations) other);
        return new EqualsBuilder().append(walking, rhs.walking).append(total, rhs.total).isEquals();
    }

}
