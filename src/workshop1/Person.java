
package workshop1;
// se importa librería necesaria para variable "Date"
import java.util.Date;


public class Person { // clase persona con herencia de la clase fecha para instanciar variable "Date"
   public String name;
   public String lastName1;
   public String lastName2;
   public Date dateBirth;
   public float height;

    public Person() { //se crea constructor vacío
    }

    // se crean getter y setter de la variable Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
   
   
}
