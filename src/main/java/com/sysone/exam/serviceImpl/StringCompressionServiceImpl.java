package com.sysone.exam.serviceImpl;


import org.springframework.stereotype.Component;

import com.sysone.exam.service.StringCompressionService;

@Component
public class StringCompressionServiceImpl implements StringCompressionService {

	@Override
	public String compress(String value) {

		String result = "";
		
		//Chequeo que la cadena no este vacía y no sea nula
		if (value.length()==0 || value == null) {
			return result;
		}
		
		//Paso la cadena a mayúsculas para considerar las minúsculas en la cuenta
		value = value.toUpperCase();
		
		char currentLetter = value.charAt(0);
		int cont = 1;
		
		//Recorro la cadena sumando las letras iguales y agregando a la cadena
		//result la cant contada y luego la letra en cuestión
		for (int i = 1; i < value.length(); i++) {
			if (currentLetter == value.charAt(i)) {
				cont++;
			} else {
				result = result + cont + currentLetter;
				currentLetter = value.charAt(i);
				cont = 1;
			}
		}
		
		result = result + cont + currentLetter;
		
		return result;
	}

}
