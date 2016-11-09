package WorkInClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleNotepad implements Notepad {

	private List<Page> pages;

	public SimpleNotepad() {
		this.pages = new ArrayList<>();
	}

	@Override
	public Page createPage(String title, String text) {

		Page curntPage = new Page();
		curntPage.setTitle(title);
		curntPage.addText(text);
		pages.add(curntPage);
		curntPage.setPageNumber(this.pages.size());
		return curntPage;

	}

	@Override
	public void replaceText(int PageNumber, String text) {
		Page foundPage = findPage(PageNumber);
		foundPage.removeText();
		foundPage.addText(text);

	}

	@Override
	public void deleteText(int PageNumber) {
		findPage(PageNumber).removeText();

	}

	@Override
	public void viewPages() {
		for (Page page : pages) {
			System.out.println(page.viewPage());

		}

	}

	private Page findPage(int pageNumber) {
		for (Page page : pages) {
			if (page.getPageNumber() == pageNumber) {
				return page;

			}

		}
		return null;

	}

}
