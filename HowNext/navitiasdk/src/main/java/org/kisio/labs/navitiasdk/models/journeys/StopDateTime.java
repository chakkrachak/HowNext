
package org.kisio.labs.navitiasdk.models.journeys;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class StopDateTime {

    @SerializedName("stop_point")
    @Expose
    private StopPoint__ stopPoint;
    @SerializedName("links")
    @Expose
    private List<Object> links = new ArrayList<Object>();
    @SerializedName("arrival_date_time")
    @Expose
    private String arrivalDateTime;
    @SerializedName("additional_informations")
    @Expose
    private List<Object> additionalInformations = new ArrayList<Object>();
    @SerializedName("departure_date_time")
    @Expose
    private String departureDateTime;
    @SerializedName("base_arrival_date_time")
    @Expose
    private String baseArrivalDateTime;
    @SerializedName("base_departure_date_time")
    @Expose
    private String baseDepartureDateTime;

    public StopPoint__ getStopPoint() {
        return stopPoint;
    }

    public void setStopPoint(StopPoint__ stopPoint) {
        this.stopPoint = stopPoint;
    }

    public List<Object> getLinks() {
        return links;
    }

    public void setLinks(List<Object> links) {
        this.links = links;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public List<Object> getAdditionalInformations() {
        return additionalInformations;
    }

    public void setAdditionalInformations(List<Object> additionalInformations) {
        this.additionalInformations = additionalInformations;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stopPoint).append(links).append(arrivalDateTime).append(additionalInformations).append(departureDateTime).append(baseArrivalDateTime).append(baseDepartureDateTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StopDateTime) == false) {
            return false;
        }
        StopDateTime rhs = ((StopDateTime) other);
        return new EqualsBuilder().append(stopPoint, rhs.stopPoint).append(links, rhs.links).append(arrivalDateTime, rhs.arrivalDateTime).append(additionalInformations, rhs.additionalInformations).append(departureDateTime, rhs.departureDateTime).append(baseArrivalDateTime, rhs.baseArrivalDateTime).append(baseDepartureDateTime, rhs.baseDepartureDateTime).isEquals();
    }

}
