package practica1_estructuras;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ListaCircularJugador {
    Jugador ultimo;
  
    public ListaCircularJugador(){
        ultimo = null;  
    }
    
    public boolean estaVacia(){
        return ultimo == null;
    }
    
    public void insertarJugador(String nombreJugador, ListaSimpleLetra letra){
        
        Jugador nuevo = new Jugador(nombreJugador, letra);
        if(ultimo != null){
            nuevo.setSiguiente(ultimo.getSiguiente());
            ultimo.setSiguiente(nuevo);
        }
        ultimo = nuevo;
    }
    
    public void mostrarListaJugadores(){
        Jugador aux = ultimo;
        String nombres = "";
        File f;
        FileWriter fw;
        BufferedWriter bw;
        PrintWriter pr;
        String ruta = "C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\listaJugadores.txt";
        
        try {
            f = new File(ruta);
        fw = new FileWriter(f);
        bw = new BufferedWriter(fw);
        pr = new PrintWriter(bw);
        
        pr.write("digraph { \n");
     
          do{
           String j1 = aux.getNombre();
          nombres+=aux.getNombre();
          aux = aux.getSiguiente();
          String j2 = aux.getNombre();
          pr.write("\""+j1+"\" -> "+"\""+j2+"\"");
       }
       while(aux!= ultimo);
        
        pr.write("}");
        pr.close();
        bw.close();
        
        Runtime rt = Runtime.getRuntime();
        rt.exec("C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe -Tjpg C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\listaJugadores.txt -o C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\listaJugadores.jpg");
            //System.out.println("Finalizado"); 
       
        
        } catch (Exception e) {
        }
     
    }
    
    
}
