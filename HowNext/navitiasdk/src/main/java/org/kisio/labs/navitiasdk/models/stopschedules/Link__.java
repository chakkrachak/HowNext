
package org.kisio.labs.navitiasdk.models.stopschedules;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Link__ {

    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("rel")
    @Expose
    private String rel;
    @SerializedName("templated")
    @Expose
    private Boolean templated;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public Boolean getTemplated() {
        return templated;
    }

    public void setTemplated(Boolean templated) {
        this.templated = templated;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(href).append(type).append(rel).append(templated).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Link__) == false) {
            return false;
        }
        Link__ rhs = ((Link__) other);
        return new EqualsBuilder().append(href, rhs.href).append(type, rhs.type).append(rel, rhs.rel).append(templated, rhs.templated).isEquals();
    }

}
