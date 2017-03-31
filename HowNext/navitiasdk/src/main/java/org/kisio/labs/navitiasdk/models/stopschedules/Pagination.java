
package org.kisio.labs.navitiasdk.models.stopschedules;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Pagination {

    @SerializedName("start_page")
    @Expose
    private Integer startPage;
    @SerializedName("items_on_page")
    @Expose
    private Integer itemsOnPage;
    @SerializedName("items_per_page")
    @Expose
    private Integer itemsPerPage;
    @SerializedName("total_result")
    @Expose
    private Integer totalResult;

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getItemsOnPage() {
        return itemsOnPage;
    }

    public void setItemsOnPage(Integer itemsOnPage) {
        this.itemsOnPage = itemsOnPage;
    }

    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public Integer getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(Integer totalResult) {
        this.totalResult = totalResult;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(startPage).append(itemsOnPage).append(itemsPerPage).append(totalResult).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pagination) == false) {
            return false;
        }
        Pagination rhs = ((Pagination) other);
        return new EqualsBuilder().append(startPage, rhs.startPage).append(itemsOnPage, rhs.itemsOnPage).append(itemsPerPage, rhs.itemsPerPage).append(totalResult, rhs.totalResult).isEquals();
    }

}
