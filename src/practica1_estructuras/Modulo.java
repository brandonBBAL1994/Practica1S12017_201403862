/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_estructuras;


public class Modulo {

    public static ListaCircularJugador lc = new ListaCircularJugador();
    public static ListaSimplePalabra lp = new ListaSimplePalabra();
    public static ColaLetras colaL = new ColaLetras();

    public static ColaLetras getColaL() {
        return colaL;
    }

    public static void setColaL(ColaLetras colaL) {
        Modulo.colaL = colaL;
    }

    public static ListaCircularJugador getLc() {
        return lc;
    }

    public static void setLc(ListaCircularJugador lc) {
        Modulo.lc = lc;
    }

    public static ListaSimplePalabra getLp() {
        return lp;
    }

    public static void setLp(ListaSimplePalabra lp) {
        Modulo.lp = lp;
    }
    
    
    
}
