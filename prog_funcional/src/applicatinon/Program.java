package applicatinon;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,5,19,7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10); //map aplica uma fun��o a cada elemento da minha stream
		System.out.println(Arrays.toString(st1.toArray()));

		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		
		Stream<Integer> st3 = Stream.iterate(0,  x ->x +2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
				
		//Fibonacci
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);//iterate vai gerar uma stream de pares, mas quero stream de Long. map para transforamar os pares em apenas 1 elemento		
		System.out.println(Arrays.toString(st4.limit(15).toArray()));				
				
				
	}

}