package application;

public class CpfValidation {

	public static void main(String[] args) {
		String Verificationcpf = cpfVerification("874092172-93");
		System.out.println(Verificationcpf);
		
		String padrao = "^(?:\\d{11}|\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2})$";
		boolean valCpf = validationCpf(Verificationcpf, padrao);
		System.out.println(valCpf == false ? "Valido" : "Invalido");
		
//		String str = "874092172-93";
//		//Segunda solução criada por min
//		System.out.println(clearCpf(str));
		
	}
	public static String cpfVerification(String cpf) {
		return cpf.replaceAll("\\D+", "");
	}
	
	public static String clearCpf(String str) {
		StringBuilder sb = new StringBuilder();
		char[] arrayStr = str.toCharArray();
		for(int i = 0; i < arrayStr.length; i++) {
			int a = Character.getNumericValue(arrayStr[i]);
			if(a >= 0) {
				sb.append(a);
			}
		}
		return sb.toString();
	}
	
	public static boolean validationCpf(String padrao, String cpf) {
		return cpf.matches(padrao);
	}
}
