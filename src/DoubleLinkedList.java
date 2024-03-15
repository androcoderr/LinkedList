public class DoubleLinkedList{
    Node head;
    public static DoubleLinkedList doubleLinkedList(DoubleLinkedList list){
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next=second;
        second.previous=head;
        second.next=third;
        third.previous=second;
        Node current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
        return list;

    }

    public static DoubleLinkedList insertToStartDoubleList(DoubleLinkedList list,int data){
        Node newNode=new Node(data);
        if (list.head==null){
            list.head=newNode;
        }else{
            newNode.next=list.head;
            list.head.previous=newNode;
            list.head=newNode;
        }

        return list;
    }

    public static DoubleLinkedList insert(DoubleLinkedList list,int data,int key) {
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

    public static DoubleLinkedList insertToEndDoubleList(DoubleLinkedList list,int data){
        Node newNode=new Node(data);
        if (list.head==null){
            list.head=newNode;
        }else{
            Node temp=list.head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.previous=temp;
        }
        return list;
    }
    public static DoubleLinkedList deleteToStart(DoubleLinkedList list){
        if (list.head==null){
            return list;
        }else{
            list.head=list.head.next;
            list.head.previous=null;
        }
        return list;
    }

    public static DoubleLinkedList deleteFromToEndDoubleList(DoubleLinkedList list){

        if(list.head== null){
            return list;
        }else{
            Node current=list.head;
            while (current.next!=null){
                current=current.next;
            }
            current.previous.next=null;
        }
        return list;
    }
    public static DoubleLinkedList deleteDoubleList(DoubleLinkedList list,int key){
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
            newNode.next.previous = null;
            temp.next.previous = temp;
        }if (newNode== null){
            System.out.println(" key is not found! ");
        }
        return list;
    }


    public void printList(DoubleLinkedList list){
        Node currentNode=list.head;
        while (currentNode!=null){
            System.out.println(currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }




}
