package util;

import java.util.function.Function;

import entities.Product;

//clase projeto original: UpperCaseName 
public class ProductFuncion implements Function<Product, String>{  //(Entrada, Sa�da)

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}

