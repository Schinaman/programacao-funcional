package applicatinon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Product;
import application.Teoria;

public class Program {

	public static void main(String[] args) {
		
		//Teoria.exemploFuncaoNaoReferencialmenteTransparente();
		Teoria.exemploObjetosPrimeiraOrdem();
		//exemplosStreams();
		//pipelineDemo();
		
	}

	public static void pipelineDemo() {
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10); //map aplica uma fun��o a cada elemento da minha stream
		System.out.println(Arrays.toString(st1.toArray())); //To Array express�o terminal
		
		int sum = list.stream().reduce(1, (x,y) -> x+y); //reduce pega o elemento inicial, elemnto neutro da opera��o e depois a fun��o que gera o resultado; "0" pq � o elemento neutro da opera��o de soma, se fosse produtorio, seria 1
		System.out.println("Sum = "+ sum);
		

		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0) //filtra a lista; insere um predicado, com base nesse predicado ser� dado uma nova stream apenas com os elementos que satisfa�a o predicado
				.map(x -> x * 10)
				.collect(Collectors.toList()); //opera��o terminal para transoformar em list
		System.out.println(Arrays.toString(newList.toArray()));
	}
	
	public static void exemplosStreams() {
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




