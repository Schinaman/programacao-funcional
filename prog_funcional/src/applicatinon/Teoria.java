package applicatinon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Product;

public class Teoria {
	//Exemplo de transparencia referencial
		//Uma fun��o possui transparencia referencial se seu resultado for sempre o mesmo para os mesmos dados de entrada. Benecifios = simplicidade e previsibilidade.
		public static int globalValue = 3; 
		public static void exemploFuncaoNaoReferencialmenteTransparente() {
			
			int [] vect = new int[] {3,4,5,};
			changeOddValues(vect); //comportamento desta fun��o depende de um valor externo
			System.out.println(Arrays.toString(vect));
		}
		
		public static void changeOddValues(int[] numbers) { //fun��o n�o referencial
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] %2 !=0) {
					numbers[i] += globalValue;
				}
			}
		}

	//Fun��es s�o Objetos de primeira ordem
		public static int compareProducts(Product p1, Product p2) {
			return p1.getPrice().compareTo(p2.getPrice());
		}

		public static void exemploObjetosPrimeiraOrdem() {
			List<Product> list = new ArrayList<>();
			
			list.add(new Product("TV", 900.0));
			list.add(new Product("Notebook", 1200.0));
			list.add(new Product("Tablet", 450.0));
			
			list.sort(Teoria::compareProducts); //Posso passar a referencia para fun��o compareProducts. Isso significa falar que � um objeto de primeira classe ou primeira ordem. e ainda pode ser retornado por uma fun��o; "Classe::Fun��o";
			list.forEach(System.out::println);
		}
}
