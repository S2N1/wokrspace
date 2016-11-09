package WorkInClass;

public class Page {

	private String title;
	private String text;
	private int pageNumber;

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void addText(String text) {

		this.text += text;

	}

	public void removeText() {

		this.text = "";

	}

	public String viewPage() {

		return this.title + "\n" + this.text;

	}

}
