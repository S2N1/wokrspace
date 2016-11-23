package bg.pragmatic.lecture14nestedpageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchResults {

	public SearchResults(){
		PageFactory.initElements(Browser.driver(),this);
	}
	
	public List<String> getProducts() {
		List<String> products = new ArrayList<String>();
		List<WebElement> productList = Browser.driver().findElements(By.cssSelector("div.product-list > div"));
		for(WebElement item : productList) {
			products.add(item.findElement(By.cssSelector(".name > a")).getText());
		}
		return products;
	}
	
	public void close() {
    	Browser.quit();
    }
	
	 public Search Search() {
	    	Search search = new Search();
	    	return search;
	 }
}
