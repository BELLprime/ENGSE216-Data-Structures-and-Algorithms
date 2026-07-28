package Datastructure;

public class Queue_circlular {
    int arr[] ;
    int front,rear;
    public Queue_circlular() {
        this(5);
    }
    public Queue_circlular(int size) {
        this.arr = new int[size];
        this.front=this.rear=-1; //for indicate in case empty
    }
    void enqueue (int item){ //increment rear
        if (isEmpty()) {
            this.front=0;
            this.rear=0;
            arr[rear]=item;
        } else {
            rear=(rear+1)%size(); //++
            if (isFull()){
                System.out.println("Queue is Full, "+item+" will not collect." );
                // return to previous value
                rear = (rear - 1 + size()) % size(); //-- not change
            } else {
                arr[rear]=item;//store
            }
        }
    }
    int dequeue () { //increment front
        int data=-1;
        if (!isEmpty()) {
            data = arr[front];
            if (isFull()) {
                  // Reset front and rear to -1 to indicate an empty queue
                front = -1;
                rear = -1;  
            } else front = (front + 1) % size(); //f++  
        } 
       else System.out.println("Queue is empty. Cannot dequeue.");
        return data;
    }
    //check
    boolean isFull() {return front==rear;}
    boolean isEmpty() {return front==-1&&rear==-1;}
    int size() {return arr.length; }
    //display
    void showVal() {
        System.out.println("CurrentFront: " + this.front);
        System.out.println("CurrentRear: " + this.rear);
    }
    void showArr() {
        System.out.print("arr[" + size() + "] =");
        for(int i=0;i<arr.length;i++) {
            System.out.print( " " + arr[i] );
        }
        System.out.println("");
        showVal();
    }
}
