package CAPGEMINI_01;

import java.util.Random;

public class question_one {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int linhas = aleatorio.nextInt(20);

        for (int i = 0; i <= linhas; i++) {
            System.out.print(" ".repeat(linhas - i));
            System.out.println("*".repeat(i));
        }
    }

}
// javac question_one.java && java question_one
