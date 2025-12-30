package application;

import java.util.Locale;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Product p1 = new Product("Laptop", 1000.0, 5);
		Product p2 = new Product("radio", 300.0, 1);
		
		System.out.printf("%s, %.2f, %d%n",p1.getName(),p1.getValue(),p1.getQuantity());
		System.out.println(p1.total());
		p1.updatePricet(20);
		System.out.println(p1.getValue());
		
		System.out.println();
		
		System.out.printf("%s, %.2f, %d%n",p2.getName(),p2.getValue(),p2.getQuantity());
		System.out.println(p2.total());
		p2.updatePricet(10);
		System.out.println(p2.getValue());
		
		System.out.println();
		
	}

}
