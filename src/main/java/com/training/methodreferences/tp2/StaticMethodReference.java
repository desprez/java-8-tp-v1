package com.training.methodreferences.tp2;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReference {

	public static void formatAndPrint(StringListFormatter formatter, String delimiter, List<String> list) {
		String formatted = formatter.format(delimiter, list);
		System.out.println(formatted);
	}

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Don", "King", "Kong");

		StringListFormatter formatter = (delimiter, list) -> {
			StringBuilder sb = new StringBuilder(100);
			int size = list.size();
			for (int i = 0; i < size; i++) {
				sb.append(list.get(i));
				if (i < size - 1) {
					sb.append(delimiter);
				}
			}
			return sb.toString();
		};
		formatAndPrint(formatter, ", ", names);
	}
}