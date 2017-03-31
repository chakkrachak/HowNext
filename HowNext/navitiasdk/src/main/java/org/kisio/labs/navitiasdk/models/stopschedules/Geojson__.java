
package org.kisio.labs.navitiasdk.models.stopschedules;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Geojson__ {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("coordinates")
    @Expose
    private List<Object> coordinates = new ArrayList<Object>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Object> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Object> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(coordinates).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Geojson__) == false) {
            return false;
        }
        Geojson__ rhs = ((Geojson__) other);
        return new EqualsBuilder().append(type, rhs.type).append(coordinates, rhs.coordinates).isEquals();
    }

}
