package strings;

public class DominioEmail {

	public static void main(String[] args) {

		EmailInfo emailInfo1 = extractEmailInformation("joao.silva23@yahoo.com.br");
		System.out.println("Usuario: " + emailInfo1.username);
		System.out.println("Dominio: " + emailInfo1.domain);
		System.out.println("Brasileiro: " + (emailInfo1.isBrazilian ? "sim" : "nao"));

		EmailInfo emailInfo2 = extractEmailInformation("maria123@gmail.com");
		System.out.println("Usuario: " + emailInfo2.username);
		System.out.println("Dominio: " + emailInfo2.domain);
		System.out.println("Brasileiro: " + (emailInfo2.isBrazilian ? "sim" : "nao"));

		System.out.println("metodo regex: " + validateBrDomain("joao.silva23@yahoo.com.br"));
		System.out.println("metodo regex: " + validateBrDomain("maria123@gmail.com"));
	}

	public static boolean validateBrDomain(String domain) {
		return domain.matches(".*\\.br$");
	}

	// metodo para extrair informações do email
	public static EmailInfo extractEmailInformation(String email) {
		// dividindo o email em usuario e dominio
		String[] parts = email.split("@");
		// pegar usuario e dominio
		String username = parts[0];
		String domain = parts[1];
		// verificar se o dominio termina com .br
		boolean isBrazilian = domain.endsWith(".br");

		return new EmailInfo(username, domain, isBrazilian);
	}
}

class EmailInfo {
	String username;
	String domain;
	boolean isBrazilian;

	public EmailInfo(String username, String domain, boolean isBrazilian) {
		this.username = username;
		this.domain = domain;
		this.isBrazilian = isBrazilian;
	}
}
