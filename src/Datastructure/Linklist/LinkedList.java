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
            nn.link = head;
            head=nn;
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

    void showALl (){
        System.out.println("=========================");
        travel=head;
        for(int i=0;i<count;i++){
            System.out.println(travel.info + " ");
            travel=travel.link;
        }
    }
}
