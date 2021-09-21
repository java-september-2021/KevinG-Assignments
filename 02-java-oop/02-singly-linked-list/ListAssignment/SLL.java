package ListAssignment;

public class SLL {
    Node head;
    int size;

    public SLL() {
        this.head = null;
        this.size = 0;
    }

    public void addToListint(int val) {
        Node newMode = new Node(val);
        if (this.head == null) {
            this.head = newNode;
            System.out.println(val + " has been added as the head.");
            this.size++;

        } else {
            Node runner = this.head;
        }
        while (runner.next != null) {
            runner = runner.next;
        }
        runner.next = newNode;

    }

}
