
package org.kisio.labs.navitiasdk.models.journeys;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class StopPoint__ {

    @SerializedName("codes")
    @Expose
    private List<Code____> codes = new ArrayList<Code____>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("links")
    @Expose
    private List<Object> links = new ArrayList<Object>();
    @SerializedName("coord")
    @Expose
    private Coord____________ coord;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("equipments")
    @Expose
    private List<Object> equipments = new ArrayList<Object>();
    @SerializedName("id")
    @Expose
    private String id;

    public List<Code____> getCodes() {
        return codes;
    }

    public void setCodes(List<Code____> codes) {
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

    public Coord____________ getCoord() {
        return coord;
    }

    public void setCoord(Coord____________ coord) {
        this.coord = coord;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Object> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Object> equipments) {
        this.equipments = equipments;
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
        return new HashCodeBuilder().append(codes).append(name).append(links).append(coord).append(label).append(equipments).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StopPoint__) == false) {
            return false;
        }
        StopPoint__ rhs = ((StopPoint__) other);
        return new EqualsBuilder().append(codes, rhs.codes).append(name, rhs.name).append(links, rhs.links).append(coord, rhs.coord).append(label, rhs.label).append(equipments, rhs.equipments).append(id, rhs.id).isEquals();
    }

}
