package Datastructure;

public class Stack {
    private int arr[];
    private int top=-1;

    public Stack() { //constructor defualt
        this(5);
    }
    public Stack(int size) {//copy constructor
        arr = new int[size];
    }
    void push(int item) {
        if (!isFull()){
            top++;
            arr[top] = item;
        } else System.out.println("Array is full.");
    }
    int pop() {
        int temp = -1;
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            temp =arr[top];
            top--;
        }
        return temp;
    }
    //check
    int top() {
        int temp = -1;
        if (top<0) {
            System.out.println("Stack is empty.");
        } else temp = arr[top];
        return temp;
    }
    int size() {return top+1;}
    boolean isFull () {return top+1 == arr.length;}
    boolean isEmpty () {return top<0;}
    void showAll () {
        if (isEmpty()) {
            System.out.println("Collection is empty.");
            return;
        }
        for (int i = 0; i < top+1; i++) {
            System.out.println("Stack" + i + "] = " + arr[i]);
        }
    }
}
