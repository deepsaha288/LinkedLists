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
}
