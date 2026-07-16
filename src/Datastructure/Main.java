package Datastructure;
public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("data size : " + q.size());
        q.showQueue();
        q.dequeue();
        q.dequeue();
        q.showQueue();
    }
}
