package Datastructure.LinkedLIst_Doubly;

public class Main {
    public static void main(String[] args) {
        DLL ls=new DLL(); 
        try {
            ls.add(1);
            ls.add(2);
            ls.add(3);
            DNode del= ls.behide_remove(1);
            System.out.println("Delete: " + del.info);
            ls.showAll();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
