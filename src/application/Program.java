package application;

import java.util.Scanner;

import service.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrintService<String> ps = new PrintService<>();  // Utiliza-se Integer, para inteiro.
														//Caso, seja String, substitui. 

		System.out.print("How many values?");
		int n = sc.nextInt();
		

		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}

		ps.print();
		String x = ps.first();
		System.out.println("First: " + x);

		sc.close();

	}

}
