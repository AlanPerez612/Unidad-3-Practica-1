/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trix
 */
public class TDAPrioridad {

    public char dato;
    public int lvl;

    public TDAPrioridad() {
    }

    public TDAPrioridad(char dato, int lvl) {
        this.dato = dato;
        this.lvl = lvl;

    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String toString() {
        return "char : " + dato + ". Prioridad: " + lvl;
    }

}
