package Datastructure;
public class Collection {
    int data[] = new int[5];
    int count;
    
    void add(int data) {
        if (!isFull()) {
            this.data[count] = data;
            count++;
        } else {
            System.out.println("Cannot add " + data + ": Collection is full.");
        }
    }
    int remove(int id) {
        int temp = -1;
        // Check if the collection is not empty AND the index is valid
        if (!isEmpty() && id >= 0 && id < count) {
            temp = data[id];
            data[id] = data[count - 1];
            count--;
        } else {
            System.out.println("Invalid ID or Collection is empty.");
        }
        return temp;
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

