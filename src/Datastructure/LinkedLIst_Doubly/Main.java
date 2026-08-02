package Datastructure.LinkedLIst_Doubly;

public class Main {
    public static void main(String[] args) {
        DLL ls=new DLL(); 
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.behide_insert(5, 3);
        ls.showAll();
    }
}
