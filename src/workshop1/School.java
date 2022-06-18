
package workshop1;
import java.util.Scanner;

public class School {
    private int nit;
    public int numberStudent;
    public int numberTeacher;
    protected double registrationValue;
    Scanner library = new Scanner(System.in);

    public School() { //se crea constructor vacío
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
    
 // se crean metodos vacíos para ingresar información de variables
   private void EnterNit(){
      System.out.println("Enter school nit");
      nit = library.nextInt();
    
    }
   
   public void EnterNumberStuTea(){
     System.out.println("Enter number of students");
     numberStudent = library.nextInt();
     System.out.println("Enter number of teachers");
     numberTeacher = library.nextInt();
   
   }
   
   protected void EnterRegValue(){
      System.out.println("Enter the registration fee");
      registrationValue = library.nextDouble();
   
   }
}
