package application;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
public class ProductPredicate {


	public static void productPredicate1() {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(p -> p.getPrice() >= 100.0); //"removeIf" � um exemplo de predicado
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
	
	public static void productPredicate2() {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(new util.ProductPredicate()); //implementa��o passo a passo do productPredicate1; a partir da implementa��o da interface Predicate na clase ProductPredicate;
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
	
	//implementa��o a partir de metodo estatico na classe Product
	public static void productPredicate3() { 
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(Product :: staticProductPredicate); //essa nomeclantura chama-se "MethodRefernce", NomeDaClasse::Metodo;  
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

	public static void productPredicate4() { 
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(Product :: nonStaticProductPredicate); //essa nomeclantura chama-se "MethodRefernce", NomeDaClasse::Metodo;  
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}

	
		