
package org.kisio.labs.navitiasdk.models.journeys;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Geojson {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("properties")
    @Expose
    private List<Property> properties = new ArrayList<Property>();
    @SerializedName("coordinates")
    @Expose
    private List<List<Double>> coordinates = new ArrayList<List<Double>>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public List<List<Double>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<List<Double>> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(properties).append(coordinates).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Geojson) == false) {
            return false;
        }
        Geojson rhs = ((Geojson) other);
        return new EqualsBuilder().append(type, rhs.type).append(properties, rhs.properties).append(coordinates, rhs.coordinates).isEquals();
    }

}
