package automation.testsuite;

import static org.testng.Assert.assertTrue;import java.awt.Color;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.TuanAnh_BepAnToan_LoNuongDaNang_Page;

public class TuanAnh_BepAnToan_LoNuongDaNang_TestSuite extends CommonBase
{
	TuanAnh_BepAnToan_LoNuongDaNang_Page LoNuongDaNang;
	
	@BeforeMethod
	public void openBrowser()
	{
		driver = initFirefoxDriver(CT_PageURLs.URL_BEPANTOAN);
	}
	
	@Test(priority = 1)
	public void ViewMenuLoNuongDaNang() throws InterruptedException 
	{
		LoNuongDaNang = new TuanAnh_BepAnToan_LoNuongDaNang_Page(driver);
		LoNuongDaNang.ViewMenuLoNuongDaNang();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Lò nướng đa năng']")).isDisplayed());
		
	}
	
	@Test(priority = 2)
	public void ViewMenuDanhMucMaySayChenBat() throws InterruptedException
	{
		LoNuongDaNang = new TuanAnh_BepAnToan_LoNuongDaNang_Page(driver);
		LoNuongDaNang.ViewMenuLoNuongDaNang();
		Thread.sleep(2000);
		LoNuongDaNang.CheckDanhMucSuccessfully();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Máy Sấy Chén Bát']")).isDisplayed());
	}
	
	@Test(priority = 3)
	public void ViewHangBosch() throws InterruptedException 
	{
		LoNuongDaNang = new TuanAnh_BepAnToan_LoNuongDaNang_Page(driver);
		LoNuongDaNang.ViewMenuLoNuongDaNang();
		Thread.sleep(2000);
		LoNuongDaNang.CheckHangSanXuatSuccessfully();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//span[@class='text-sm breadcrumb-item text-grey-800']")).isDisplayed());
	}
	
	@Test(priority = 4)
	public void ViewMucGia() throws InterruptedException 
	{
		LoNuongDaNang = new TuanAnh_BepAnToan_LoNuongDaNang_Page(driver);
		LoNuongDaNang.ViewMenuLoNuongDaNang();
		Thread.sleep(2000);
		LoNuongDaNang.CheckMucGiaSuccessfully();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//span[contains(text(),'2.410.000')]")).isDisplayed());
	}
	
