package Datastructure;
public class List {
    int data[] = new int[5];
    int count;
    //
    boolean found=false;

    boolean search(int item) {
        int i = 0;
        while (i < count) {
            if (data[i] == item) {
                i=count;
                found=true;
            }
        }
        return found;
    }
    void add(int data) {
        if (!isFull()) {
            this.data[count] = data;
            count++;
        } else {
            System.out.println("Cannot add " + data + ": Collection is full.");
        }
    }

    void delete(int k) {
        //count = n
        if (k >= 0 && k < count) {
            for (int i = k; i < count ; i++) {
                data[i] = data[i + 1]; 
            }
            count--; 
        } else {
            System.out.println("Invalid index. Cannot delete.");
        }
    }
    void insert (int k , int item) {
        if (!isFull()) {
           if (k >= 0 && k < count) {
                for (int n=count-1;n>=k;n--){
                    data[n+1] = data[n];
                }
                data[k] = item;
                count++;
            }
        }  
    }

    int size() {
        return count;
    }
    boolean isFull () {
        return count == data.length;
    }
    boolean isEmpty () {
        return count == 0;
    }
    
    void showAll() {
        if (isEmpty()) {
            System.out.println("Collection is empty.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("Collection[" + i + "] = " + data[i]);
        }
    }

}
