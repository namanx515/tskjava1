package in.ac.sharda.pizzaapplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ac.sharda.pizzaapplication.domain.Product1;

@RestController

public class CartController {
	
	private int count;

	@GetMapping("/cart")
	public List<Product1> products(){
		List<Product1> products = new ArrayList<>();
		for(int i = 100; i<=120; i++) {
			products.add(new Product1(i, i*10, "Nme "+i, "Desc "+i,i*3));
		}
		return products;
	}
	
	public void produc1t(){
		List<Product1> products = new ArrayList<>();
		for(int i = 1; i<20; i++) {
			products.remove(new Product1(i, i*10, "Nme "+i, "Desc "+i,i*3));
		}
		System.out.println("All item removed");
	}
	
	public void productss(){
		List<Product1> products = new ArrayList<>();
		count = products.size();
		System.out.println(count);
	}
}