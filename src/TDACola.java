/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trix
 */
public class TDACola {

    public TDAPrioridad[] vector;
    public int ini, fin;

    public TDACola(int tam) {
        vector = new TDAPrioridad[tam];
        ini = fin = -1;
    }

    private boolean estaColaLlena() {
        return fin == vector.length - 1;
    }

    protected boolean estaColaVacia() {
        return ini == - 1 && fin == -1;
    }

    private boolean hayUnSoloDato() {
        return ini == fin;
    }

    public boolean insertar(char dato, int lvl) {
        if (estaColaLlena()) {
            return false;
        }
        fin++;
        vector[fin] = new TDAPrioridad(dato, lvl);
        if (ini == -1) {
            ini = 0;
        }
        return true;
    }

    public boolean eliminar() {
        if (estaColaVacia()) {
            return false;
        }
        if (hayUnSoloDato()) {
            ini = -1;
            fin = -1;
            return true;
        }
        ini++;
        return true;
    }

    public char getValor(int pos) {
        return (char) vector[pos].getDato();
    }

    public char getNivel(int pos) {
        return (char) vector[pos].getLvl();
    }

    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }

}
