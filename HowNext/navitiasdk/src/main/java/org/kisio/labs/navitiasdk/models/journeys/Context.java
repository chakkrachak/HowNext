
package org.kisio.labs.navitiasdk.models.journeys;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Context {

    @SerializedName("car_direct_path")
    @Expose
    private CarDirectPath carDirectPath;

    public CarDirectPath getCarDirectPath() {
        return carDirectPath;
    }

    public void setCarDirectPath(CarDirectPath carDirectPath) {
        this.carDirectPath = carDirectPath;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(carDirectPath).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Context) == false) {
            return false;
        }
        Context rhs = ((Context) other);
        return new EqualsBuilder().append(carDirectPath, rhs.carDirectPath).isEquals();
    }

}
