package CAPGEMINI_02;

public class question_three {

    public static void main(String[] args) {

        // String s = "tenha um bom dia".replace(" ", "");
        String s = "ola mundo".replace(" ", "");

        int xMatrix = (int) Math.round(Math.sqrt(s.length()));
        var xMatrix_Preenchida = s.split("");

        for (int i = 0; i < xMatrix; i++) {
            for (int j = 0; j < xMatrix; j++) {

                if (i + (j * xMatrix) < s.length()) {
                    if (j * xMatrix < s.length()) 
                        System.out.print(xMatrix_Preenchida[i + (j * xMatrix)]);
                }
            }
            System.out.print(" ");
        }
    }
}

// javac question_three.java && java question_three
