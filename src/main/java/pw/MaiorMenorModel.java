package pw;

public class MaiorMenorModel {
	public static String calcular(int idade) {
        if (idade >= 18) {
            return "Maior de idade.";
        } else {
            return "Menor de idade.";
        }

	}
}
