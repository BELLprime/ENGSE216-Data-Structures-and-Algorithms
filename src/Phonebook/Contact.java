package Phonebook;

public class Contact {
    private String Fname;
    private String Lname;
    private String Tel;

    public Contact(String fname, String lname, String tel) { //input --->new
        this.Fname=fname;
        this.Lname=lname;
        this.Tel=tel;      
    }
    //get
    public String getFname() {return Fname;}
    public String getLname() {return Lname;}
    public String getTel() {return Tel;}
    //set
    public void setFname(String fname) {this.Fname=fname;}
    public void setLname(String lname) {this.Lname=lname;}
    public void setTel(String tel) {this.Tel=tel;}
}
