package Datastructure;
public class Set {

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
            if (!search(data)){
                this.data[count] = data;
                count++;
            }
            
        } else {
            System.out.println("Cannot add " + data + ": Collection is full.");
        }
    }
    int remove(int id) {
        int temp = -1;
        // Check if the collection is not empty AND the index is valid
        if (!isEmpty() && id >= 0 && id < count) {
            temp = data[id];
            // Replace the removed item with the last item in the array
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

