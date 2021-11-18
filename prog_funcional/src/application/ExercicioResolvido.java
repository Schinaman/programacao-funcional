package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;


public class ExercicioResolvido {

	public void exercicioResolvido() {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full file path: ");
		String path =sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line!=null) {
				String[] fields =line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			//starta processamento para mostrar os dados
			
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	
	}
	
}
