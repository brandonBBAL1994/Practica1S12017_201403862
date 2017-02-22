
package practica1_estructuras;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class ListaSimplePalabra {

    Palabra inicio, fin;
    
    
    public ListaSimplePalabra(){
        inicio = fin = null;
    }
    
    public void agregarPalabraAlInicio(String palabra){
        inicio = new Palabra(palabra,inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    
    public void agregarPalabraAlFinal(String palabra){
        if(inicio == null){
            Palabra nueva = new Palabra(palabra);
            inicio = fin = nueva;
        }
        else{
            Palabra nueva = new Palabra(palabra);
            fin.setSiguiente(nueva);
            fin = fin.getSiguiente();
        }
    }   
    
    public void mostrarPalabras(){
        Palabra aux = inicio;
        
        File f;
        FileWriter fw;
        BufferedWriter bw;
        PrintWriter pr;
        String ruta = "C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\listaSimplePalabra.txt";
       
        
        try {
        f = new File(ruta);
        fw = new FileWriter(f);
        bw = new BufferedWriter(fw);
        pr = new PrintWriter(bw);
        
        pr.write("digraph { \n");
        
            while(aux != null){
            String l1 = aux.getPalabra();
            aux = aux.getSiguiente();
            if(aux!=null){
                String l2 = aux.getPalabra();
            pr.write("\""+l1+"\" -> "+"\""+l2+"\"");
            }
        }
            pr.write("}");
        pr.close();
        bw.close();
        
        Runtime rt = Runtime.getRuntime();
        rt.exec("C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe -Tjpg C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\listaSimplePalabra.txt -o C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\listaSimplePalabra.jpg");
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
           }
    
    
    
    
        
    }
    
    

