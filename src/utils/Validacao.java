package utils;

public class Validacao {
	
	public static Boolean validarCpf (String cpf) {
		
		if (cpf.length() != 11) {
			return false;
		}

		switch (cpf) {
			case "00000000000": return false;
			case "11111111111": return false;
			case "22222222222": return false;
			case "33333333333": return false;
			case "44444444444": return false;
			case "55555555555": return false;
			case "66666666666": return false;
			case "77777777777": return false;
			case "88888888888": return false;
			case "99999999999": return false;
		}	
		
		//Validar o primeiro digito verificador do CPF
		int mult, peso = 10, soma = 0, resto, digito1, digito2;
		for (int i = 0; i < 9; i++) {
			mult = Integer.parseInt(String.valueOf(cpf.charAt(i))) * peso;
			//soma = soma + mult;
			soma += mult;
			peso--;
		}
		
		resto = soma % 11;
		if(resto < 2) {
			digito1 = 0;
		}else {
			digito1 = 11 - resto;
		}
		
		//Verificar o primeiro digito
		if(digito1 != Integer.parseInt(String.valueOf(cpf.charAt(9)))) {
			return false;
		}
		
		//Validar o segundo digito verificador do CPF
		peso = 11; 
		soma = 0;
		for (int i = 0; i < 10; i++) {
			mult = Integer.parseInt(String.valueOf(cpf.charAt(i))) * peso;
			//soma = soma + mult;
			soma += mult;
			peso--;
		}
		
		resto = soma % 11;
		if(resto < 2) {
			digito2 = 0;
		}else {
			digito2 = 11 - resto;
		}
		
		//Verificar o primeiro digito
		if(digito2 != Integer.parseInt(String.valueOf(cpf.charAt(10)))) {
			return false;
		}
		
		return true;
	}
	
	public static Boolean validarIsbn (String isbn) {
		int sum = 0;

		/* TODO: Testar validacao Isbn 10 */
//		if (isbn.length() == 10) {
//	        for (int i = 0; i < 10; i++) {
//	            sum += i * Character.getNumericValue(isbn.charAt(i));
//	        }
//
//	        if (Character.getNumericValue(isbn.charAt(9)) == sum % 11) {
//	        	return true;
//	        }
//	    } else 
	    
		/* Validacao ISBN 13 */
    	if (isbn.length() == 13) {
	        for (int i = 0; i < 12; i++) {
	            if (i % 2 == 0) {
	                sum += Character.getNumericValue(isbn.charAt(i));
	            } else {
	                sum += Character.getNumericValue(isbn.charAt(i)) * 3;
	            }
	        }

	        if (Character.getNumericValue(isbn.charAt(12)) == 10 - (sum % 10)) {
	        	return true;
	        }
	    }

	    return false;
	}

}
















