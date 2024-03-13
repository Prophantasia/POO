import javax.swing.JOptionPane;

public class ControleElevador {
    public static void main(String[] args) {

        String resp = JOptionPane.showInputDialog(null, "Deseja pedir um elevador? (S) ou (N)", "Elevador", -1);

        if (resp.equals("S") || resp.equals("s")) {
            Elevador ele = new Elevador();
            ele.setEstado(true);
            ele.inicializa(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos andares o prédio tem: ")),
                    Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a capacidade: ")));
            while (ele.isEstado()) {

                int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                        ele.status() + "1. Entrar\n2. Sai\n3. Sobe\n4. Desce", "Elevador", -1));
                switch (opcao) {

                    // Entra
                    case 1:
                        ele.entra();
                        break;

                    // Sai
                    case 2:
                        ele.sai();
                            break;
                    // Sobe
                    case 3:
                        ele.sobe();
                            break;
                    case 4:
                        ele.desce();
                }
            }
        } else
            JOptionPane.showMessageDialog(null, "Encerrando.", "Elevador", 2);

    }
}
