
package practica1_estructuras;


public class Ficha {

    String letra;
    int punteo;
    Ficha siguiente;
    
    
    public Ficha(String letra, int punteo){
        this.letra = letra;
        this.punteo = punteo;
        siguiente = null;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Ficha getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Ficha siguiente) {
        this.siguiente = siguiente;
    }

    public int getPunteo() {
        return punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }
    
    
}
