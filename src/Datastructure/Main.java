package Datastructure;
public class Main {
    public static void main(String[] args) {
        Queue_circlular q = new Queue_circlular(3);
        q.enqueue(5);
        q.enqueue(6);
        q.showArr();
        System.out.println("===================================");
        System.out.println("Dequeue : " + q.dequeue());
        q.showArr();
        System.out.println("===================================");
        q.enqueue(9);
        q.showArr();

        System.out.println("===================================");

        
    }
}