	@Test(priority = 5)
	public void ViewXuatXu() throws InterruptedException 
	{
		LoNuongDaNang = new TuanAnh_BepAnToan_LoNuongDaNang_Page(driver);
		LoNuongDaNang.ViewMenuLoNuongDaNang();
		Thread.sleep(2000);
		LoNuongDaNang.CheckXuatXuSuccessfully();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.id("italy-1024")).isSelected());
		assertTrue(driver.findElement(By.xpath("//h4[text()='Lò nướng Canzy CZ 601M']")).isDisplayed());
	}
	
	@Test(priority = 6)
	public void ViewDungTich() throws InterruptedException 
	{
		LoNuongDaNang = new TuanAnh_BepAnToan_LoNuongDaNang_Page(driver);
		LoNuongDaNang.ViewMenuLoNuongDaNang();
		Thread.sleep(2000);
		LoNuongDaNang.CheckDungTichSuccessfully();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.id("61-lit2ctF-1220")).isSelected());
		assertTrue(driver.findElement(By.xpath("//h4[text()='Lò nướng Bosch HBA21B250E']")).isDisplayed());
	}
	
	@Test(priority = 7)
	public void ViewHang() throws InterruptedException 
	{
		LoNuongDaNang = new TuanAnh_BepAnToan_LoNuongDaNang_Page(driver);
		LoNuongDaNang.ViewMenuLoNuongDaNang();
		Thread.sleep(2000);
		LoNuongDaNang.CheckHangSuccessfully();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.id("null-1257")).isSelected());
		assertTrue(driver.findElement(By.xpath("//h4[text()='LÒ NƯỚNG KÈM HẤP ÂM TỦ BOSCH HRG635BS1 SERIE 8 71L']")).isDisplayed());
	}
	
	@Test(priority = 8)
	public void ViewMenuTabPhoBien() throws InterruptedException 
	{
		LoNuongDaNang = new TuanAnh_BepAnToan_LoNuongDaNang_Page(driver);
		LoNuongDaNang.ViewMenuLoNuongDaNang();
		Thread.sleep(2000);
		LoNuongDaNang.CheckPhoBienSuccessfully();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//h4[text()='Lò nướng Bosch Zelmer ZEO32C3151']")).isDisplayed());
	}
	
	@Test(priority = 9)
	public void ViewMenuTabGiamGiaNhieu() throws InterruptedException 
	{
		LoNuongDaNang = new TuanAnh_BepAnToan_LoNuongDaNang_Page(driver);
		LoNuongDaNang.ViewMenuLoNuongDaNang();
		Thread.sleep(2000);
		LoNuongDaNang.CheckGiamGiaNhieuSuccessfully();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//div[text()='-53%']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//h4[text()='Lò nướng 48L Nagakawa NAG3248A - Hàng chính hãng']")).isDisplayed());
	}
	
	@Test(priority = 10)
	public void ViewMenuTabGiaThap() throws InterruptedException 
	{
		LoNuongDaNang = new TuanAnh_BepAnToan_LoNuongDaNang_Page(driver);
		LoNuongDaNang.ViewMenuLoNuongDaNang();
		Thread.sleep(2000);
		LoNuongDaNang.CheckGiaThapSuccessfully();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//span[contains(text(),'2.048.000')]")).isDisplayed());
	}
	
	@Test(priority = 11)
	public void ViewMenuTabGiaCao() throws InterruptedException 
	{
		LoNuongDaNang = new TuanAnh_BepAnToan_LoNuongDaNang_Page(driver);
		LoNuongDaNang.ViewMenuLoNuongDaNang();
		Thread.sleep(2000);
		LoNuongDaNang.CheckGiaCaoSuccessfully();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//span[contains(text(),'92.878.000')]")).isDisplayed());
	}
	
	@Test(priority = 12)
	public void ViewDetail() throws InterruptedException 
	{
		LoNuongDaNang = new TuanAnh_BepAnToan_LoNuongDaNang_Page(driver);
		LoNuongDaNang.ViewMenuLoNuongDaNang();
		Thread.sleep(2000);
		LoNuongDaNang.ViewDetailSuccessfully();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//span[text()='Mô tả sản phẩm']")).isDisplayed());
	}
	
	@Test(priority = 13)
	public void FunctionTuVanLapDat() throws InterruptedException 
	{
		LoNuongDaNang = new TuanAnh_BepAnToan_LoNuongDaNang_Page(driver);
		LoNuongDaNang.ViewMenuLoNuongDaNang();
		Thread.sleep(2000);
		LoNuongDaNang.ViewDetailSuccessfully();
		Thread.sleep(5000);
		LoNuongDaNang.CheckFunctionKhaoSatTuVanLapDatTaiNhaSuccessfully("Quang", "0334118292", "HN", "Tư vấn mua bếp nướng");
		assertTrue(driver.findElement(By.xpath("//p[normalize-space()='Cảm ơn Quý khách hàng đã tin tưởng Bepantoan.vn. Bepantoan sẽ liên hệ Quý khách trong thời gian sớm nhất.']")).isDisplayed());
	}
	
	
	@Test(priority = 14)
	public void FunctionMuaNgay() throws InterruptedException 
	{
		LoNuongDaNang = new TuanAnh_BepAnToan_LoNuongDaNang_Page(driver);
		LoNuongDaNang.ViewMenuLoNuongDaNang();
		Thread.sleep(3000);
		LoNuongDaNang.ViewDetailSuccessfully();
		Thread.sleep(3000);
		LoNuongDaNang.CheckFunctionMuaNgaySuccessfully("Quang", "0334118292", "HN");
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//div[text()='Thông tin đặt hàng']")).isDisplayed());
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
