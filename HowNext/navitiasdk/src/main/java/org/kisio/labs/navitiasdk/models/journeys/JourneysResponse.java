
package org.kisio.labs.navitiasdk.models.journeys;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class JourneysResponse {

    @SerializedName("tickets")
    @Expose
    private List<Object> tickets = new ArrayList<Object>();
    @SerializedName("links")
    @Expose
    private List<Link> links = new ArrayList<Link>();
    @SerializedName("journeys")
    @Expose
    private List<Journey> journeys = new ArrayList<Journey>();
    @SerializedName("disruptions")
    @Expose
    private List<Object> disruptions = new ArrayList<Object>();
    @SerializedName("notes")
    @Expose
    private List<Object> notes = new ArrayList<Object>();
    @SerializedName("feed_publishers")
    @Expose
    private List<FeedPublisher> feedPublishers = new ArrayList<FeedPublisher>();
    @SerializedName("context")
    @Expose
    private Context context;
    @SerializedName("exceptions")
    @Expose
    private List<Object> exceptions = new ArrayList<Object>();

    public List<Object> getTickets() {
        return tickets;
    }

    public void setTickets(List<Object> tickets) {
        this.tickets = tickets;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<Journey> getJourneys() {
        return journeys;
    }

    public void setJourneys(List<Journey> journeys) {
        this.journeys = journeys;
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

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
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
        return new HashCodeBuilder().append(tickets).append(links).append(journeys).append(disruptions).append(notes).append(feedPublishers).append(context).append(exceptions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JourneysResponse) == false) {
            return false;
        }
        JourneysResponse rhs = ((JourneysResponse) other);
        return new EqualsBuilder().append(tickets, rhs.tickets).append(links, rhs.links).append(journeys, rhs.journeys).append(disruptions, rhs.disruptions).append(notes, rhs.notes).append(feedPublishers, rhs.feedPublishers).append(context, rhs.context).append(exceptions, rhs.exceptions).isEquals();
    }

}
