
package Actividad_4_POO_Swing;
import java.util.*;
import javax.swing.DefaultListModel;

public class ListaPersonas {
    Vector listaPersonas;
    
    public ListaPersonas() {
    listaPersonas=new Vector();
    }
    
    public void agregarPersona(Persona p) {
    listaPersonas.addElement(p);
    }   
    
    public void eliminarPersona(int i) {
    DefaultListModel modelo= new DefaultListModel();
    modelo.removeElementAt(i);
    }
    
    public void borrarLista() {
    DefaultListModel modelo= new DefaultListModel();
    modelo.removeAllElements();
    }
    
    

}
