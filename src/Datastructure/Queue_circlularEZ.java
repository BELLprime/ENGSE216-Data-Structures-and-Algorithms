package Datastructure;

public class Queue_circlularEZ {
    int arr[] ;
    int front,rear,count;
    public Queue_circlularEZ() {
        this(5);
    }
    public Queue_circlularEZ(int size) {
        this.arr = new int[size];
        this.count=0;
        this.front=0;
        this.rear=-1;
    }
    void enqueue(int item) {  
        if (!isFull()) { 
            rear=(rear+1)%arr.length;  //0%5=0  1%5=1   2%5=2  3%5=3  4%5=4  5%5=0-->[new index]   
            arr[rear]=item;
            count++;
        } else System.out.println("Queue is full," + item + " will not collect.");
    }
    int dequeue() {
    int data=-1;
    if (!isEmpty()) {
        data = arr[this.front];
        front=(front+1)%arr.length;
        count--;
    } else System.out.print("Queue is empty,You can't dequeue.");
    return data;
}
    //check
    boolean isEmpty(){return count==0;}
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
        showVal();
    }
    void showActive() {
        System.out.print("active(" + count + ") =");
        for (int i = 0; i < count; i++) {
            System.out.print(" " + arr[(front + i) % arr.length]);
        }
    System.out.println();
    }
}

