package course33;

public class Kaden {

	private String name;
	private int price;
	private String category;
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		if (category.equals("大型")) {
			this.category = "OK";
		} else {
			this.category =category;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		if (name.equals("マウス")) {
			this.name = "設定NG";
		} else {
			this.name = name;
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
