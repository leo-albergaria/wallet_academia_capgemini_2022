package CAPGEMINI_02;

public class question_one {

    public static void main(String[] args) {

        int[] arr = { 9, 2, 1, 4, 6 };
        int xMedia = 0;

        for (int i = 0; i < arr.length; i++)
            xMedia += arr[i];

        System.out.println(((xMedia != 0) ? (xMedia / arr.length) : 0));
    }

}
// javac question_one.java && java question_one