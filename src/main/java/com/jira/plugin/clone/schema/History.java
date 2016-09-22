package com.jira.plugin.clone.schema;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Change History
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class History {

    @SerializedName("id")
    @Expose
    private String id;
    /**
     * User
     * <p>
     * 
     * 
     */
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("items")
    @Expose
    private List<Item> items = new ArrayList<Item>();
    /**
     * History Metadata
     * <p>
     * 
     * 
     */
    @SerializedName("historyMetadata")
    @Expose
    private HistoryMetadata historyMetadata;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * User
     * <p>
     * 
     * 
     * @return
     *     The author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * User
     * <p>
     * 
     * 
     * @param author
     *     The author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * 
     * @return
     *     The created
     */
    public String getCreated() {
        return created;
    }

    /**
     * 
     * @param created
     *     The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * 
     * @return
     *     The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * History Metadata
     * <p>
     * 
     * 
     * @return
     *     The historyMetadata
     */
    public HistoryMetadata getHistoryMetadata() {
        return historyMetadata;
    }

    /**
     * History Metadata
     * <p>
     * 
     * 
     * @param historyMetadata
     *     The historyMetadata
     */
    public void setHistoryMetadata(HistoryMetadata historyMetadata) {
        this.historyMetadata = historyMetadata;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(author).append(created).append(items).append(historyMetadata).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof History) == false) {
            return false;
        }
        History rhs = ((History) other);
        return new EqualsBuilder().append(id, rhs.id).append(author, rhs.author).append(created, rhs.created).append(items, rhs.items).append(historyMetadata, rhs.historyMetadata).isEquals();
    }

}
