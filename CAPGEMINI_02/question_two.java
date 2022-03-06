package CAPGEMINI_02;

public class question_two {

    public static void main(String[] args) {

        int[] xConjunto = { 1, 5, 3, 4, 2 };
        int xQtde = 0;

        // Mudar a diferença aqui
        int xDif = 2;

        for (int i = 0; i < xConjunto.length; i++) {
            for (int j = (i + 1); j < xConjunto.length; j++) {
                if (Math.abs(xConjunto[i] - xConjunto[j]) == xDif)
                    xQtde += 1;
            }
        }
        System.out.println(xQtde);
    }
}

// javac question_two.java && java question_two
