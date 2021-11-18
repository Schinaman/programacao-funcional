package application;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
public class ProductPredicate {


	public static void productPredicate1() {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(p -> p.getPrice() >= 100.0); //"removeIf" � um exemplo de predicado //"removeIf recebe um predicado como argumento"
		
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
		
		list.removeIf(Product :: nonStaticProductPredicate); //
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
	
	//Express�o Lambda declarada
	public static void productPredicate5() { 
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.0;
		Predicate<Product> pred = p -> p.getPrice() >= min;
		list.removeIf(pred);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
	
	//Express�o Lambda declarada
	public static void productPredicate6() { 
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.0;
		list.removeIf(p -> p.getPrice() >= min); //retornamos a primeira express�o simplificada //ele infere que o objeto P � de produto; lista de produto
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}

	
		
