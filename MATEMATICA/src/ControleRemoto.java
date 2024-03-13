import javax.swing.JOptionPane;

public class ControleRemoto {
    public static void main(String[] args) {

        String resp = JOptionPane.showInputDialog(null, "Deseja ligar o ar? (S) ou (N)", "Controle Remoto", -1);

        if (resp.equals("S") || resp.equals("s")) {
            ArCondicionado ar = new ArCondicionado();
            ar.setEstado(true);
            while (ar.isEstado()) {

                int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                        ar.status() + "1. Temperatura\n2. Posição\n3. Modo\n4. Intensidade", "Conrole remoto", -1));
                switch (opcao) {

                    // Temperatura
                    case 1:
                        int opcaoInt = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "1. Aumentar\n2. Diminuir\n3. Valor manual\n4. Voltar", "Controle Remoto", -1));
                        if (opcaoInt == 1) {
                            JOptionPane.showMessageDialog(null, "Aumentado", "Controle Remoto", -1);
                            ar.setTemperatura(ar.getTemperatura() + 1);
                        } else if (opcaoInt == 2) {
                            JOptionPane.showMessageDialog(null, "Diminuido", "Controle Remoto", -1);
                            ar.setTemperatura(ar.getTemperatura() - 1);
                        } else if (opcaoInt == 3)
                            ar.setTemperatura(Integer.parseInt(
                                    JOptionPane.showInputDialog(null, "Digite a temperatura", "Controle Remoto", -1)));
                        else
                        break;

                    // Modo
                    case 3:
                        int opcaoModo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "1. Frio\n2. Calor\n3. Sair", "Controle Remoto", -1));
                        if (opcaoModo == 1) {
                            JOptionPane.showMessageDialog(null, "Realizado!", "Controle Remoto", -1);
                            ar.setModo("Frio");
                        } else if (opcaoModo == 2) {
                            JOptionPane.showMessageDialog(null, "Realizado!", "Controle Remoto", -1);
                            ar.setModo("Calor");
                        } else
                        break;

                    // Intensidade
                    case 4:
                        int opcaoIntensidade = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "1. Alterar Manualmente\n2. Sair", "Controle Remoto", -1));
                        if (opcaoIntensidade == 1) {
                            ar.setIntensidade(
                                    JOptionPane.showInputDialog(null, "Digite o valor: ", "Controle Remoto", -1));
                        } else
                        break;

                    // Posicao
                    case 2:
                        int opcaoPosicao = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "1. Cima\n2. Meio\n3. Baixo\n4. Sair", "Controle Remoto", -1));
                        if (opcaoPosicao == 1) {
                            JOptionPane.showMessageDialog(null, "Realizado!", "Controle Remoto", -1);
                            ar.setPosicao("Cima");
                        } else if (opcaoPosicao == 2) {
                            JOptionPane.showMessageDialog(null, "Realizado!", "Controle Remoto", -1);
                            ar.setPosicao("Meio");
                        } else if (opcaoPosicao == 3) {
                            JOptionPane.showMessageDialog(null, "Realizado!", "Controle Remoto", -1);
                            ar.setPosicao("Baixo");
                        } else
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Você digitou um valor inválido", resp, 2);
                        break;
                }
            }
        } else
            JOptionPane.showMessageDialog(null, "Encerrando.", "Controle remoto", 2);

    }
}
