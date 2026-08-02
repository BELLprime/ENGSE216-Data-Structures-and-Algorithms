package Datastructure.LinkedList_Singly;
//no array

public class LinkedList {
    int count;
    Node head,tail,travel;

    public LinkedList(){
        this.count=0;
        this.head=tail=travel=null;
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
    //delete
    public Node delete() { //ต้องเอาไป check ข้างนอกต่อ 
        Node temp = tail;
        Node pre=null;
        travel=head;
        if (travel==null) {
            System.out.println("There's noting to delete.");
            temp=null;
        } else if (count==1) {
            head=null;
            tail=null;
            count--;
        } else {
            while(travel.link!=null) {
                pre=travel;
                travel=travel.link;
            }
            tail=travel;
            pre.link=null;
            count--;
        }
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
        travel=head;
        Node temp=null;
        while (travel!=null) {
            if (travel.info==itemAfter && travel.link!=null) { 
                temp=travel.link;//node that want to remove 
                travel.link=temp.link;//เอาlinkของ travel ไป connect กับ link ของ node that node (ข้าม that node ถ้า empty ก็ชี้null แทน )
                if (temp==tail){
                    tail=travel;
                }
                count--;
                break;
            } else if (travel.info==itemAfter && travel.link==null) {
                throw new IllegalArgumentException("Del Fail : After "+itemAfter+" is null.");
            }
            travel=travel.link;
        }
        return temp;
    }
    //display 
    void showALl (){
        System.out.println("=========================\nInfo node:");
        travel=head;
        while(travel!=null) {
            System.out.print(travel.info+" ");
            travel=travel.link;
        }
        System.out.println("");
    }
}
