package practica1_estructuras;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.swing.JFileChooser;

public class Practica1_Estructuras {

    
   
    public static void main(String[] args) {
       
      // ColaLetras a = new ColaLetras();
//       ColaFicha b = new ColaFicha();
       //Practica1_Estructuras p = new Practica1_Estructuras();
//       for(int i = 0; i<=6; i++){
         // a.insertarFicha(p.generarLetra((int)(Math.random()*27)),1);
//          b.insertarFicha(p.generarLetra((int)(Math.random()*27)));
//       }
//       Jugador aa = new Jugador("Brandon",a);
//       Jugador bb = new Jugador("Bredly",b);
//       for(int i = 0; i<=6; i++){
//        System.out.println("Letra de Jugador: "+aa.getNombre()+"[" +aa.getCola().sacarLetraDeCola()+ "]   Letra de Jugador: "+bb.getNombre() + "["+bb.getCola().sacarLetraDeCola()+"]");
//       }
//       
        VentanaPrincipal v = new VentanaPrincipal();
        v.setVisible(true);
        
    }
    
    
    
    public String generarLetra(int totalABC){
        String letra = "";
        switch(totalABC){
            case 0:
                letra = "a";
               break;
            case 1:
                letra = "b";
                break;
            case 2:
                letra = "c";
                break;
            case 3:
                letra = "d";
                break;
            case 4:
                letra = "e";
                break;
            case 5:
                letra = "f";
                break;
            case 6:
                letra = "g";
                break;
            case 7:
                letra = "h";
                break;
            case 8:
                letra = "i";
                break;
            case 9:
                letra = "j";
                break;
            case 10:
                letra = "k";
                break;
            case 11:
                letra = "l";
                break;
            case 12:
                letra = "m";
                break;
            case 13:
                letra = "n";
                break;
            case 14:
                letra = "ñ";
                break;
            case 15:
                letra = "o";
                break;
            case 16:
                letra = "p";
                break;
            case 17:
                letra = "q";
                break;
            case 18:
                letra = "r";
                break;
            case 19:
                letra = "s";
                break;
            case 20:
                letra = "t";
                break;
            case 21:
                letra = "u";
                break;
            case 22:
                letra = "v";
                break;
            case 23:
                letra = "w";
                break;
            case 24:
                letra = "x";
                break;
            case 25:
                letra = "y";
                break;
            case 26:
               letra = "z";
                break;
            default:
                letra = "c";
                break;
        }
        return letra;
    }
    
    
}
