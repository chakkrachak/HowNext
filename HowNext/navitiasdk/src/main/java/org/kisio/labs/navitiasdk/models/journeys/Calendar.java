
package org.kisio.labs.navitiasdk.models.journeys;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Calendar {

    @SerializedName("active_periods")
    @Expose
    private List<ActivePeriod> activePeriods = new ArrayList<ActivePeriod>();
    @SerializedName("week_pattern")
    @Expose
    private WeekPattern weekPattern;

    public List<ActivePeriod> getActivePeriods() {
        return activePeriods;
    }

    public void setActivePeriods(List<ActivePeriod> activePeriods) {
        this.activePeriods = activePeriods;
    }

    public WeekPattern getWeekPattern() {
        return weekPattern;
    }

    public void setWeekPattern(WeekPattern weekPattern) {
        this.weekPattern = weekPattern;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(activePeriods).append(weekPattern).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Calendar) == false) {
            return false;
        }
        Calendar rhs = ((Calendar) other);
        return new EqualsBuilder().append(activePeriods, rhs.activePeriods).append(weekPattern, rhs.weekPattern).isEquals();
    }

}
