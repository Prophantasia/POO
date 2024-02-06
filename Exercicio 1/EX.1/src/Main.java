import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o montante");
        double mont = entrada.nextInt();
        System.out.println("Informe a taxa de juros mensal");
        double taxa = entrada.nextInt();
        boolean opcao = true;
        double totalFinal = 0;

        do {
            totalFinal = calcularInvestimento(totalFinal, mont, taxa);
            System.out.printf("Valor após 12 mêses: %.2f \n", totalFinal);
            System.out.println("Deseja processar mais um ano: true ou false");
            opcao = entrada.nextBoolean();
        } while(opcao);
    }

    static public double calcularInvestimento (double investimentoInicial, double mont, double taxa) {
        Operacao op = new Operacao();
        double total = op.calcularJuros(investimentoInicial, mont, taxa);
        return total;
    }
}
