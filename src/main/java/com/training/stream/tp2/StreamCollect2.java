package com.training.stream.tp2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCollect2 {
	public static void main(String[] args) {
		String[] strings = { "a", "b", "c", "d" };
		Stream<String> stream2 = Stream.of(strings);
		List<String> list2 = stream2.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

		list2.forEach(System.out::print);
	}
}