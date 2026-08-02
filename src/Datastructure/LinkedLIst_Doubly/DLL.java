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
    //front_remove() {}
    //behide_remove() {}
    //remove() {} 
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
        System.out.println("\nCurrent head: "+this.head.info +
                           "\nCurrent tail: "+this.tail.info +
                           "\nCurrent count: "+this.count);
    }
    //searc() {}
}
