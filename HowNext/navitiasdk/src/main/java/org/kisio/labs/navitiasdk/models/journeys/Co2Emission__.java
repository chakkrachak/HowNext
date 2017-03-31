
package org.kisio.labs.navitiasdk.models.journeys;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Co2Emission__ {

    @SerializedName("value")
    @Expose
    private Double value;
    @SerializedName("unit")
    @Expose
    private String unit;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(unit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Co2Emission__) == false) {
            return false;
        }
        Co2Emission__ rhs = ((Co2Emission__) other);
        return new EqualsBuilder().append(value, rhs.value).append(unit, rhs.unit).isEquals();
    }

}
