
package workshop1;

public class BankAccount {
    // se crean variables
    private int accountNumber;
    protected boolean activated;

    public BankAccount() { //se crea constructor vacío
    }

    // se crean getter y setter de la variable Activated
    public boolean isActived() {
        return activated;
    }

    public void setActived(boolean activated) {
        this.activated = activated;
    }
    
    
}
