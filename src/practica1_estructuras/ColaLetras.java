
package practica1_estructuras;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class ColaLetras {

    
    Ficha inicio, fin;
    int tamaño;
    
    public ColaLetras(){
        inicio = fin = null;
        tamaño = 0;
    }
    
    public void insertarFicha(String letra, int punteo){
        Ficha nueva = new Ficha(letra,punteo);
        if(inicio == null){
            inicio = nueva;
        }
        else{
            fin.siguiente= nueva;
        }
        fin = nueva;
        tamaño+=1;
    }

    
    
    public String sacarLetra(){
        String aux = inicio.getLetra();
        inicio = inicio.siguiente;
        tamaño-=1;
        return aux;
    }
    
    public void mostrarLetrasEnCola(){
        Ficha aux = inicio;
        
        File ff;
        FileWriter fw;
        BufferedWriter bw;
        PrintWriter pr;
        String ruta = "C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\colaLetras.txt";
      
        try {
             ff = new File(ruta);
        fw = new FileWriter(ff);
        bw = new BufferedWriter(fw);
        pr = new PrintWriter(bw);
        
        pr.write("digraph { \n");
        int a=0, e = 0, o=0, i = 0, s =0, n = 0, l=0,r=0, u=0, t=0, d=0, g=0,c=0, b=0, m=0,p=0,h=2,f=0,v=0,y=0,q=0,j=0,ñ=0,x=0,z=0;
        
        while(aux!=null){
            String l1= aux.getLetra();
            aux = aux.getSiguiente();
                 switch (l1) {
                     case "a":
                         
                         l1+=Integer.toString(a);
                         break;
                     case "b":
                         
                         l1+=Integer.toString(b);
                         break;
                     case "c":
                         
                         l1+=Integer.toString(c);
                         break;
                    case "d":
                        
                        l1+=Integer.toString(d);
                         break;
                    case "e":
                        
                        l1+=Integer.toString(e);
                         break;    
                    case "f":
                        
                        l1+=Integer.toString(f);
                         break;
                    case "g":
                        
                        l1+=Integer.toString(g);
                         break;
                    case "h":
                        
                         l1+=Integer.toString(h);
                         break;
                     case "i":
                        
                         l1+=Integer.toString(i);
                         break;
                     case "j":
                        
                         l1+=Integer.toString(j);
                         break;
                    case "l":
                        
                        l1+=Integer.toString(l);
                         break;
                    case "m":
                        
                        l1+=Integer.toString(m);
                         break;    
                    case "n":
                        
                        l1+=Integer.toString(n);
                         break;
                    case "ñ":
                        
                        l1+=Integer.toString(ñ);
                         break; 
                    case "o":
                        
                         l1+=Integer.toString(o);
                         break;
                     case "p":
                        
                         l1+=Integer.toString(p);
                         break;
                     case "q":
                        
                         l1+=Integer.toString(q);
                         break;
                    case "r":
                        
                        l1+=Integer.toString(r);
                         break;
                    case "s":
                        
                        l1+=Integer.toString(s);
                         break;    
                    case "t":
                        
                        l1+=Integer.toString(t);
                         break;
                    case "u":
                        
                        l1+=Integer.toString(u);
                         break;
                    case "v":
                        
                        l1+=Integer.toString(v);
                         break;
                    case "x":
                        
                        l1+=Integer.toString(x);
                         break;    
                    case "y":
                        
                        l1+=Integer.toString(y);
                         break;
                    case "z":
                        
                        l1+=Integer.toString(z);
                         break;    
                 }
            if(aux!= null){
                String l2 = aux.getLetra();
                switch(l2){
                     case "a":
                         a++;
                         l2+=Integer.toString(a);
                         break;
                     case "b":
                         b++;
                         l2+=Integer.toString(b);
                         break;
                     case "c":
                         c++;
                         l2+=Integer.toString(c);
                         break;
                    case "d":
                        d++;
                        l2+=Integer.toString(d);
                         break;
                    case "e":
                        e++;
                        l2+=Integer.toString(e);
                         break;    
                    case "f":
                        f++;
                        l2+=Integer.toString(f);
                         break;
                    case "g":
                        g++;
                        l2+=Integer.toString(g);
                         break;
                    case "h":
                         h++;
                         l2+=Integer.toString(h);
                         break;
                     case "i":
                         i++;
                         l2+=Integer.toString(i);
                         break;
                     case "j":
                         j++;
                         l2+=Integer.toString(j);
                         break;
                    case "l":
                        l++;
                        l2+=Integer.toString(l);
                         break;
                    case "m":
                        m++;
                        l2+=Integer.toString(m);
                         break;    
                    case "n":
                        n++;
                        l2+=Integer.toString(n);
                         break;
                    case "ñ":
                        ñ++;
                        l2+=Integer.toString(ñ);
                         break; 
                    case "o":
                         o++;
                         l2+=Integer.toString(o);
                         break;
                     case "p":
                         p++;
                         l2+=Integer.toString(p);
                         break;
                     case "q":
                         q++;
                         l2+=Integer.toString(q);
                         break;
                    case "r":
                        r++;
                        l2+=Integer.toString(r);
                         break;
                    case "s":
                        s++;
                        l2+=Integer.toString(s);
                         break;    
                    case "t":
                        t++;
                        l2+=Integer.toString(t);
                         break;
                    case "u":
                        u++;
                        l2+=Integer.toString(u);
                         break;
                    case "v":
                        v++;
                        l2+=Integer.toString(v);
                         break;
                    case "x":
                        x++;
                        l2+=Integer.toString(x);
                         break;    
                    case "y":
                        y++;
                        l2+=Integer.toString(y);
                         break;
                    case "z":
                        z++;
                        l2+=Integer.toString(z);
                         break; 
                }
                pr.write("\""+l1+"\" -> "+"\""+l2+"\"");
            } 
        }
         pr.write("}");
        pr.close();
        bw.close();
        
        Runtime rt = Runtime.getRuntime();
        rt.exec("C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe -Tjpg C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\colaLetras.txt -o C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\colaLetras.jpg");
       
        } catch (Exception e) {
        }
        
        
    }
    
    
    
    
    
    
}
