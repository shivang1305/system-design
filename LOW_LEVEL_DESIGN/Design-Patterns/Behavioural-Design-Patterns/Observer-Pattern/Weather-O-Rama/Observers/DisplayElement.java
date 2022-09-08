package Observers;

public interface DisplayElement {
    public void display(); // this method is declared here seperately from observer interface because every
                           // observer should display something it's not neccassary.
}
