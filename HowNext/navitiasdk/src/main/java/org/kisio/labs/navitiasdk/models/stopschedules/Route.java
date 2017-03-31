
package org.kisio.labs.navitiasdk.models.stopschedules;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Route {

    @SerializedName("direction")
    @Expose
    private Direction direction;
    @SerializedName("codes")
    @Expose
    private List<Code___> codes = new ArrayList<Code___>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("links")
    @Expose
    private List<Object> links = new ArrayList<Object>();
    @SerializedName("is_frequence")
    @Expose
    private String isFrequence;
    @SerializedName("geojson")
    @Expose
    private Geojson geojson;
    @SerializedName("direction_type")
    @Expose
    private String directionType;
    @SerializedName("line")
    @Expose
    private Line line;
    @SerializedName("id")
    @Expose
    private String id;

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public List<Code___> getCodes() {
        return codes;
    }

    public void setCodes(List<Code___> codes) {
        this.codes = codes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getLinks() {
        return links;
    }

    public void setLinks(List<Object> links) {
        this.links = links;
    }

    public String getIsFrequence() {
        return isFrequence;
    }

    public void setIsFrequence(String isFrequence) {
        this.isFrequence = isFrequence;
    }

    public Geojson getGeojson() {
        return geojson;
    }

    public void setGeojson(Geojson geojson) {
        this.geojson = geojson;
    }

    public String getDirectionType() {
        return directionType;
    }

    public void setDirectionType(String directionType) {
        this.directionType = directionType;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
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
        return new HashCodeBuilder().append(direction).append(codes).append(name).append(links).append(isFrequence).append(geojson).append(directionType).append(line).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Route) == false) {
            return false;
        }
        Route rhs = ((Route) other);
        return new EqualsBuilder().append(direction, rhs.direction).append(codes, rhs.codes).append(name, rhs.name).append(links, rhs.links).append(isFrequence, rhs.isFrequence).append(geojson, rhs.geojson).append(directionType, rhs.directionType).append(line, rhs.line).append(id, rhs.id).isEquals();
    }

}
