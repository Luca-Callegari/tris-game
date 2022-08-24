
import javax.swing.*;

public class TrisMain {
    public static void main(String[] args) {
        Tris t = new Tris();
        t.stampa();
        int k = 0;
        int r;
        int c;
        // L'utente X è 0 e l'utente O è 1
        do {

            do {
                r = Integer.parseInt(JOptionPane.showInputDialog("Metti r"));
                c = Integer.parseInt(JOptionPane.showInputDialog("Metti c"));
            } while (t.Occupato(r, c));

            if (k == 0) {
                t.mettiX(r, c);
            } else {
                t.mettiO(r, c);
            }
            t.stampa();
            k = (k + 1) % 2;

        } while ((t.pieno() == false) && (t.vintoX() == false) && (t.vintoO() == false));

        if (t.vintoX()) {
            System.out.println("HA VINTO GIOCATORE X!");
        } else if (t.vintoO()) {
            System.out.println("HA VINTO IL GIOCATORE O!");
        } else {
            System.out.println("PAREGGIO!");
        }

    }
}

