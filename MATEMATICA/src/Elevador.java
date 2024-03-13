public class Elevador {
    private int andar = 0;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes = 0;
    private boolean estado;

    
    public int getAndar() {
        return andar;
    }


    public void setAndar(int andar) {
        this.andar = andar;
    }


    public int getTotalAndares() {
        return totalAndares;
    }


    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }


    public int getCapacidade() {
        return capacidade;
    }


    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }


    public int getPessoasPresentes() {
        return pessoasPresentes;
    }


    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public String status () {
        String status = "############\nAndar: "+getAndar()+"\nTotal Andares: "+getTotalAndares()+"\nPessoas presentes: "+getPessoasPresentes()+"\nCapacidade: "+getCapacidade()+"\n############\n\n";
        return status;
    }


    public boolean isEstado() {
        return estado;
    }


    public void setEstado (boolean estado) {
        this.estado = estado;
    }

    public void inicializa (int andares,int capacidade) {
        this.totalAndares = andares;
        this.capacidade = capacidade;
    }
    public void entra () {
        if (this.pessoasPresentes <= this.capacidade)
        this.pessoasPresentes += 1;
    }
    
    public void sai () {
        if (this.pessoasPresentes <= 0)
            return;
        else
    this.pessoasPresentes -= 1;
    }
    public void sobe () {
        this.andar += 1;
    }
    public void desce () {
        this.andar -= 1;
    }
    
}