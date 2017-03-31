
package org.kisio.labs.navitiasdk.models.stopschedules;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class StopSchedulesResponse {

    @SerializedName("stop_schedules")
    @Expose
    private List<StopSchedule> stopSchedules = new ArrayList<StopSchedule>();
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("links")
    @Expose
    private List<Link__> links = new ArrayList<Link__>();
    @SerializedName("disruptions")
    @Expose
    private List<Object> disruptions = new ArrayList<Object>();
    @SerializedName("notes")
    @Expose
    private List<Object> notes = new ArrayList<Object>();
    @SerializedName("feed_publishers")
    @Expose
    private List<FeedPublisher> feedPublishers = new ArrayList<FeedPublisher>();
    @SerializedName("exceptions")
    @Expose
    private List<Object> exceptions = new ArrayList<Object>();

    public List<StopSchedule> getStopSchedules() {
        return stopSchedules;
    }

    public void setStopSchedules(List<StopSchedule> stopSchedules) {
        this.stopSchedules = stopSchedules;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<Link__> getLinks() {
        return links;
    }

    public void setLinks(List<Link__> links) {
        this.links = links;
    }

    public List<Object> getDisruptions() {
        return disruptions;
    }

    public void setDisruptions(List<Object> disruptions) {
        this.disruptions = disruptions;
    }

    public List<Object> getNotes() {
        return notes;
    }

    public void setNotes(List<Object> notes) {
        this.notes = notes;
    }

    public List<FeedPublisher> getFeedPublishers() {
        return feedPublishers;
    }

    public void setFeedPublishers(List<FeedPublisher> feedPublishers) {
        this.feedPublishers = feedPublishers;
    }

    public List<Object> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<Object> exceptions) {
        this.exceptions = exceptions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stopSchedules).append(pagination).append(links).append(disruptions).append(notes).append(feedPublishers).append(exceptions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StopSchedulesResponse) == false) {
            return false;
        }
        StopSchedulesResponse rhs = ((StopSchedulesResponse) other);
        return new EqualsBuilder().append(stopSchedules, rhs.stopSchedules).append(pagination, rhs.pagination).append(links, rhs.links).append(disruptions, rhs.disruptions).append(notes, rhs.notes).append(feedPublishers, rhs.feedPublishers).append(exceptions, rhs.exceptions).isEquals();
    }

}
