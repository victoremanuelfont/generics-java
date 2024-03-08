package application;

import java.util.Scanner;

import service.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrintService ps = new PrintService();

		System.out.print("How many values?");
		int n = sc.nextInt();
		
		ps.addValue("Maria");   // Object aceita todo tipo, mas nem sempre é uma boa solução

		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = (Integer) ps.first();     /* Quando se utiliza o Object, ele até aceita  
		                                      o String e o Integer ao mesmo tempo, mas da erro. 
		                                      Problemas como type safety e performace */
		System.out.println("First: " + ps.first());

		sc.close();

	}

}
