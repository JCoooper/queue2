public class line {
	private String Foodv;
	private int waitt;

	public line(String Item, int wait) {
		Foodv = Item;
		waitt = wait;
	}

	public String getItem() {
		return Foodv;
	}

	public int getWait() {
		return waitt;
	}

}