import javax.swing.JOptionPane;

public class Urna extends Candidatos {

    public void Urna (int i) {
        switch (i) {
            case 1:
                setKimVotos(getKimVotos() + 1);
                break;
            case 2:
                setRicVotos(getRicVotos()+ 1);
                break;
            case 3:
                setAltVotos(getAltVotos() + 1);
                break;
            case 4:
                setBouVotos(getBouVotos() + 1);
                break;
            case 5:
                setMarVotos(getMarVotos() + 1);
                break;
            case 6:
                setTabVotos(getTabVotos() + 1);
                break;
            }
        }
    
        public void Urna (String texto) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        

    }


