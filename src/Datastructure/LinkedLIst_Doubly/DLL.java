package Datastructure.LinkedLIst_Doubly;

public class DLL {
    int count;
    DNode head,tail,travel;

    public DLL(){
        this.count=0;
        this.head=tail=travel=null;
    }

    void add(int item) {
        DNode nn=new DNode(item);
        if (count==0){
            head=nn;
            tail=nn;
        } else {
            tail.Rlink=nn;
            nn.Llink=tail;
            tail=nn;
        }
        count++;
    }
    void front_insert(int item,int targetItem) {
        DNode nn=new DNode(item);
        travel=head;
        while(travel!=null) {
            if(travel.info==targetItem) {
                if (travel==head){ //case targetItem == head
                    nn.Rlink=head;
                    head.Llink=nn;
                    head=head.Llink;
                } else {
                    nn.Rlink=travel;
                    nn.Llink=travel.Llink;
                    travel.Llink.Rlink=nn;
                    travel.Llink=nn;
                }
                count++;
                break;
            }
            travel=travel.Rlink;//move
        } 
    }
    void behide_insert(int item,int targetitem) {
        DNode nn=new DNode(item);
        travel=head;
        while(travel!=null) {
            if (travel.info==targetitem) {
                if (travel==tail) {//case targetItem == tail
                    nn.Llink=tail;
                    tail.Rlink=nn;
                    tail=tail.Rlink;//move
                } else {
                    nn.Llink=travel;
                    nn.Rlink=travel.Rlink;
                    travel.Rlink.Llink=nn;
                    travel.Rlink=nn;
                } 
                count++;
                break;
            } 
            travel=travel.Rlink;
        }

        
    }
    DNode remove() {
        if (head == null) {
            throw new IllegalStateException("Linked list is empty.");
        }
        DNode temp = tail;
        if (count == 1) {head=tail=null;} 
        else {
            tail = tail.Llink;
            tail.Rlink = null;
        }
        count--;
        return temp;
    }
    DNode front_remove(int targetItem) {
        DNode temp=null;
        travel=head;
        while (travel!=null){ //find target
            if (travel.info==targetItem) {break;}
            travel=travel.Rlink;
        }
        if (travel!=head) {
            temp=travel.Llink; //collect and return
            if (temp==head) { //case temp=head
                head=temp.Rlink; //move head
                temp.Rlink=travel.Llink=null;
            } else { 
                travel.Llink=temp.Llink;
                temp.Llink.Rlink=travel;
                temp.Llink=temp.Rlink=null;
            } 
            count--;
        }
        return temp;
    }
    DNode behide_remove(int targetItem) {
        DNode temp=null;
        travel=head;
        while(travel!=null) {//find targeItem
            if (travel.info==targetItem) {break;}
            travel=travel.Rlink;
        }
        if (travel!=tail) {
            temp=travel.Rlink; //collect and return
            if (temp==tail) {
                tail=tail.Llink;
                temp.Llink=travel.Rlink=null;
            } else {
                temp.Rlink.Llink=travel;
                travel.Rlink=temp.Rlink;
                temp.Llink=temp.Rlink=null;
            }
            count--;
        }
        return temp;
    }
    void showAll() {
        System.out.print("=========================\nInfo node:");
        travel=head;
        while(travel!=null) {
            System.out.print(travel.info+" ");
            travel=travel.Rlink;
        }
        showval();
    }
    void showval(){
        if (head!=null&&tail!=null) {
            System.out.println("\nCurrent head: "+this.head.info +
                           "\nCurrent tail: "+this.tail.info +
                           "\nCurrent count: "+this.count);
        }
    }
    //searc() {}
}
