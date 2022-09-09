package project01package;

public class Apparel {

	/**
	 * All pieces of apparel should have a color, price, and condition
	 */
	private String color;
	private int price;
	private Condition condition;

	/**
	 * Constructor function for apparel
	 * 
	 * @param color
	 * @param price
	 * @param condition
	 */
	public Apparel(String color, int price, Condition condition) {
		this.color = color;
		this.price = price;
		this.condition = condition;
	}

	/**
	 * Fetches the apparel's color
	 * 
	 * @return color
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Fetches the apparel's price
	 * 
	 * @return price
	 */
	public int getPrice() {
		return this.price;
	}

	/**
	 * Fetches the apparel's condition
	 * 
	 * @return condition
	 */
	public String getCondition() {
		return this.condition.toString();
	}

	/**
	 * Sets the apparel's color to the String value passed into it
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Sets the apparel's price to the int value passed into it
	 * 
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * Sets the apparel's condition to the Condition value passed into it
	 * 
	 * @param condition
	 */
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	
	/**
	 * Converts the apparel object into an English readable sentence.
	 * 
	 * @return String
	 */
	public String toString() {
		String str = "";
		
		str += "This " + this.getColor() 
			+ " apparel cost $" + this.getPrice()
			+ " and is in " + this.getCondition()
			+ " condition.";
		
		return str;
	}

	/**
	 * Converts the apparel object into what would be its
	 * JavaScript Object Notation (JSON) equivalent.
	 * 
	 * @return String
	 */
	public String toStringJSON() {
		String ret = "";
		ret += "Apparel : { \n    ";
		ret += "Color : " + this.color + "\n    ";
		ret += "Price : $" + this.price + "\n    ";
		ret += "Condition : " + this.condition.toString();
		ret += "\n}";
		return ret;
	}

	/**
	 * Prints the result from toString()
	 */
	public void print() {
		System.out.println(this.toString());
	}
	
	/**
	 * Prints the result from toStringJSON()
	 */
	public void printJSON() {
		System.out.println(this.toStringJSON());
	}
}