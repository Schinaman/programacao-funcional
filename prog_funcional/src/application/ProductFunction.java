package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class ProductFunction {

	public static void productFunction1() {
		List<Product> list = new ArrayList<>(); // Lista original Lista de Produtos

		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// list.stream().map(new util.ProductFuncion()) // converte para stream e aplica
		// fun??o aos elementos
		List<String> names = list.stream().map(new util.ProductFuncion()).collect(Collectors.toList()); // Lista final de Strings
																									
		names.forEach(System.out::println);

		// Notas:
		/*
		 * Interface funcional "FUNCTION": "Function" implementa uma fun??o de 2
		 * elementos. Um objeto de entrada e um de sa?da ex. (Produto, String) Para
		 * aplicar uma fun??o a varios elementos de uma list eu preciso converter da
		 * estrutura de dados List para a estrutura Stream. e para esse processo utilizo
		 * a fun??o map: NAO CONFUNDIR com estrutura de dados Map a fun??o "map" ? uma
		 * fun??o que aplica uma fun??o a todos os elementos de uma stream; Conceito de
		 * stream: Uma sequencia de dados; A fun??o map n?o funciona a partir de uma
		 * lista; funciona a partir de uma stream; precisa conversar uma lista em stream
		 * e depois de stream para list; ".stream()" converte para stream
		 * ".collect(Collectors.toList())" converte de stream para List
		 */
	}
	
	
	public static void productFunction2() {
		List<Product> list = new ArrayList<>(); 

		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		
		List<String> names = list.stream().map(Product :: staticFunctionUpperCase).collect(Collectors.toList()); 																							
		names.forEach(System.out::println);
	}
	
	public static void productFunction3() {
		List<Product> list = new ArrayList<>(); 

		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));


		List<String> names = list.stream().map(Product :: nonStaticFunctionUpperCase).collect(Collectors.toList()); 														
		names.forEach(System.out::println);
	}
	
	public static void productFunction4() {
		List<Product> list = new ArrayList<>(); 

		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		Function<Product, String> func = func = p -> p.getName().toUpperCase(); 
		List<String> names = list.stream().map(func).collect(Collectors.toList()); 	
		
		names.forEach(System.out::println);
	}
	
	public static void productFunction5() {
		List<Product> list = new ArrayList<>(); 

		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		
		List<String> names = list.stream().map( p -> p.getName().toUpperCase() ).collect(Collectors.toList()); 	
		names.forEach(System.out::println);
	}
	
}

