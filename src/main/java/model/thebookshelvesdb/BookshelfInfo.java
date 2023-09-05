package model.thebookshelvesdb;

public class BookshelfInfo {
    
    private final String kind;
    private final int id;
    private final String title;
    private final String access;
    private final String updated ;
    private final String created;
    private final int volumeCount;
    private final String volumesLastUpdated;
    
    public BookshelfInfo(String kind, int id, String title, String access, String updated,String created, int volumeCount, String volumesLastUpdated) {
        this.kind = kind;
        this.id = id;
        this.title = title;
        this.access = access;
        this.updated = updated;
        this.created= created;
        this.volumeCount= volumeCount;
        this.volumesLastUpdated= volumesLastUpdated;
    }

    public BookshelfInfo(Item theItem){

        this.kind= theItem.getKind();
        this.id=theItem.getId();
        this.title=theItem.getTitle();
        this.access=theItem.getAccess();
        this.updated=theItem.getUpdated();
        this.created=theItem.getCreated(); // to volume info einai antikeimeno mesa sto antikeimeno items
        this.volumeCount=theItem.getVolumeCount();
        this.volumesLastUpdated=theItem.getVolumesLastUpdated();
        
    }

	public String getKind() {
		return kind;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAccess() {
		return access;
	}

	public String getUpdated() {
		return updated;
	}

	public String getCreated() {
		return created;
	}

	public int getVolumeCount() {
		return volumeCount;
	}

	public String getVolumesLastUpdated() {
		return volumesLastUpdated;
	}
    
	 @Override
	    public String toString() {
	        return "BookInfo{" +
	                "kind='" + kind + '\'' +
	                ", id='" + id + '\'' +
	                ", etag='" + title + '\'' +
	                ", selflink='" + access + '\'' +
	                ", volume=" +  updated+ '\'' +
	                ", title=" + created + '\'' +
	                ", title=" + volumeCount + '\'' +
	                ", title=" + volumesLastUpdated + '\'' +
	                '}';
}}

