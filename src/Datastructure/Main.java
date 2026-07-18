package Datastructure;
public class Main {
    public static void main(String[] args) {
        Queue_circlular q = new Queue_circlular(3);
        
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.showforloop();
        System.out.println("Peek: " + q.currentQueue());
        System.out.println("===================================");
        System.out.println("Dequeue: " + q.dequeue()); 
        System.out.println("Dequeue: " + q.dequeue()); 
        q.showforloop();
        System.out.println("Peek: " + q.currentQueue());
        System.out.println("===================================");
        q.enqueue(8);
        q.showforloop();
        System.out.println("Peek: " + q.currentQueue());
        System.out.println("===================================");
        System.out.println("Dequeue: " + q.dequeue()); 
        q.showforloop();
        System.out.println("Peek: " + q.currentQueue());
        System.out.println("===================================");


    }
}
