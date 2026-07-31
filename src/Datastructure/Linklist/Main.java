package Datastructure.Linklist;

public class Main {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        try {
            System.out.println("==============ADD=============");
            ls.add(1);
            ls.add(2);
            ls.add(3);
            ls.showALl();
            ls.addfirst(0);
            ls.showALl();
            ls.addAfter(2, 999);
            ls.showALl();
            System.out.println("==============DELETE=============");
            Node del = ls.deleteFirst();
            System.out.println("Del: "+del.info); 
            ls.showALl();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    }
}
