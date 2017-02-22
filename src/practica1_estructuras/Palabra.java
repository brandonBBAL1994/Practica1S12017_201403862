
package practica1_estructuras;


public class Palabra {

    String palabra;
    Palabra siguiente;
    
    public Palabra(String palabra){
        this.palabra = palabra;
        this.siguiente = null;
    }
    
    public Palabra(String palabra, Palabra p){
        this.palabra = palabra;
        siguiente = p;
    }
 
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public Palabra getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Palabra siguiente) {
        this.siguiente = siguiente;
    }
     
    
    
}
