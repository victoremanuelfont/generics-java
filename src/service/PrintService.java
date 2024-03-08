package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

	private List<Object> list = new ArrayList<>();

	public void addValue(Object value) {
		list.add(value);
	}

	public Object first() {
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
