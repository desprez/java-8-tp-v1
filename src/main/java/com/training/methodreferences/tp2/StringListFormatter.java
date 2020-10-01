package com.training.methodreferences.tp2;

import java.util.List;

@FunctionalInterface
public interface StringListFormatter {
	String format(String delimiter, List<String> list);
}