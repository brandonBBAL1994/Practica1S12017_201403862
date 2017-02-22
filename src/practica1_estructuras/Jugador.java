package practica1_estructuras;

public class Jugador {

    public String nombre;
    public Jugador siguiente;
    public ListaSimpleLetra Letra;
    
    public Jugador(String nombreJugador, ListaSimpleLetra letra){
        nombre = nombreJugador;
        Letra = letra;
        siguiente = this;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombreJugador){
        nombre = nombreJugador;
    }  
    
    public Jugador getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Jugador sig){
       siguiente = sig;
    }

    public ListaSimpleLetra getLetra() {
        return Letra;
    }

    public void setLetra(ListaSimpleLetra Letra) {
        this.Letra = Letra;
    }

   
    
}
