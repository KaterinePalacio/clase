
package workshop1;
// se importa la librería necesaria para la variable "colors"
import java.util.ArrayList; 

public class Fruit { 
    // se crean variables
    public String name;
    private float averageWeigh;
    public ArrayList<String> colors = new ArrayList(); // se define un lista de Strings llamada "colors" para almacenar un lista de colores

    public Fruit() { //se crea constructor vacío
    }
    
    // se crean getter y setter de la variable colors
    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColor(ArrayList<String> colors) {
        this.colors = colors;
    }
    
    
}
