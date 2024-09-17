public class whileAula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = 0;
        int somaTotal = 0;


        while (valor != 99) {
            // System.out.println(valor);
            //valor= valor+ 1; //IGUAL VALOR++
            
            
            System.out.println("Digite um valor: ");
            System.out.println("informe 99 para sair");
            valor = sc.nextInt();
            
            somaTotal += valor;

            System.out.println("Total é "+ somaTotal);

        }
    }
}
