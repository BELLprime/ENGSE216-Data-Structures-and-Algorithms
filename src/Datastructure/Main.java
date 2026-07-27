package Datastructure;
public class Main {
    public static void main(String[] args) {
        Queue_circlular q = new Queue_circlular(3);
        
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.showArr();
        q.showActive();

        System.out.println("===================================");

        System.out.println("Dequeue: " + q.dequeue()); 
        System.out.println("Dequeue: " + q.dequeue()); 
        System.out.println("Dequeue: " + q.dequeue()); 
        q.enqueue(2);
        q.showArr();
        q.showActive();
    
    }
}
