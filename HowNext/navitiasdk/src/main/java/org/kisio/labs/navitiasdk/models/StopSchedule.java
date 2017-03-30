
package org.kisio.labs.navitiasdk.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class StopSchedule {

    @SerializedName("stop_point")
    @Expose
    private StopPoint stopPoint;
    @SerializedName("links")
    @Expose
    private List<Link> links = new ArrayList<Link>();
    @SerializedName("date_times")
    @Expose
    private List<DateTime> dateTimes = new ArrayList<DateTime>();
    @SerializedName("route")
    @Expose
    private Route route;
    @SerializedName("additional_informations")
    @Expose
    private Object additionalInformations;
    @SerializedName("display_informations")
    @Expose
    private DisplayInformations displayInformations;

    public StopPoint getStopPoint() {
        return stopPoint;
    }

    public void setStopPoint(StopPoint stopPoint) {
        this.stopPoint = stopPoint;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<DateTime> getDateTimes() {
        return dateTimes;
    }

    public void setDateTimes(List<DateTime> dateTimes) {
        this.dateTimes = dateTimes;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Object getAdditionalInformations() {
        return additionalInformations;
    }

    public void setAdditionalInformations(Object additionalInformations) {
        this.additionalInformations = additionalInformations;
    }

    public DisplayInformations getDisplayInformations() {
        return displayInformations;
    }

    public void setDisplayInformations(DisplayInformations displayInformations) {
        this.displayInformations = displayInformations;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stopPoint).append(links).append(dateTimes).append(route).append(additionalInformations).append(displayInformations).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StopSchedule) == false) {
            return false;
        }
        StopSchedule rhs = ((StopSchedule) other);
        return new EqualsBuilder().append(stopPoint, rhs.stopPoint).append(links, rhs.links).append(dateTimes, rhs.dateTimes).append(route, rhs.route).append(additionalInformations, rhs.additionalInformations).append(displayInformations, rhs.displayInformations).isEquals();
    }

}
