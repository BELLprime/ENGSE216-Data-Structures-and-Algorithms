package Datastructure.Linklist;
//no array

public class LinkedList {
    int count;
    Node head,tail,travel;

    void addfirst(int item){ //NO.2
        if (count==0){
            add(item);
        } else {
            Node nn =new Node(item);
            nn.link = head;//link->next to node
            head=nn;//move head
            count++;
        }
    }
    void add(int item) { //NO.1
        Node nn =new Node(item);
        if (count==0) {
            head=nn;
            tail=nn;
        }else {
            tail.link=nn;// link
            tail=nn;  //ขยับ
        }
        count++;
    }
    void addAfter(int insertafter,int itme) {
        travel=head;
        while (travel!=null) {
            if (travel.info==insertafter) {
                Node nn=new Node(itme);
                nn.link = travel.link;//= next node of travel(Reconnect link)
                travel.link = nn;//change pointer to newnode.
                if (travel==tail) {
                    tail=nn;
                }
                count++;
                break;
            } 
            travel=travel.link;//next node
        }
    }
    //del
    public Node delete() { //ต้องเอาไป check ข้างนอกต่อ 
        if (count==0) {
            System.out.println("There's noting to delete.");
            return null;
        } 
        Node temp = tail;
        if (count==1) {
            head=null;
            tail=null;
        } else {
            travel=head;                                                  //head,travel          tail
            for(int i=0;i<count-2;i++){//get previous of the last node (-2)  [n1]       [n2]     [n3]
                travel=travel.link; //i=0 -> travel=node2
            }
            tail=travel;
            travel.link=null;
        }
        count--;
        return temp;
    }
    public Node deleteFirst() {
        Node temp=null;
        if (head!=null){
            temp=head;
            head=head.link;
            count--;
            if (count==0) {
                tail=null;
            }
        } return temp;
    }
    public Node deleteAfter(int itemAfter) {
        Node temp=null;
        travel=head;
        while(travel!=null ){
            if (travel.info==itemAfter) {
                temp=travel.link;
                travel.link=temp.link;
                if (travel==tail) {
                    tail=travel;
                }
                count--;
                break;
            }
            travel=travel.link; 
        }
        return temp;
    }
    //display 
    void showALl (){
        System.out.println("=========================");
        travel=head;
        for(int i=0;i<count;i++){
            System.out.print(travel.info + " ");
            travel=travel.link;
        }
        System.out.println("");
    }
}
