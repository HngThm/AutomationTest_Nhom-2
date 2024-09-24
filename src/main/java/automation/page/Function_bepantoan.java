package automation.page;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.common.CommonBase;

public class Function_bepantoan extends CommonBase{
	private WebDriver driver;
	@FindBy(xpath = " (//div[@class='w-full px-1'])") WebElement Khaosat;
	@FindBy(xpath = " //span[text()='Mua ngay']") WebElement Muangay;
	@FindBy(xpath = "( //span[text()='Mua trả góp'])[1]") WebElement Muatragop;
	@FindBy(xpath = "//a[text()=' Thiết Bị Nhà Bếp Khác ']") WebElement TabThietbinhabep;
	@FindBy(xpath = "h4[text()='BỘ NỒI TỪ KAINER KA-304S']") WebElement SanphamBeptu;
	
	public Function_bepantoan(WebDriver _driver)
	{
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	public void Clickmuangay()
	{
		TabThietbinhabep.click();
		pause(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement beptu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='max-w-[228px] m-auto'])[1]")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", beptu);
		pause(2000);
		Muangay.click();
		
	}
	public void clickKhaosat()
	{
		TabThietbinhabep.click();
		pause(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement beptu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='max-w-[228px] m-auto'])[1]")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", beptu);
		pause(2000);
		Khaosat.click();
	}
	public void ClickMuatragop()
	{
		TabThietbinhabep.click();
		pause(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement beptu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='max-w-[228px] m-auto'])[1]")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", beptu);
		pause(2000);
		Muatragop.click();
	}
	
	
	
	
	public void xuatDanhSachSanPham() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    try {
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='flex flex-wrap product-list']//a")));
	        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='flex flex-wrap product-list']//a"));

	        if (productList.isEmpty()) {
	            System.out.println("Không có sản phẩm nào được tìm thấy.");
	        } else {
	            for (WebElement product : productList) {
	                try {
	                    WebElement productNameElement = product.findElement(By.xpath(".//h4"));
	                    String productName = productNameElement.getText();
	                    System.out.println("Tên sản phẩm: " + productName);
	                } catch (StaleElementReferenceException e) {
	                    System.out.println("Không thể lấy tên sản phẩm, phần tử bị lỗi: " + e.getMessage());
	                }
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("Có lỗi xảy ra khi lấy danh sách sản phẩm: " + e.getMessage());
	    }
	}
}
