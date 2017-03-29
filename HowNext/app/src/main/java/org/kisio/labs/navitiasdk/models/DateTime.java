
package org.kisio.labs.navitiasdk.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DateTime {

    @SerializedName("date_time")
    @Expose
    private String dateTime;
    @SerializedName("additional_informations")
    @Expose
    private List<Object> additionalInformations = new ArrayList<Object>();
    @SerializedName("links")
    @Expose
    private List<Link_> links = new ArrayList<Link_>();
    @SerializedName("data_freshness")
    @Expose
    private String dataFreshness;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public List<Object> getAdditionalInformations() {
        return additionalInformations;
    }

    public void setAdditionalInformations(List<Object> additionalInformations) {
        this.additionalInformations = additionalInformations;
    }

    public List<Link_> getLinks() {
        return links;
    }

    public void setLinks(List<Link_> links) {
        this.links = links;
    }

    public String getDataFreshness() {
        return dataFreshness;
    }

    public void setDataFreshness(String dataFreshness) {
        this.dataFreshness = dataFreshness;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dateTime).append(additionalInformations).append(links).append(dataFreshness).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DateTime) == false) {
            return false;
        }
        DateTime rhs = ((DateTime) other);
        return new EqualsBuilder().append(dateTime, rhs.dateTime).append(additionalInformations, rhs.additionalInformations).append(links, rhs.links).append(dataFreshness, rhs.dataFreshness).isEquals();
    }

}
