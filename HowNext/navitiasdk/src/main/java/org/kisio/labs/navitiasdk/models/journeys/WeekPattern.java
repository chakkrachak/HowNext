
package org.kisio.labs.navitiasdk.models.journeys;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class WeekPattern {

    @SerializedName("monday")
    @Expose
    private Boolean monday;
    @SerializedName("tuesday")
    @Expose
    private Boolean tuesday;
    @SerializedName("friday")
    @Expose
    private Boolean friday;
    @SerializedName("wednesday")
    @Expose
    private Boolean wednesday;
    @SerializedName("thursday")
    @Expose
    private Boolean thursday;
    @SerializedName("sunday")
    @Expose
    private Boolean sunday;
    @SerializedName("saturday")
    @Expose
    private Boolean saturday;

    public Boolean getMonday() {
        return monday;
    }

    public void setMonday(Boolean monday) {
        this.monday = monday;
    }

    public Boolean getTuesday() {
        return tuesday;
    }

    public void setTuesday(Boolean tuesday) {
        this.tuesday = tuesday;
    }

    public Boolean getFriday() {
        return friday;
    }

    public void setFriday(Boolean friday) {
        this.friday = friday;
    }

    public Boolean getWednesday() {
        return wednesday;
    }

    public void setWednesday(Boolean wednesday) {
        this.wednesday = wednesday;
    }

    public Boolean getThursday() {
        return thursday;
    }

    public void setThursday(Boolean thursday) {
        this.thursday = thursday;
    }

    public Boolean getSunday() {
        return sunday;
    }

    public void setSunday(Boolean sunday) {
        this.sunday = sunday;
    }

    public Boolean getSaturday() {
        return saturday;
    }

    public void setSaturday(Boolean saturday) {
        this.saturday = saturday;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(monday).append(tuesday).append(friday).append(wednesday).append(thursday).append(sunday).append(saturday).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WeekPattern) == false) {
            return false;
        }
        WeekPattern rhs = ((WeekPattern) other);
        return new EqualsBuilder().append(monday, rhs.monday).append(tuesday, rhs.tuesday).append(friday, rhs.friday).append(wednesday, rhs.wednesday).append(thursday, rhs.thursday).append(sunday, rhs.sunday).append(saturday, rhs.saturday).isEquals();
    }

}
