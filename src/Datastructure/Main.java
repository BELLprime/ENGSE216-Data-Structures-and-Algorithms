package Datastructure;
public class Main {
    public static void main(String[] args) {
        Queue_circlular q = new Queue_circlular(6);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.show();
        q.enqueue(7);
    }
}
