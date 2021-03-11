import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class LinkedListTest {


    @Test
    public void addNode() {
        LinkedList list = new LinkedList();
        list.addNode(56);
        list.addNode(30);
        list.addNode(70);
        list.displayList();

    }

    @Test
    public void addAtStart() {
        LinkedList list = new LinkedList();
        System.out.println("insert  node at first position");
        list.addAtStart(56);
        list.addAtStart(30);
        list.addAtStart(70);
        list.displayList();
    }

    @Test
    public void addAtEnd() {
        LinkedList list = new LinkedList();
        System.out.println("insert  node at last position");
        list.addAtEnd(56);
        list.addAtEnd(30);
        list.addAtEnd(70);
        list.displayList();
    }

    @Test
    public void addAtMiddle() {
        LinkedList list = new LinkedList();
        list.addAtEnd(56);
        list.addAtEnd(70);
        list.displayList();
        list.addAtmiddle(30,1);
        list.displayList();
    }

    @Test
    public void deleteFirstElement() {
        LinkedList list = new LinkedList();
        list.addAtEnd(56);
        list.addAtStart(30);
        list.addAtEnd(70);
        list.displayList();
        list.deleteFirstElement();
        list.displayList();
    }

    @Test
    public void deleteLastElement() {
        LinkedList list = new LinkedList();
        list.addAtEnd(56);
        list.addAtStart(30);
        list.addAtEnd(70);
        list.displayList();
        list.deleteLastElement();
        list.displayList();
    }

    @Test
    public void searchNodeEx() {
        LinkedList list = new LinkedList();
        list.addAtEnd(56);
        list.addAtStart(30);
        list.addAtEnd(70);
        list.displayList();
        int output =list.searchNode(30);
        Assertions.assertEquals(30,output);
    }
    @Test
    public void insertAfter() {
        LinkedList list = new LinkedList();
        list.addAtEnd(56);
        list.addAtStart(30);
        list.addAtEnd(70);
        list.displayList();
        System.out.println("Inserting after 30");
        int output=list.insertAfter(list.head.Next,40);
        list.displayList();
        Assertions.assertEquals(40,output);
    }

    @Test
    public void deleteGivenNode(){
        LinkedList list = new LinkedList();
        list.addNode(56);
        list.addNode(30);
        list.addNode(70);
        System.out.println("After deleting");
        int result=list.deleteGivenNode(30);
        list.displayList();
        Assertions.assertEquals(30,result);
    }

    @Test
    public void Sortlist() {
        LinkedList list = new LinkedList();
        list.addNode(56);
        list.addNode(30);
        list.addNode(70);
        System.out.println("After sorting");
        list.sortList();
        list.displayList();
    }
}
