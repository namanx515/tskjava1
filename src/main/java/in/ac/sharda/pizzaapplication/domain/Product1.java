package in.ac.sharda.pizzaapplication.domain;

public class Product1 {
	
	private final int id;
	private int price;
	private String name, description;
	private int calories;
	
	
	public Product1(int id, int price, String name, String description,int calories) {
		
		this.id = id;
		this.price = price;
		this.name = name;
		this.description = description;
	}
	
	
	public int getCalories() {
		return calories;
	}


	public void setCalories(int calories) {
		this.calories = calories;
	}


	public Product1(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Product1) {
			return ((Product1)obj).getId() == id;
		}
		return false;
	}
}