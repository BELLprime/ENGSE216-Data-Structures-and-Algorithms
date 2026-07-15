package Datastructure;
public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Delete : "+ s.pop());
        s.showAll();
    }
}
