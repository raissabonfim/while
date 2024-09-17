import java.util.Scanner;

public class DoWhileExemplo {
    public static void main(String[] args) {

        int opcao = 0;
        Scanner entrada = new Scanner((System.in));

        do {
            System.out.println("** Escolha **");
            System.out.println("1 - inserir");
            System.out.println("2 - excluir");
            System.out.println("3 - alterar");
            System.out.println("0 - sair");
            opcao = entrada.nextInt();
        } while (opcao!= 0);

    }
}
