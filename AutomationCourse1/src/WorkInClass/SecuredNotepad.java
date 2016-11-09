package WorkInClass;

public class SecuredNotepad extends SimpleNotepad {

	private String password;

	SecuredNotepad(String password) {
		this.password = password;
	}

	@Override
	public Page createPage(String title, String text) {
		// TODO Auto-generated method stub
		return super.createPage(title, text);
	}

	@Override
	public void replaceText(int PageNumber, String text) {
		// TODO Auto-generated method stub
		super.replaceText(PageNumber, text);
	}

	@Override
	public void deleteText(int PageNumber) {
		// TODO Auto-generated method stub
		super.deleteText(PageNumber);
	}

	@Override
	public void viewPages() {
		// TODO Auto-generated method stub
		super.viewPages();
	}

	
	//private boolean verifyPass(){
		
	}
