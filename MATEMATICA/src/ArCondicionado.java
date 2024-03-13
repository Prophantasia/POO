public class ArCondicionado {
    private double temperatura = 20;
    private boolean estado;
    private String posicao = "Meio";
    private String modo = "Frio";
    private String intensidade = "100";

    public double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public String getModo() {
        return modo;
    }
    public void setModo(String modo) {
        this.modo = modo;
    }
    public String getIntensidade() {
        return intensidade;
    }
    public void setIntensidade(String intensidade) {
        this.intensidade = intensidade;
    }
    
    public String status () {
        String status = "############\nTemperatura: "+getTemperatura()+"\nPosição: "+getPosicao()+"\nModo: "+getModo()+"\nIntensidade: "+getIntensidade()+"\n############\n\n";
        return status;
    }
    
}