
package workshop1;
import java.util.Scanner;

public class Teacher {
    private int id;
    public int age;
    protected String course;
    Scanner library = new Scanner(System.in);

    public Teacher() { //se crea constructor vacío
    }

    public int getId() { 
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    // se crean metodos vacíos para ingresar información de variables
    private void EnterId(){
      System.out.println("Enter teacher ID");
      id = library.nextInt();
    
    }
    
    public void EnterAge(){
        
      System.out.println("Enter teacher age");
      age = library.nextInt();
    }
    
    protected void EnterCourse(){
      System.out.println("Enter course taught by the teacher");
      course = library.next();
    
    }
    
}
