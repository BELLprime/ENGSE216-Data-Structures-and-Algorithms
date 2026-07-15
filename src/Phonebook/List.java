package Phonebook;

public class List {
    private int count;
    private final Database db;
    //con
    public List () {
        this(5);
    }
    public List (int arrSize) {
        this.db = new Database(arrSize);
    }
    //-------------------------------------funtion
    public void add (String fname, String lname, String tel) {
        if (!isFull()) {
            db.set(count,new Contact(fname, lname, tel));
            count++;
        } else System.out.println("The Array is Full.");
    }
    public void delete (int targetIdex) {
        if (!isEmpty()) {
            if (targetIdex >=0 && targetIdex <this.count) {
                for (int i=targetIdex; i<this.count-1 ;i++) { //index-1   --> outofbound && for//move position
                    db.set(i, db.getIndexC(i+1));//move
                }
                this.count--;
            } else System.out.println("Invalid index. Cannot delete.");
        }
    }
    public void edit (int indexs ,String fname, String lname, String tel) {
        if (!isEmpty()) {
            Contact c = db.getIndexC(indexs);
            c.setFname(fname);
            c.setLname(lname);
            c.setTel(tel);
        } else System.out.println("These index out of range the array.");
    }
    public void insert (int indexs,String fname, String lname, String tel) {
        if (!isFull()) {
            for (int i=count-1; i>=indexs;i--) { //move position backward
                db.set(i + 1, db.getIndexC(i));
            }
            db.set(indexs, new Contact(fname, lname, tel));
            count++;
        } else {
            System.out.println("Invalid index. Cannot insert.");
        }
    }
    public void sort () { //Bubble sort  
        Contact temp;
        int size = this.count;
        for (int i=0; i<size-1 ; i++) {
            for(int j=0; j<size-1-i ; j++) {
                if (db.getIndexC(j).getFname().compareTo(db.getIndexC(j+1).getFname()) > 0) {
                    temp = db.getIndexC(j);
                    db.set(j, db.getIndexC(j + 1));
                    db.set(j + 1, temp);
                }
            }
        }
    }
    //-------------------------------------check
    public boolean isFull() { return count == db.getSize(); }
    public boolean isEmpty () { return this.count == 0;}
    public void showCreateCount() {
        System.out.println("You have created " + this.count+ " of " + db.getSize());
    }
    public void show () {
        System.out.println("==========================================================================");
        System.out.printf("%-5s %-15s %-15s %-15s\n", "No.","First Name","Last Name","Phone Number"); {
            if (!isEmpty()) {
            for (int i=0; i<count ;i++) {   
                    System.out.printf("%-5d %-15s %-15s %-15s\n", i+1, db.getIndexC(i).getFname(), db.getIndexC(i).getLname(), db.getIndexC(i).getTel());
                }
            } else System.out.println("Array is empty.");                        
        }
    }
    //setup data
    public void setUp() {
        add("Athur", "Morgan", "665775757");
        add("Grandalf","The grey","99999999-9");
        add("Bruce", "Wayne", "5555522222-2");
    }
    
}
