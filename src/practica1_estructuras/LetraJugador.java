
package practica1_estructuras;


public class LetraJugador {

    public int getPunteo() {
        return punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }

    String Letra;
    LetraJugador siguiente;
    int punteo;
    
    public LetraJugador(String letra, int punteo){
        this.Letra = letra;
        this.siguiente = null;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    public LetraJugador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(LetraJugador siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
