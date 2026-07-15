package Phonebook;

public class Database {
    private Contact[] contacts ; 
    private int arrSize;

    public Database () {//con
        this(5);
    }
    public Database (int arrSize) {//Master con or Con Chaining
        this.arrSize = arrSize;
        this.contacts = new Contact[arrSize];
    }
    //set                                     
    public void set(int index,Contact c) {    
        this.contacts[index] = c;
    }
    //get
    public int getSize() {return this.arrSize;} 
    public Contact getIndexC (int index) {return contacts[index];} 
}
