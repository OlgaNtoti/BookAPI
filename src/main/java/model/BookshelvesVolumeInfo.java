package model;

public class BookshelvesVolumeInfo {
	private final String title;
	
	public BookshelvesVolumeInfo(String title) {
		this.title = title;
		
	}

	public String getTitle() {
		return title;
	}

	
	
	@Override
    public String toString() {
        return "ΒοοκInfo{" +
                "title='" + title +
                '}';
    }
	

}
