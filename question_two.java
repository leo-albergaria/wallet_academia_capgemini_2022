import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class question_two {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(".".repeat(50));
        System.out.print("Digite o Nome do Utilizador: ");
        String nome = entrada.next();

        System.out.println(".".repeat(50));
        System.out.println("Atencao as exigencias para o segredo de acesso:\n"
                + " - Possui no minimo 6 caracteres.\n"
                + " - Contem no minimo 1 digito.\n"
                + " - Contem no minimo 1 letra em minusculo.\n"
                + " - Contem no minimo 1 letra em maiusculo.\n"
                + " - Contem no minimo 1 caractere especial. Os caracteres especiais sao: !@#$%^&*()-+");

        String senha;
        do {
            System.out.println(".".repeat(50));
            System.out.print("Digite o seu segredo de acesso: ");
            senha = entrada.next();
        } while (!validaSenha(senha, nome));

        entrada.close();
    }

    public static boolean validaSenha(String senha, String nome) {

        if (senha == null) {
            return false;
        }
        String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6,}$";

        Matcher m = Pattern.compile(regex).matcher(senha);
        boolean respo = m.matches();

        System.out.println(".".repeat(50));
        if (respo == true)
            System.out.print("Ola! " + nome + ", seu Segredo e valido, acesso ok.");
        else if (respo == false)
            System.out.println("Segredo invalido, observe as exigencias e tente novamente.");
        return respo;
    }

}

// javac question_two.java && java question_two
