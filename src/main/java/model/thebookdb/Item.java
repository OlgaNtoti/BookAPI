package model.thebookdb;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"title",
    "kind",
    "id",
    "etag",
    "selfLink",
    "volumeInfo",
    "saleInfo",
    "accessInfo"
})
@Generated("jsonschema2pojo")
public class Item {
	
	@JsonProperty("title")
	private String title;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("id")
    private String id;
    @JsonProperty("etag")
    private String etag;
    @JsonProperty("selfLink")
    private String selfLink;
    @JsonProperty("volumeInfo")
    private VolumeInfo volumeInfo;
    @JsonProperty("saleInfo")
    private SaleInfo saleInfo;
    @JsonProperty("accessInfo")
    private AccessInfo accessInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("etag")
    public String getEtag() {
        return etag;
    }

    @JsonProperty("etag")
    public void setEtag(String etag) {
        this.etag = etag;
    }

    @JsonProperty("selfLink")
    public String getSelfLink() {
        return selfLink;
    }

    @JsonProperty("selfLink")
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    @JsonProperty("volumeInfo")
    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    @JsonProperty("volumeInfo")
    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    @JsonProperty("saleInfo")
    public SaleInfo getSaleInfo() {
        return saleInfo;
    }

    @JsonProperty("saleInfo")
    public void setSaleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    @JsonProperty("accessInfo")
    public AccessInfo getAccessInfo() {
        return accessInfo;
    }

    @JsonProperty("accessInfo")
    public void setAccessInfo(AccessInfo accessInfo) {
        this.accessInfo = accessInfo;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title){
        this.title = title;
    }

}