public class Tris {
    private char[][] caselle;

    public Tris() {
        this.caselle = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.caselle[i][j] = '-';
            }
        }
    }

    public void stampa() {
        for (int i = 0; i < 3; i++) {
            System.out.print('|');
            for (int j = 0; j < 3; j++) {
                System.out.print(this.caselle[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }


    public void mettiX(int r, int c) {
        if (this.libera(r, c)) {
            this.caselle[r][c] = 'X';
        }
    }

    public void mettiO(int r, int c) {
        if (this.libera(r, c)) {
            this.caselle[r][c] = 'O';
        }
    }

    public boolean libera(int r, int c) {
        if (this.caselle[r][c] == '-')
            return true;
        else
            return false;
    }

    public boolean Occupato(int r, int c){
        if (this.caselle[r][c] == 'X' || this.caselle[r][c] == 'O'){
            return true;
        }else{
            return false;
        }
    }

    private int conta = 0;

    public boolean pieno() {
        this.conta = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.libera(i, j))
                    this.conta++;
            }
        }
        if (this.conta == 0)
            return true;
        else
            return false;
    }

    ////////PER LA X////////

    public boolean vintoX() {
        if (this.DiagonalePositivaX() || this.DiagonaleNegativaX()){
            return true;
        }
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (this.RigaOccupataX(r) || this.ColonnaOccupataX(c)) {
                    return true;
                }
            }
        }
        return false;
    }

    //////////PER VINCERE X///////////

    private int RigaContatoreX = 0;

    public boolean RigaOccupataX(int r) {
        this.RigaContatoreX = 0;
        for (int c = 0; c < 3; c++) {
            if (this.caselle[r][c] == 'X')
                this.RigaContatoreX++;
        }
        if (this.RigaContatoreX == 3)
            return true;
        else return false;
    }

    private int ColonnaContatoreX;

    public boolean ColonnaOccupataX(int c) {
        this.ColonnaContatoreX = 0;
        for (int r = 0; r < 3; r++) {
            if (this.caselle[r][c] == 'X')
                this.ColonnaContatoreX++;
        }
        if (this.ColonnaContatoreX == 3)
            return true;
        else return false;
    }

    public boolean DiagonalePositivaX() {
        if (this.caselle[2][0] == 'X' && this.caselle[1][1] == 'X' && this.caselle[0][2] == 'X') {
            return true;
        } else {
            return false;
        }
    }


    public boolean DiagonaleNegativaX() {
        if (this.caselle[0][0] == 'X' && this.caselle[1][1] == 'X' && this.caselle[2][2] == 'X') {
            return true;
        } else {
            return false;
        }
    }


    //////////PER LA O/////////

    public boolean vintoO() {
        if (this.DiagonalePositivaO() || this.DiagonaleNegativaO()){
            return true;
        }
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (this.RigaOccupataO(r) | this.ColonnaOccupataO(c)) {
                    return true;
                }

            }
        }
        return false;
    }


    //////// PER VINCERE O //////////
    private int RigaContatoreO = 0;

    public boolean RigaOccupataO(int r) {
        this.RigaContatoreO = 0;
        for (int c = 0; c < 3; c++) {
            if (this.caselle[r][c] == 'O')
                this.RigaContatoreO++;
        }
        if (this.RigaContatoreO == 3)
            return true;
        else return false;
    }

    private int ColonnaContatoreO;

    public boolean ColonnaOccupataO(int c) {
        this.ColonnaContatoreO = 0;
        for (int r = 0; r < 3; r++) {
            if (this.caselle[r][c] == 'O')
                this.ColonnaContatoreO++;
        }
        if (this.ColonnaContatoreO == 3)
            return true;
        else return false;
    }

    public boolean DiagonalePositivaO() {
        if (this.caselle[2][0] == 'O' && this.caselle[1][1] == 'O' && this.caselle[0][2] == 'O') {
            return true;
        } else {
            return false;
        }
    }

    public boolean DiagonaleNegativaO() {
        if (this.caselle[2][0] == 'O' && this.caselle[1][1] == 'O' && this.caselle[0][2] == 'O') {
            return true;
        } else {
            return false;
        }
    }

}

