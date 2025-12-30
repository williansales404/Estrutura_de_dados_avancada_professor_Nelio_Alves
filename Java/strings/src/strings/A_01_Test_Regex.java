package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A_01_Test_Regex {

	public static void main(String[] args) {
		//Validação de dados
		System.out.print("Validação CPF: ");
		String cpf = "000.000.000.11";
		System.out.println(validarCPF(cpf));
		
		
		
		
	}
	public static boolean validarCPF(String s) {
		Pattern pattern = Pattern.compile("^[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{2}$");
		Matcher matcher = pattern.matcher(s);
		return matcher.find();
	}
}
