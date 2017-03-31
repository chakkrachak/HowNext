
package org.kisio.labs.navitiasdk.models.journeys;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Section {

    @SerializedName("from")
    @Expose
    private From from;
    @SerializedName("links")
    @Expose
    private List<Link_> links = new ArrayList<Link_>();
    @SerializedName("arrival_date_time")
    @Expose
    private String arrivalDateTime;
    @SerializedName("co2_emission")
    @Expose
    private Co2Emission co2Emission;
    @SerializedName("to")
    @Expose
    private To to;
    @SerializedName("departure_date_time")
    @Expose
    private String departureDateTime;
    @SerializedName("geojson")
    @Expose
    private Geojson geojson;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("path")
    @Expose
    private List<Path> path = new ArrayList<Path>();
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("mode")
    @Expose
    private String mode;
    @SerializedName("additional_informations")
    @Expose
    private List<String> additionalInformations = new ArrayList<String>();
    @SerializedName("display_informations")
    @Expose
    private DisplayInformations displayInformations;
    @SerializedName("base_arrival_date_time")
    @Expose
    private String baseArrivalDateTime;
    @SerializedName("base_departure_date_time")
    @Expose
    private String baseDepartureDateTime;
    @SerializedName("stop_date_times")
    @Expose
    private List<StopDateTime> stopDateTimes = new ArrayList<StopDateTime>();
    @SerializedName("transfer_type")
    @Expose
    private String transferType;

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    public List<Link_> getLinks() {
        return links;
    }

    public void setLinks(List<Link_> links) {
        this.links = links;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Co2Emission getCo2Emission() {
        return co2Emission;
    }

    public void setCo2Emission(Co2Emission co2Emission) {
        this.co2Emission = co2Emission;
    }

    public To getTo() {
        return to;
    }

    public void setTo(To to) {
        this.to = to;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public Geojson getGeojson() {
        return geojson;
    }

    public void setGeojson(Geojson geojson) {
        this.geojson = geojson;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public List<Path> getPath() {
        return path;
    }

    public void setPath(List<Path> path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public List<String> getAdditionalInformations() {
        return additionalInformations;
    }

    public void setAdditionalInformations(List<String> additionalInformations) {
        this.additionalInformations = additionalInformations;
    }

    public DisplayInformations getDisplayInformations() {
        return displayInformations;
    }

    public void setDisplayInformations(DisplayInformations displayInformations) {
        this.displayInformations = displayInformations;
    }

    public String getBaseArrivalDateTime() {
        return baseArrivalDateTime;
    }

    public void setBaseArrivalDateTime(String baseArrivalDateTime) {
        this.baseArrivalDateTime = baseArrivalDateTime;
    }

    public String getBaseDepartureDateTime() {
        return baseDepartureDateTime;
    }

    public void setBaseDepartureDateTime(String baseDepartureDateTime) {
        this.baseDepartureDateTime = baseDepartureDateTime;
    }

    public List<StopDateTime> getStopDateTimes() {
        return stopDateTimes;
    }

    public void setStopDateTimes(List<StopDateTime> stopDateTimes) {
        this.stopDateTimes = stopDateTimes;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(from).append(links).append(arrivalDateTime).append(co2Emission).append(to).append(departureDateTime).append(geojson).append(duration).append(path).append(type).append(id).append(mode).append(additionalInformations).append(displayInformations).append(baseArrivalDateTime).append(baseDepartureDateTime).append(stopDateTimes).append(transferType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Section) == false) {
            return false;
        }
        Section rhs = ((Section) other);
        return new EqualsBuilder().append(from, rhs.from).append(links, rhs.links).append(arrivalDateTime, rhs.arrivalDateTime).append(co2Emission, rhs.co2Emission).append(to, rhs.to).append(departureDateTime, rhs.departureDateTime).append(geojson, rhs.geojson).append(duration, rhs.duration).append(path, rhs.path).append(type, rhs.type).append(id, rhs.id).append(mode, rhs.mode).append(additionalInformations, rhs.additionalInformations).append(displayInformations, rhs.displayInformations).append(baseArrivalDateTime, rhs.baseArrivalDateTime).append(baseDepartureDateTime, rhs.baseDepartureDateTime).append(stopDateTimes, rhs.stopDateTimes).append(transferType, rhs.transferType).isEquals();
    }

}
