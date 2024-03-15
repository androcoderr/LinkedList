public class DoubleCircularLinkedList {
    Node head;
    Node tail;

    public static DoubleCircularLinkedList insertToStartDoubleCircularList(DoubleCircularLinkedList list,int data){
        Node newNode=new Node(data);
        Node tempNode=list.head;
        if (tempNode==null){
            list.head=newNode;
        }else{
            while (tempNode.next!=list.head){
                tempNode=tempNode.next;
            }
            newNode.next=list.head;
            list.head.previous=newNode;
            list.head=newNode;
            tempNode.next=newNode;
        }


        return list;
    }

    public static DoubleCircularLinkedList insert(DoubleCircularLinkedList list,int data,int key) {
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
            insertedNode.previous = newNode;

        }
        return list;
    }

    public static DoubleCircularLinkedList insertToEndDoubleCircularList(DoubleCircularLinkedList list,int data){
        Node newNode=new Node(data);
        if (list.head==null){
            list.head=newNode;
        }else{
            Node temp=list.head;
            while (temp.next!=list.head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.previous=temp;
            newNode.next=list.head;
        }
        return list;
    }
    public static DoubleCircularLinkedList deleteToStartDoubleCircular(DoubleCircularLinkedList list){
        Node currNode=list.head;
        if (currNode==null){
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

    public static DoubleCircularLinkedList deleteFromToEndDoubleCircularList(DoubleCircularLinkedList list){
    Node temp =null;
        if(list.head== null){
            return list;
        }else{
            Node current=list.head;
            while (current.next.next!=list.head){
                temp=current;
                current=current.next;
            }
            current.next=list.head;
            current.previous=temp;

        }
        return list;
    }
    public static DoubleCircularLinkedList deleteDoubleList(DoubleCircularLinkedList list,int key){
        Node newNode=list.head;
        Node temp=null;
        if (newNode!=null&& key==newNode.data){
            newNode=newNode.next;
            newNode.previous=null;
        }
        while (newNode!=null && key!=newNode.data){
            temp=newNode;
            newNode=newNode.next;
        }
        if (newNode!=null){
            temp.next=newNode.next;
            newNode.previous = null;
            temp.next.previous = temp;
        }if (newNode== null){
            System.out.println(" key is not found! ");
        }
        return list;
    }


    public void printList(DoubleCircularLinkedList list){
        Node currentNode=list.head;
        while (currentNode!=null && currentNode.next!=list.head){
            System.out.println(currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }

}
