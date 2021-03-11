public class LinkedList<T> {

    public void toAppend(int i) {
    }


    class Node<T>{
        T data;
        Node<T> Next;

        public Node(T data){
            this.data=data;
            this.Next=null;
        }
    }

    public Node<T> head=null;
    public Node<T> tail=null;

    public void addNode(T data){ // UseCase-1 add nodes in Linked List

        Node<T> newNode=new Node<T>(data);

        if (head==null) {

            head=newNode;
            tail=newNode;
        }
        else
            tail.Next=newNode;
        tail=newNode;

    }

    public void addAtStart(T data) { // UseCase-2 add nodes at first position in LinkedList

        Node<T> newNode = new Node<T>(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            Node temp = head;
            head = newNode;
            head.Next = temp;
        }
    }

    public void addAtEnd(T data) { //UseCase-3 add nodes at end position of Linked List
        Node<T> newNode = new Node<T>(data);
        if(head == null) {

            head = newNode;
            tail = newNode;
        }
        else {
            tail.Next = newNode;
            tail = newNode;
        }
    }

    public Node addAtmiddle(T data, int position){ // UseCase-5 middle position add node

        Node<T> newnode = new Node<T>(data);
        newnode.data = data;
        Node<T> cur = head;
        Node<T> prev = null;
        int count=0;
        while (count < position) {
            prev = cur;
            cur = cur.Next;
            count++;
        }
        newnode.Next = cur;
        if (prev != null) {
            prev.Next = newnode;
            return head;
        }
        return newnode;
    }


    public void deleteFirstElement() {

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {

            if(head != tail) {
                head = head.Next;
            }
            else {
                head = tail = null;
            }
        }
    }

    public void deleteLastElement() { // UseCase-6  delete last element in list
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            if(head != tail ) {
                Node current = head;
                while(current.Next != tail) {
                    current = current.Next;
                }
                tail = current;
                tail.Next = null;
            }
            else {
                head = tail = null;
            }
        }
    }

    public int searchNode(T data) { // UseCase-7 search node with key
        Node<T> current = head;
        int i = 1;
        boolean flag = false;

        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                if(current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.Next;
            }
        }
        if(flag)
            System.out.println("Element " +data+ " is present in the list at the position : " + i);
        else
            System.out.println("Element is not present in the list");
        return i=30;
    }

    public int insertAfter(Node<T> prev_node, T new_data) // UseCase-8 add node after given node
    {
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return 0;
        }
        Node<T> new_node = new Node<T>(new_data);

        new_node.Next = prev_node.Next;

        prev_node.Next = new_node;
        return 40;
    }

    int deleteGivenNode(T key) // UseCase-8 delete given node in linked list
    {

        Node<T> temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.Next;
            return 0;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.Next;
        }
        if (temp == null)
            return 0;

        prev.Next = temp.Next;
        return 30;
    }

    public <T> void sortList() // UseCase-9 sort linked list in ascending order
    {
        Node current=head;
        Node index=null;
        T temp;

        if(head == null)
        {
            return;
        }
        else
        {
            while(current != null)
            {
                index=current.Next;
                while(index != null)
                {
                    if(((Comparable<T>) current.data).compareTo((T) index.data)>0)
                    {
                        temp=(T) current.data;
                        current.data=index.data;
                        index.data=temp;
                    }
                    index=index.Next;
                }
                current=current.Next;
            }
        }
    }

    public void display()
    {
        Node current=head;
        int size=0;

        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        else
        {
            System.out.println("Values of list are: ");
            while(current!=null)
            {
                System.out.println(current.data+" ");
                size++;
                current=current.Next;
            }
            System.out.println("List size is: "+size);
        }
    }

    public void displayList() { // UseCase-10 display linked List
        Node<T> current=head;

        if (head==null){

            System.out.println("list is empty");
        }
        else {
            System.out.println("singly linked list: ");
            while (current != null) {

                System.out.println(current.data + "");
                current = current.Next;
            }

        }
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.addNode(56);
        //list.addNode(30);
        list.addNode(40);
        list.addNode(70);
        list.addAtmiddle(30,1);
        list.displayList();
        list.sortList();
        list.displayList();


    }

}