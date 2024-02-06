public class Operacao {
    
    public double calcularJuros(double valorInicial, double investimento, double taxa){
        
        double total = valorInicial;
        double investimentoMeses = investimento;
        double taxaLocal = taxa / 100;
        int meses = 12;

        for (int i = 0; i < meses; i++) {
            total += investimentoMeses + (total * taxaLocal);
        }
        return total;
    }
}
