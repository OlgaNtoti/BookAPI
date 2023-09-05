package model;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;

import model.thebookdb.Item;
import model.thebookdb.VolumeInfo;
import model.thebookdb.BookResult;
public class BooksRes {
	private String kind;
    private  String id;
    private  String etag;
    private  String selfLink;
    private String title;
    private final List<String> authors;
    private final String publisher;
    private final String description;

    public BooksRes() {
        this.kind = getKind();
        this.id = getId();
        this.etag = getEtag();
        this.selfLink = getSelfLink();
        this.title=getTitle();
        this.authors = getAuthors();
        this.publisher = getPublisher();
        this.description = getDescription();
    
    }

    public BooksRes(Item theItem){
        this.kind=theItem.getKind();
        this.id=theItem.getId();
        this.etag=theItem.getEtag();
        this.selfLink=theItem.getSelfLink();
        this.title = getTitle();
        this.authors = getAuthors();
        this.publisher = getPublisher();
        this.description = getDescription();
    }

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

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    public List<String> getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDescription() {
        return description;
    }

}
