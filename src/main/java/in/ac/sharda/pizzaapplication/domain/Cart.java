package in.ac.sharda.pizzaapplication.domain;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class Cart {
	// private List<Product> products = new ArrayList<>();
	
	private Set<Product1> itmes = new TreeSet<>();

	
	/*public void addProduct(Product product) {
		this.products.add(product);
	}*/
	
	
	
	public Set<Product1> additems() {
		for(int i = 1; i<20; i++) {
			itmes.add(new Product1(i, i*10, "Nme "+i, "Desc "+i,i*3));
		}
	return itmes;
	
	}
	
	public Cart(Set<Product1> itmes) {
		this.itmes = itmes;
	}

	public void removeProduct() {
		for(int i = 1; i<20; i++) {
			itmes.remove(new Product1(i, i*10, "Nme "+i, "Desc "+i,i*3));
		}
		System.out.println("All items removed");
	}
	}