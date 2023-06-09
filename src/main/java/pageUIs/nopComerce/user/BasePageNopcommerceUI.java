package pageUIs.nopComerce.user;

public class BasePageNopcommerceUI {
	public static final String ADDRESS_LINK = "Xpath=//div[contains(@class,'account-navigation')]//a[text()='Addresses']";
	public static final String MY_PRODUCT_REVIEW_LINK = "XPATH=//a[text()='My product reviews']";
	public static final String REWARD_POINT_LINK = "xpath=//a[text()='Reward points']";
	public static final String DYNAMIC_PAGE_MYACCOUNT_AREA = "xpath=//a[text()='%s']";
	public static final String LOGOUT_LINK_AT_USER = "css=a[class='ico-logout']";
	public static final String LOGOUT_LINK_AT_ADMIN = "xpath=//a[text()='Logout']";
	
	// pattern Object 
	public static final String DYNAMIC_TEXTBOX_BY_ID = "xpath=//input[@id='%s']";
	public static final String BUTTON_CONTAINS_TEXT = "xpath=//button[text()='%s']";
	public static final String DYNAMIC_DROWPDOWN_BY_NAME = "xpath=//select[@name='%s']";
	public static final String DYNAMIC_RADIOBUTTON_BY_LABLE = "xpath=//label[text()='%s']/preceding-sibling::input";
	public static final String DYNAMIC_CHECK_BOX = "xpath=//label[contains(text(),'%s')]";
	

}
