
package org.kisio.labs.navitiasdk.models.journeys;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class StopPoint {

    @SerializedName("codes")
    @Expose
    private List<Code> codes = new ArrayList<Code>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("links")
    @Expose
    private List<Object> links = new ArrayList<Object>();
    @SerializedName("coord")
    @Expose
    private Coord__ coord;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("equipments")
    @Expose
    private List<Object> equipments = new ArrayList<Object>();
    @SerializedName("administrative_regions")
    @Expose
    private List<AdministrativeRegion_> administrativeRegions = new ArrayList<AdministrativeRegion_>();
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("stop_area")
    @Expose
    private StopArea stopArea;
    @SerializedName("physical_modes")
    @Expose
    private List<PhysicalMode> physicalModes = new ArrayList<PhysicalMode>();
    @SerializedName("commercial_modes")
    @Expose
    private List<CommercialMode> commercialModes = new ArrayList<CommercialMode>();

    public List<Code> getCodes() {
        return codes;
    }

    public void setCodes(List<Code> codes) {
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

    public Coord__ getCoord() {
        return coord;
    }

    public void setCoord(Coord__ coord) {
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

    public List<AdministrativeRegion_> getAdministrativeRegions() {
        return administrativeRegions;
    }

    public void setAdministrativeRegions(List<AdministrativeRegion_> administrativeRegions) {
        this.administrativeRegions = administrativeRegions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StopArea getStopArea() {
        return stopArea;
    }

    public void setStopArea(StopArea stopArea) {
        this.stopArea = stopArea;
    }

    public List<PhysicalMode> getPhysicalModes() {
        return physicalModes;
    }

    public void setPhysicalModes(List<PhysicalMode> physicalModes) {
        this.physicalModes = physicalModes;
    }

    public List<CommercialMode> getCommercialModes() {
        return commercialModes;
    }

    public void setCommercialModes(List<CommercialMode> commercialModes) {
        this.commercialModes = commercialModes;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codes).append(name).append(links).append(coord).append(label).append(equipments).append(administrativeRegions).append(id).append(stopArea).append(physicalModes).append(commercialModes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StopPoint) == false) {
            return false;
        }
        StopPoint rhs = ((StopPoint) other);
        return new EqualsBuilder().append(codes, rhs.codes).append(name, rhs.name).append(links, rhs.links).append(coord, rhs.coord).append(label, rhs.label).append(equipments, rhs.equipments).append(administrativeRegions, rhs.administrativeRegions).append(id, rhs.id).append(stopArea, rhs.stopArea).append(physicalModes, rhs.physicalModes).append(commercialModes, rhs.commercialModes).isEquals();
    }

}
