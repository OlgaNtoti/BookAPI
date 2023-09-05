
package model;

import java.util.List;

import model.thebookdb.BookResult;

import model.thebookdb.Item;
import model.thebookdb.VolumeInfo;
import model.thebookdb.BookResult;

public class BookInfo {

    private final String kind;
    private final String id;
    private final String etag;
    private final String selflink;
    private final VolumeInfo volume;
    private final String title;
    private final List<String >authors;
    private final String publisher;
    private final String description;
    

    public BookInfo(String kind, String id, String etag, String selflink, VolumeInfo volume,String title,List<String> authors,String publisher,String description) {
        this.kind = kind;
        this.id = id;
        this.etag = etag;
        this.selflink = selflink;
        this.volume = volume;
        this.title = title;
        this.authors = authors;
        this.publisher= publisher;
        this.description=description;
    }

    public BookInfo(Item theItem){

        this.kind= theItem.getKind();
        this.id=theItem.getId();
        this.etag=theItem.getEtag();
        this.selflink=theItem.getSelfLink();
        this.volume=theItem.getVolumeInfo();
        this.title=theItem.getTitle();
        this.authors=volume.getAuthors();
        this.publisher=volume.getPublisher();
        this.description=volume.getDescription();
    }
    public String getTitle() {

        return title;
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

    public String getKind() {

        return kind;
    }

    public String getId() {
        return id;
    }

    public String getEtag() {
        return etag;
    }

    public String getSelflink() {
        return selflink;
    }

    public VolumeInfo getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "kind='" + kind + '\n'+ 
                ", id='" + id + '\n' +
                ", etag='" + etag + '\n'+
                ", selflink='" + selflink + '\n'+
                ", volume=" + volume +'\n'+
                ", title="+title+'\n'+
                ", authors="+authors+'\n'+
                ", publisher="+publisher+'\n'+
                ", description="+description+'\n'+
                '}';
    }
}
