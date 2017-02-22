
package practica1_estructuras;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.Timer;


public class ListaSimpleLetra {
    
    LetraJugador inicio, fin;
    
    
    public ListaSimpleLetra(){
        inicio = fin = null;
        
    }
    
    
    public void agregarLetra(String letra, int punteo){
        if(inicio == null){
            LetraJugador nueva = new LetraJugador(letra, punteo);
             inicio = fin = nueva;
        }
        else{
              LetraJugador nueva = new LetraJugador(letra, punteo);
            fin.setSiguiente(nueva);
            fin = fin.getSiguiente();
        }
    }
    
    
    public void mostrarLetrasJugador(){
      LetraJugador aux = inicio;
      File f;
        FileWriter fw;
        BufferedWriter bw;
        PrintWriter pr;
        String ruta = "C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\listaSimpleLetra.txt";
      
        try {
             f = new File(ruta);
        fw = new FileWriter(f);
        bw = new BufferedWriter(fw);
        pr = new PrintWriter(bw);
        
        pr.write("digraph { \n");
            
        while(aux!=null){
         
            String l1 = aux.getLetra();
            aux = aux.getSiguiente();
            if(aux!=null){
                String l2 = aux.getLetra();
                pr.write("\""+l1+"\" -> "+"\""+l2+"\"");
                }
            }
        pr.write("}");
        pr.close();
        bw.close();
        
        Runtime rt = Runtime.getRuntime();
        rt.exec("C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe -Tjpg C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\listaSimpleLetra.txt -o C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\listaSimpleLetra.jpg");
          
        } catch (Exception e) {
        }
        
      
    }
    
    
    
    
    
    
    
}