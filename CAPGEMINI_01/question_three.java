package CAPGEMINI_01;

import java.util.ArrayList;
import java.util.Scanner;

public class question_three {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String expressao = entrada.next();

		ArrayList<String> combinacoes = new ArrayList<String>();
		// ifailuhkqq
		int count = 1;
		for (int i = 0; i < expressao.length(); i++) {
			for (int j = 1; j < expressao.length(); j++) {

				if (expressao.charAt(i) == expressao.charAt(j) && i != j && i < j) {
					count = count + 1;
					if (expressao.charAt(i) == expressao.charAt(i + 1)) {
						combinacoes.add(expressao.substring(i, i + 1));
					} else {
						combinacoes.add(expressao.substring(i, j));
						combinacoes.add(expressao.substring(i, i + 1));
						combinacoes.add(expressao.substring(i + 1, j + 1));
					}
				}
			}
		}
		System.out.println(count);
		System.out.println(combinacoes);
		entrada.close();
	}
}

// javac question_three.java && java question_three
