
import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        System.out.print("Bem vindo ao sistema de login em Java\nInforme seu email e senha para registrar:\n\nEmail: ");
        Scanner inputEmail = new Scanner(System.in);
        String email = inputEmail.nextLine();
        System.out.print("Senha: ");
        Scanner inputSenha = new Scanner(System.in);
        String senha = inputSenha.nextLine();

        System.out.print("Muito bem, agora tente se logar\nEmail: ");

        Scanner loginEmailInput = new Scanner(System.in);
        String loginEmail = loginEmailInput.nextLine();
        System.out.print("Senha: ");
        Scanner loginSenhaInput = new Scanner(System.in);
        String loginSenha = loginSenhaInput.nextLine();

        if (email.equals(loginEmail) && senha.equals(loginSenha)) {
            System.out.println("Login concedido com sucesso");
        } else {
            System.out.println("Erro no login");
        }
    }
}