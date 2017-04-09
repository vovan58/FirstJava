package ru.intuit.first;

import java.util.Map;

public class EnvValue {

	public static void main(String[] args) {
		Map <String,?> mapenv = System.getenv();
		
		System.out.println("Количество переменных окружения : "+ mapenv.size());
		
		for (Map.Entry<String, ?> pair: mapenv.entrySet()) {
			System.out.println(pair.getKey() +" = "+ pair.getValue().toString());
		}

	}

}
