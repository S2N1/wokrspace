package WorkInClass;

public interface Notepad {

	public Page createPage(String title, String Text);

	public void replaceText(int PageNumber, String text);

	public void deleteText(int PageNumber);

	public void viewPages();


}
