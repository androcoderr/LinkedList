public class LinkedList {
    Node head;

    public LinkedList insertToEnd(LinkedList list,int data) {
        Node newNode=new Node(data);
        newNode.next=null;
        if (list.head==null){
            list.head=newNode;
        }else{
            Node current=list.head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
        return list;
    }

    public LinkedList insertToBeginning(LinkedList list,int data){
        Node newNode=new Node(data);
        if (list.head==null){
            list.head=newNode;
        }else{
            newNode.next=list.head;
            list.head=newNode;
        }
        return list;
    }
    void deleteList(){
        head=null;
    }
    public LinkedList deleteFromBegining(LinkedList list){
        list.head=list.head.next;
        System.out.println("\n Head node is deleted");
        return list;
    }
    public LinkedList deleteFromEnd(LinkedList list){
        Node current=list.head;
        while (current.next.next!=null){
            current=current.next;
        }
        current.next=null;
        return list;
    }
    public LinkedList delete(LinkedList list,int key){
        Node curretNode=list.head;
        Node temp=null;
        if (curretNode!=null && curretNode.data==key){
            list.head=curretNode.next;
            System.out.println(key +"found and deleted");
            return list;
        }
        while (curretNode!=null&& curretNode.data!=key){
            temp=curretNode;
            curretNode=curretNode.next;
        }
        if ( curretNode!=null){
            temp.next=curretNode.next;
            System.out.println("\n"+key+"found and deleted");
        }
        if (curretNode==null){
            System.out.println("not found!");
        }
        return list;
    }
    public void printList(LinkedList list){
        Node currentNode=list.head;
        while (currentNode!=null){
            System.out.println(currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }
   public void searchNode(LinkedList list,int data){
        Node currentNode=list.head;
        boolean flag=false;
        while (currentNode!=null){
            if (currentNode.data==data){
                System.out.println("\n node is found ");
                flag=true;
                break;
            }
            currentNode=currentNode.next;
        }
        if (flag==false){
            System.out.println("\n node is not found!");
        }

   }
   public static LinkedList doubleLinkedList(LinkedList list){
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

  public static LinkedList insertToStartDoubleList(LinkedList list){
        Node newNode=new Node(6);
        if (list.head==null){
            list.head=newNode;
        }else{
            newNode.next=list.head;
            list.head.previous=newNode;
            list.head=newNode;
        }

     return list;
  }

  public static LinkedList insert(LinkedList list, int data,int key){
        Node currentNode=list.head;
        Node inserNode=new Node(data);
        if (currentNode==null){
            return list;
        }else {
            while (currentNode.next != null && currentNode.data != key) {
                currentNode = currentNode.next;
            }
            inserNode.next = currentNode.next;
            currentNode.next = inserNode;

        }
        return list;
  }

    public static LinkedList insertToEndDoubleList(LinkedList list){
        Node newNode=new Node(8);
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
    public static LinkedList deleteToStart(LinkedList list){
        if (list.head==null){
           return list;
        }else{
            list.head=list.head.next;
            list.head.previous=null;
        }
      return list;
    }

    public static LinkedList DeleteFromToEndDoubleList(LinkedList list){

        if(list.head== null){
            return list;
        }else{
            Node current=list.head;
            while (current.next!=null){
                current=current.next;
            }
            current=current.previous;
            current.next = null;
        }
        return list;
    }
    public static LinkedList deleteDoubleList(LinkedList list,int key){
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



















}
