
package workshop1;
import java.util.Scanner;

public class Student {
    private int id;
    public int age;
    protected int note1, note2, note3;
    Scanner library = new Scanner(System.in);
    
    public Student() { //se crea constructor vacío
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    // se crean metodos vacíos para ingresar información de variables
    private void EnterId(){
      System.out.println("Enter student ID");
      id = library.nextInt();
    
    }
    
    public void EnterAge(){
        
      System.out.println("Enter student age");
      age = library.nextInt();
    }
    
    protected void EnterNote(){
        System.out.println("Enter note number 1");
        note1 = library.nextInt();
        System.out.println("Enter note number 2");
        note1 = library.nextInt();
        System.out.println("Enter note number 3");
        note1 = library.nextInt();
    }
    
    
            }
