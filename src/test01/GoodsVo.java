package test01;

public class GoodsVo {
	private int no;
	private String item;
	private int price;
	private String detail;
	private String img;
	
	public GoodsVo() {
		// abc
		// ccc
		// zzzz
	}
	
	public GoodsVo(int no, String item, int price, String detail, String img) {
		this.no = no;
		this.item = item;
		this.price = price;
		this.detail = detail;
		this.img = img;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	

}
