package bg.pragmatic.lecture14nestedpageobjects;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest {

	
	@Before
	public void setUp(){
		Browser.browserInit();
	}
	
	
	@Test
	public void testProductSearch()
	{
		//Create an instance of Home page 
		HomePage homePage = new HomePage();
		
		//Navigate to the Home page
		homePage.open();
		
		//Search for 'samsung', the searchInStore method will return
		//SearchResults class
		
		Search searchInput = homePage.search();
		SearchResults searchResult = searchInput.searchInStore("samsung");

		
		//Verify there are 2 products available with this search
		assertEquals(3, searchResult.getProducts().size());
		assertTrue(searchResult.getProducts().get(2).contains("Samsung SyncMaster 941BW"));
		assertTrue(searchResult.getProducts().get(1).contains("Samsung Galaxy Tab 10.1"));
		
		//Close the Search result page
		//searchResult.close();
	}
	
//	@After
//	public void tearDown(){
//		Browser.quit();
//	}
}
