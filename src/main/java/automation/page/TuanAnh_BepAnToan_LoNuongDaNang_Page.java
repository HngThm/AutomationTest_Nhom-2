package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TuanAnh_BepAnToan_LoNuongDaNang_Page 
{
	private WebDriver driver;

	public TuanAnh_BepAnToan_LoNuongDaNang_Page(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Xpath menu
	@FindBy(xpath = "//li[@class='px-4 py-3 cursor-pointer']/a[normalize-space()='Lò Nướng Đa Năng']") WebElement linkLoNuongDaNang;
	
	//Xpath danh mục
	@FindBy(xpath = "//a[normalize-space()='Máy Sấy Chén Bát']") WebElement linkTextMaySayChenBat;
	@FindBy(xpath = "") WebElement linkTextLoViSong;
	@FindBy(xpath = "") WebElement linkTextDoGiaDung;
	@FindBy(xpath = "") WebElement linkTextMayLocNuoc;
	@FindBy(xpath = "") WebElement linkTextTuLanh;
	@FindBy(xpath = "") WebElement linkTextTuRuou;
	@FindBy(xpath = "") WebElement linkTextVienRuaBatChen;
	@FindBy(xpath = "") WebElement linkTextQuatDieuHoa;
	@FindBy(xpath = "") WebElement linkTextNoiChienKhongDau;
	@FindBy(xpath = "") WebElement linkTextCayNuocNongLanh;
	@FindBy(xpath = "") WebElement linkTextMayGiat;
	
	//Xpath hãng sản xuất
	@FindBy(xpath = "//div[@class='grid grid-cols-3 gap-1 md:grid-cols-2']/a[1]") WebElement linkTextBosch;
	@FindBy(xpath = "") WebElement linkText;
	
	//Xpath mức giá
	@FindBy(xpath = "//span[normalize-space()='< 3.000.000']") WebElement linkTextLessThan3M;
	
	//Xpath xuất xứ
	@FindBy(xpath = "//*[@id=\"siderbar\"]/div[5]/div/div/div[2]/a/span[1]") WebElement linkTextXemThemXuatXu;
	@FindBy(id = "italy-1024") WebElement checkboxItaly;
	
	//Xpath dung tích
	@FindBy(xpath = "//*[@id=\"siderbar\"]/div[6]/div/div/div[2]/a/span[1]") WebElement linkTextXemThemDungTich;
	@FindBy(id = "61-lit2ctF-1220") WebElement checkbox61Lit;
	
	//Xpath Hãng
	@FindBy(id = "null-1257") WebElement checkboxBosch;
	
	//Xpath menu tab phổ biến
	@FindBy(xpath = "//a[text()='Phổ biến']") WebElement linkTextPhoBien;
	
	//Xpath menu tab giảm giá nhiều
	@FindBy(xpath = "//a[text()='Giảm giá nhiều']") WebElement linkTextGiamGiaNhieu;
	
	//Xpath menu giá thấp
	@FindBy(xpath = "//a[text()='Giá thấp']") WebElement linkTextGiaThap;
	
	//Xpath menu giá cao
	@FindBy(xpath = "//a[text()='Giá cao']") WebElement linkTextGiaCao;
	
	//Xpath button Xem thêm
	@FindBy(xpath = "//*[@id=\"__layout\"]/div/main/section[1]/div/div[1]/div[2]/div[2]/a/span") WebElement buttonXemThem;
	
	//Xpath detail sản phẩm
	@FindBy(xpath = "//h4[text()='Lò Nướng Eurosun EOV65ME']") WebElement viewDetail;
	
	//Xpath chức năng button khảo sát - tư vấn lắp đặt tại nhà
	@FindBy(xpath = "//*[@id=\"__layout\"]/div/main/section[1]/div[1]/div/div/div[1]/div[2]/div[3]/div[1]/div/span[1]") WebElement buttonKhaoSatTuVanLapDatTaiNha;
	@FindBy(xpath = "//*[@id=\"__layout\"]/div/main/section[1]/div[1]/div/div/div[1]/div[5]/div[2]/div/div[2]/div[2]/fieldset[1]/div/div/section/div/input") WebElement textboxHoVaTen;
	@FindBy(xpath = "//*[@id=\"__layout\"]/div/main/section[1]/div[1]/div/div/div[1]/div[5]/div[2]/div/div[2]/div[2]/fieldset[2]/div/div/section/div/input") WebElement textboxSoDienThoai;
	@FindBy(xpath = "//*[@id=\"__layout\"]/div/main/section[1]/div[1]/div/div/div[1]/div[5]/div[2]/div/div[2]/div[2]/fieldset[3]/div/div/section/div/input") WebElement textboxDiaChi;
	@FindBy(xpath = "//*[@id=\"__layout\"]/div/main/section[1]/div[1]/div/div/div[1]/div[5]/div[2]/div/div[2]/div[2]/fieldset[4]/div/div/section/div/textarea") WebElement textboxLoiNhan;
	@FindBy(xpath = "//*[@id=\"__layout\"]/div/main/section[1]/div[1]/div/div/div[1]/div[5]/div[2]/div/div[2]/div[3]/div/span") WebElement buttonNhanTuVan;
	
	
	//Xpath chức năng mua ngay
	@FindBy(xpath = "//*[@id=\"__layout\"]/div/main/section[1]/div[1]/div/div/div[1]/div[2]/div[3]/div[2]/a/span[1]") WebElement buttonMuaNgay;
	@FindBy(xpath = "//*[@id=\"__layout\"]/div/main/section[2]/div/div/div[1]/div[1]/div/fieldset[1]/div/div/section/div/input") WebElement textboxHoTen;
	@FindBy(xpath = "//*[@id=\"__layout\"]/div/main/section[2]/div/div/div[1]/div[1]/div/fieldset[2]/div/div/section/div/input") WebElement textboxDienThoai;
	@FindBy(xpath = "//*[@id=\"__layout\"]/div/main/section[2]/div/div/div[1]/div[1]/div/fieldset[3]/div/div/section/div/input") WebElement textboxDiaChiNha;
	@FindBy(xpath = "//*[@id=\"__layout\"]/div/main/section[2]/div/div/div[2]/div[2]/button") WebElement buttonThanhToan;

	public void ViewMenuLoNuongDaNang() {
		linkLoNuongDaNang.click();
	}
	
	public void CheckDanhMucSuccessfully() {
		linkTextMaySayChenBat.click();
	}
	
	public void CheckHangSanXuatSuccessfully() {
		linkTextBosch.click();
	}
	
	public void CheckMucGiaSuccessfully() {
		linkTextLessThan3M.click();
	}
	
	public void CheckXuatXuSuccessfully() {
		linkTextXemThemXuatXu.click();
		checkboxItaly.click();
	}
	
	public void CheckDungTichSuccessfully() {
		linkTextXemThemDungTich.click();
		checkbox61Lit.click();
	}
	
	public void CheckHangSuccessfully() {
		checkboxBosch.click();
	}
	
	public void CheckPhoBienSuccessfully() {
		linkTextPhoBien.click();
	}
	
	public void CheckGiamGiaNhieuSuccessfully() {
		linkTextGiamGiaNhieu.click();
	}
	
	public void CheckGiaThapSuccessfully() {
		linkTextGiaThap.click();
	}
	
	public void CheckGiaCaoSuccessfully() {
		linkTextGiaCao.click();
	}
	
	public void ViewDetailSuccessfully() {
		viewDetail.click();
	}
	
	public void CheckFunctionKhaoSatTuVanLapDatTaiNhaSuccessfully(String name, String phone, String address, String message) {
		buttonKhaoSatTuVanLapDatTaiNha.click();
		textboxHoVaTen.sendKeys(name);
		textboxSoDienThoai.sendKeys(phone);
		textboxDiaChi.sendKeys(address);
		textboxLoiNhan.sendKeys(message);
		buttonNhanTuVan.click();
	}
	
	public void CheckFunctionMuaNgaySuccessfully(String hoten, String dienthoai, String diachi) {
		buttonMuaNgay.click();
		textboxHoTen.sendKeys(hoten);
		textboxDienThoai.sendKeys(dienthoai);
		textboxDiaChiNha.sendKeys(diachi);
		buttonThanhToan.click();
	}
}
