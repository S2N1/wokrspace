package bg.pragmatic.lecture14nestedpageobjects;

import org.openqa.selenium.support.PageFactory;

public class HomePage {

	static String url = "http://shop.pragmatic.bg/";
   
    public HomePage() {
    	PageFactory.initElements(Browser.driver(), this);
    }
    
    public void close() {
    	Browser.quit();
    }
    
    public void open(){
    	Browser.driver().get(url);
    }
    
    public Search search() {
    	Search search = new Search();
    	return search;
    }
}