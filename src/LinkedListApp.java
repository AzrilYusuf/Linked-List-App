class Link {
    public int data;
    public Link next;

    // Constructor
    public Link(int data) {
        this.data = data;
    }

    public void displayLink() {
        System.out.print(data + " -> ");
    }
}

class LinkedList {
    private Link first;

    public LinkedList() {
        first = null; // assignment / initiate value
    }

    public boolean isEmpty() {
        return (first == null); // condition
    }

    public void insertFirst(int data) {
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public Link find(int key) {
        Link current = first;

        while (current.data != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;

        while (current.data != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        
        if (current == first) {
            first = first.next;
        } else {
            // data setelah previous sama dengan data setelah current jadi data current
            // dihapus
            previous.next = current.next;
        }
        return current;
    }

    public void displayList() {
        System.out.println("List (first --> last) :");

        Link current = first;

        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList theList = new LinkedList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);

        theList.displayList();
    }
}
