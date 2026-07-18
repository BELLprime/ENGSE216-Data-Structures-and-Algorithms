package Datastructure;

public class Queue_circlular {
    int arr[] ;
    int front,rear,count;
    public Queue_circlular() {
        this(5);
    }
    public Queue_circlular(int size) {
        this.arr = new int[size];
        this.count=0;
        this.front=-1;
        this.rear=-1;
    }
    void enqueue(int item) {  
        if (!isFull()) {
            if (isEmpty()) {//work at init(first time)  
                this.front=0;
                this.rear=0;
                arr[rear]=item;
                count++;
            } else {//after inti
                rear=(rear+1)%arr.length;  //0%5=0  1%5=1   2%5=2  3%5=3  4%5=4  5%5=0-->[new index]  
                //rear start at 1  
                arr[rear]=item;
                count++;
            }
        } else System.out.println("Queue is full," + item + " will not collect.");
    }
    int dequeue() {
        int data=-1;
        if (!isEmpty()) {
            data = arr[this.front];
            if (front ==rear) {//force reset to empty.
                this.front =-1;
                this.rear=-1;
            } else front=(front+1)%arr.length;
            count--;
        } else System.out.print("Queue is empty,You can't dequeue.");
        return data;
    }
    //check
    boolean isEmpty(){return this.front==-1&&this.rear==-1;}
    boolean isFull(){return count == arr.length;}
    int size (){return this.arr.length;}
    public int peek() 
    {
        if (!isEmpty()) {return arr[front];} 
        else {
            System.out.println("Queue is empty. No peek value.");
            return -1; 
        }
    }
    //display
    void showVal() {
        System.out.println("CurrentFront: " + this.front);
        System.out.println("CurrentRear: " + this.rear);
        System.out.println("CurrentCount: " + this.count);
    }
    void showArr() {
        System.out.print("arr[" + size() + "] =");
        for(int i=0;i<arr.length;i++) {
            System.out.print( " " + arr[i] );
        }
        System.out.println("");
    }
    void showActive() {
        System.out.print("active(" + count + ") =");
        for (int i = 0; i < count; i++) {
            System.out.print(" " + arr[(front + i) % arr.length]);
        }
    System.out.println();
    }
}
