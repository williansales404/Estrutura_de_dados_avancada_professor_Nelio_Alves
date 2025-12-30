package application;

public class CpfValidation {

	public static void main(String[] args) {
		String Verificationcpf = cpfVerification("874092172-93");
		System.out.println(Verificationcpf);
		
		String padrao = "^(?:\\d{11}|\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2})$";
		boolean valCpf = validationCpf(Verificationcpf, padrao);
		System.out.println(valCpf == false ? "Valido" : "Invalido");
		
	}
	public static String cpfVerification(String cpf) {
		return cpf.replaceAll("\\D+", "");
	}
	
	public static boolean validationCpf(String padrao, String cpf) {
		return cpf.matches(padrao);
	}
}
