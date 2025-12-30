package strings;
public class Cpf {

	public static String removeNonDigits(String str) {
		//usando StringBuilder
        //StringBuilder é mais eficiente para manipulação de strings em loops
        StringBuilder sb = new StringBuilder();
        //percorrendo cada caractere da string
        for (int i = 0; i < str.length(); i++) {
            //verificando se o caractere é um dígito
            //Character.isDigit() retorna true se o caractere for um dígito
            if (Character.isDigit(str.charAt(i))) {
                //adicionando o dígito ao StringBuilder
                sb.append(str.charAt(i));
            }
        }
        //convertendo o StringBuilder de volta para String e retornando
        return sb.toString();
    }
    //usando expressões regulares
    public static String removeNonDigits2(String str) {
        // \\D corresponde a qualquer caractere que não seja um dígito
        String regex = "\\D";
        //substituindo todos os caracteres não dígitos por uma string vazia
        return str.replaceAll(regex, "");
    }
	
    public static void main(String[] args) {

        
        System.out.println(removeNonDigits("949.237.847-99"));
        System.out.println(removeNonDigits2("949 237 847 99"));
    }
}
