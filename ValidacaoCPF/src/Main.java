import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cpf;

        cpf = sc.next();
        if (cpf.length() == 11) {
            boolean resultado = ValidacaoCPF.validandoCPF(cpf);

            if (resultado) {
                System.out.println("CPF válido");
            } else {
                System.out.println("CPF inválido");
            }
        }
        else {
            System.out.println("CPF com tamanho inválido...");
        }


    }
}