package reviewPackage;

public class Review {

	private long id;
	private String title;
	private String imageURL;
	private String content;

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageURL() {
		return imageURL;
	}

	public String getContent() {
		return content;
	}

	public Review(long id, String title, String imageURL, String content) {
		this.id = id;
		this.title = title;
		this.imageURL = imageURL;
		this.content = content;
	}


}
