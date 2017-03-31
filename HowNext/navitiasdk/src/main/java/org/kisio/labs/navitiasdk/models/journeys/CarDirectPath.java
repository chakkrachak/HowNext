
package org.kisio.labs.navitiasdk.models.journeys;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CarDirectPath {

    @SerializedName("co2_emission")
    @Expose
    private Co2Emission__ co2Emission;

    public Co2Emission__ getCo2Emission() {
        return co2Emission;
    }

    public void setCo2Emission(Co2Emission__ co2Emission) {
        this.co2Emission = co2Emission;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(co2Emission).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CarDirectPath) == false) {
            return false;
        }
        CarDirectPath rhs = ((CarDirectPath) other);
        return new EqualsBuilder().append(co2Emission, rhs.co2Emission).isEquals();
    }

}
