package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T> {  /* Utilizou-se T mas pode ser qualquer letra ou nome
									Significa que a classe está parametrizada com o tipo T */

	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}

	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty"); // esta vazia
		}
		return list.get(0); //retorna o primeiro elemento
	}

	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for(int i= 1; i<list.size();i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}

}
