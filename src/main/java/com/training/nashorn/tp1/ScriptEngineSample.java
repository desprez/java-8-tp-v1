package com.training.nashorn.tp1;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ScriptEngineSample {
	public static void main(String[] args) {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("nashorn");

	}
}
