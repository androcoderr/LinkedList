public class CircularSingularLinkedList {
    Node head;

    public static CircularSingularLinkedList insertToStartCircularList(CircularSingularLinkedList list,int data){
        Node newNode=new Node(data);
        Node currentNode=list.head;
        if (list.head==null){
            list.head=newNode;
        }else{

            while(currentNode.next!=list.head){
                currentNode=currentNode.next;
            }
            newNode.next=list.head;
            currentNode.next=newNode;
            list.head=newNode;
        }

        return list;
    }

    public static CircularSingularLinkedList insert(CircularSingularLinkedList list,int data,int key) {
        Node newNode = list.head;
        Node insertedNode = new Node(data);
        if (newNode == null) {
            newNode = list.head;
        }else {
            while (newNode != null && newNode.data != key) {
                newNode = newNode.next;
            }
            insertedNode.next = newNode.next;
            newNode.next = insertedNode;
        }
        return list;
    }

    public static CircularSingularLinkedList insertToEndCircularList(CircularSingularLinkedList list,int data){
        Node newNode=new Node(data);
        if (list.head==null){
            list.head=newNode;
        }else{
            Node temp=list.head;
            while (temp.next!=list.head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=list.head;
        }
        return list;
    }
    public static CircularSingularLinkedList deleteToStart(CircularSingularLinkedList list){
        Node currNode=list.head;
        if (list.head==null){
            return list;
        }else{
            while (currNode.next!=list.head){
                currNode=currNode.next;
            }
               list.head=list.head.next;
               currNode.next=list.head;

        }
        return list;
    }

    public static CircularSingularLinkedList deleteFromToEndCirculurList(CircularSingularLinkedList list){

        if(list.head== null){
            return list;
        }else{
            Node current=list.head;
            while (current.next.next!=list.head){
                current=current.next;
            }
            current.next=list.head;
        }
        return list;
    }
    public static CircularSingularLinkedList deleteCircularList(CircularSingularLinkedList list,int key){
        Node newNode=list.head;
        Node temp=null;
        if (newNode!=null&& key==newNode.data){
            newNode=newNode.next;

        }
        while (newNode!=null && key!=newNode.data){
            temp=newNode;
            newNode=newNode.next;
        }
        if (newNode!=null){
            temp.next=newNode.next;


        }if (newNode== null){
            System.out.println(" key is not found! ");
        }
        return list;
    }
    
    public void printList(CircularSingularLinkedList list){
        Node currentNode=list.head;
        while (currentNode.next!=list.head){
            System.out.println(currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }




}
