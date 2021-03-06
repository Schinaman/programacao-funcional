package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class ProductConsumer {

	public static void productConsumer1() {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.forEach(p -> p.setPrice(p.getPrice()*1.1)); //Arguemnto do forEach ? um Consumer;
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
	
	public static void productConsumer2() { //
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.forEach(new util.ProductConsumer());
		list.forEach(System.out :: println); //reference method
	}
	
	//Reference method - m?todo estatico
	public static void productConsumer3() {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.forEach(Product :: staticConsumerPriceUpdate );  
		//Argumento do "forEach" recebe um Objeto do tipo Consumer; (Objeto do tipo Consumer ? um objeto (classe) de uma unica fun??o.
		//Quando eu uso um m?todo referenciado (Reference Method) eu estou invocando um Consumer?
		//Consumer ? uma implementa??o de uma interface de um metodo s?
		//O Java provavelmente interpreta o m?todo statico como uma implementa??o de uma interface funcional
		
		list.forEach(System.out :: println);
	
	}
	
	//Reference method - m?todo n?o estatico
	public static void productConsumer4() {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.forEach(Product :: nonStaticConsumerPriceUpdate);
		list.forEach(System.out :: println);	
	}
	
	//Lambda Declarada
	public static void productConsumer5() {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double factor = 1.1;
		
		Consumer<Product> consumer = p -> p.setPrice(p.getPrice()*factor); 
		list.forEach(consumer);
		list.forEach(System.out :: println);	
	}
}
