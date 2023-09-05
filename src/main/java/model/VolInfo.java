package model;

import model.thebookdb.VolumeInfo;

import java.util.List;

public class VolInfo {
    private final String title;
    private final List<String> authors;
    private final String publisher;
    private final String description;

    public VolInfo() {
        this.title = getTitle();
        this.authors = getAuthors();
        this.publisher = getPublisher();
        this.description = getDescription();
    }

    public VolInfo(VolumeInfo theVol){
        this.title=theVol.getTitle();
        this.authors=theVol.getAuthors();
        this.publisher=theVol.getPublisher();
        this.description=theVol.getDescription();
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
}