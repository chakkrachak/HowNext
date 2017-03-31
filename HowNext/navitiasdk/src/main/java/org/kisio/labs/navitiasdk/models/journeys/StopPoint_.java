
package org.kisio.labs.navitiasdk.models.journeys;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class StopPoint_ {

    @SerializedName("codes")
    @Expose
    private List<Code__> codes = new ArrayList<Code__>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("links")
    @Expose
    private List<Object> links = new ArrayList<Object>();
    @SerializedName("physical_modes")
    @Expose
    private List<PhysicalMode_> physicalModes = new ArrayList<PhysicalMode_>();
    @SerializedName("coord")
    @Expose
    private Coord______ coord;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("equipments")
    @Expose
    private List<Object> equipments = new ArrayList<Object>();
    @SerializedName("commercial_modes")
    @Expose
    private List<CommercialMode_> commercialModes = new ArrayList<CommercialMode_>();
    @SerializedName("administrative_regions")
    @Expose
    private List<AdministrativeRegion___> administrativeRegions = new ArrayList<AdministrativeRegion___>();
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("stop_area")
    @Expose
    private StopArea_ stopArea;

    public List<Code__> getCodes() {
        return codes;
    }

    public void setCodes(List<Code__> codes) {
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

    public List<PhysicalMode_> getPhysicalModes() {
        return physicalModes;
    }

    public void setPhysicalModes(List<PhysicalMode_> physicalModes) {
        this.physicalModes = physicalModes;
    }

    public Coord______ getCoord() {
        return coord;
    }

    public void setCoord(Coord______ coord) {
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

    public List<CommercialMode_> getCommercialModes() {
        return commercialModes;
    }

    public void setCommercialModes(List<CommercialMode_> commercialModes) {
        this.commercialModes = commercialModes;
    }

    public List<AdministrativeRegion___> getAdministrativeRegions() {
        return administrativeRegions;
    }

    public void setAdministrativeRegions(List<AdministrativeRegion___> administrativeRegions) {
        this.administrativeRegions = administrativeRegions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StopArea_ getStopArea() {
        return stopArea;
    }

    public void setStopArea(StopArea_ stopArea) {
        this.stopArea = stopArea;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codes).append(name).append(links).append(physicalModes).append(coord).append(label).append(equipments).append(commercialModes).append(administrativeRegions).append(id).append(stopArea).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StopPoint_) == false) {
            return false;
        }
        StopPoint_ rhs = ((StopPoint_) other);
        return new EqualsBuilder().append(codes, rhs.codes).append(name, rhs.name).append(links, rhs.links).append(physicalModes, rhs.physicalModes).append(coord, rhs.coord).append(label, rhs.label).append(equipments, rhs.equipments).append(commercialModes, rhs.commercialModes).append(administrativeRegions, rhs.administrativeRegions).append(id, rhs.id).append(stopArea, rhs.stopArea).isEquals();
    }

}
