package object_repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Ganesh N Bhat
 */
public class Homepage {
/**
 * This method gives Homepage locators values
 */
	
	
	@FindBy(partialLinkText = "Books")
	private WebElement Bookslinks;
	
	//@FindBy(partialLinkText = "Computers")
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Computers')]")
	private WebElement Computerslink;
	
	@FindBy (xpath = "//ul[@class='top-menu']//a[contains(text(),'Desktops')]")
	private WebElement clickondropdownofcomputerlink;

	@FindBy(partialLinkText = "Electronics")
	private WebElement Electronicslink;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Notebooks')]")
	private WebElement clickonnotebooklink;
	
	@FindBy(xpath = "//ul[@class='top-menu']/..//a[contains(text(),'Accessories')]")
	private WebElement accessorieslink;
	
	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement ApparelShoeslink;
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement Digitaldownloadslink;
	
	@FindBy(partialLinkText = "Jewelry")
	private WebElement Jewelrylinks;
	
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement GiftCardslink;
	
	@FindBy(partialLinkText = "Log out")
	private WebElement Logoutlink;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBookslinks() {
		return Bookslinks;
	}

	public WebElement getComputerslink() {
		return Computerslink;
	}

	
	
	public WebElement getElectronicslink() {
		return Electronicslink;
	}

	public WebElement getApparelShoeslink() {
		return ApparelShoeslink;
	}

	public WebElement getDigitaldownloadslink() {
		return Digitaldownloadslink;
	}

	public WebElement getJewelrylinks() {
		return Jewelrylinks;
	}

	public WebElement getGiftCardslink() {
		return GiftCardslink;
	}

	public WebElement getLogoutlink() {
		return Logoutlink;
	}
	

	public WebElement getClickondropdownofcomputerlink() {
		return clickondropdownofcomputerlink;
	}

	public WebElement getClickonnotebooklink() {
		return clickonnotebooklink;
	}

	public WebElement getAccessorieslink() {
		return accessorieslink;
	}


	
}
