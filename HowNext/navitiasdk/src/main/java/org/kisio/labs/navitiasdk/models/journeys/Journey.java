
package org.kisio.labs.navitiasdk.models.journeys;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Journey {

    @SerializedName("fare")
    @Expose
    private Fare fare;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("tags")
    @Expose
    private List<String> tags = new ArrayList<String>();
    @SerializedName("nb_transfers")
    @Expose
    private Integer nbTransfers;
    @SerializedName("durations")
    @Expose
    private Durations durations;
    @SerializedName("arrival_date_time")
    @Expose
    private String arrivalDateTime;
    @SerializedName("calendars")
    @Expose
    private List<Calendar> calendars = new ArrayList<Calendar>();
    @SerializedName("departure_date_time")
    @Expose
    private String departureDateTime;
    @SerializedName("requested_date_time")
    @Expose
    private String requestedDateTime;
    @SerializedName("sections")
    @Expose
    private List<Section> sections = new ArrayList<Section>();
    @SerializedName("co2_emission")
    @Expose
    private Co2Emission_ co2Emission;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("type")
    @Expose
    private String type;

    public Fare getFare() {
        return fare;
    }

    public void setFare(Fare fare) {
        this.fare = fare;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getNbTransfers() {
        return nbTransfers;
    }

    public void setNbTransfers(Integer nbTransfers) {
        this.nbTransfers = nbTransfers;
    }

    public Durations getDurations() {
        return durations;
    }

    public void setDurations(Durations durations) {
        this.durations = durations;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public List<Calendar> getCalendars() {
        return calendars;
    }

    public void setCalendars(List<Calendar> calendars) {
        this.calendars = calendars;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getRequestedDateTime() {
        return requestedDateTime;
    }

    public void setRequestedDateTime(String requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public Co2Emission_ getCo2Emission() {
        return co2Emission;
    }

    public void setCo2Emission(Co2Emission_ co2Emission) {
        this.co2Emission = co2Emission;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fare).append(status).append(tags).append(nbTransfers).append(durations).append(arrivalDateTime).append(calendars).append(departureDateTime).append(requestedDateTime).append(sections).append(co2Emission).append(duration).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Journey) == false) {
            return false;
        }
        Journey rhs = ((Journey) other);
        return new EqualsBuilder().append(fare, rhs.fare).append(status, rhs.status).append(tags, rhs.tags).append(nbTransfers, rhs.nbTransfers).append(durations, rhs.durations).append(arrivalDateTime, rhs.arrivalDateTime).append(calendars, rhs.calendars).append(departureDateTime, rhs.departureDateTime).append(requestedDateTime, rhs.requestedDateTime).append(sections, rhs.sections).append(co2Emission, rhs.co2Emission).append(duration, rhs.duration).append(type, rhs.type).isEquals();
    }

}
