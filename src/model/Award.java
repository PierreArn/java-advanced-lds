package model;

public class Award {
	private String id;
	private String title;
	private int year;
	
	public Award(String id, String title, int year) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Award [id=" + id + ", title=" + title + ", year=" + year + "]";
	}


}
