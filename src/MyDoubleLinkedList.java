public class MyDoubleLinkedList {
    private Node head;
    private Node tail;

    public void add(Song song) {
        Node newNode = new Node(song);
        if (tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.setNext(newNode);
        newNode.setPrev(tail);
        tail = newNode;
    }

    public void addFirst(Song song) {
        Node newFirstNode = new Node(song);
        newFirstNode.setNext(head);
        head.setPrev(newFirstNode);
        head = newFirstNode;
    }

    public void playFirst() {
        System.out.println(head.getData().getNazev() + " (" + head.getData().getInterpret() + ")["+head.getData().getDelkaS()+"s] -> ");
    }

    public void playOnIndex(Song value, int index) {
        if (index < 0) return;
        if (index == 0) {
            System.out.println(head.getData().getNazev() + " (" + head.getData().getInterpret() + ")["+head.getData().getDelkaS()+"s] -> ");
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) return;
            current = current.getNext();
        }
        if (current == null) return;

        Node indexNode = new Node(value);
        System.out.println(indexNode.getData().getNazev() + " (" + indexNode.getData().getInterpret() + ")["+indexNode.getData().getDelkaS()+"s] -> ");// 1. Propojit nový uzel se zbytkem
    }

    public void playBeforIndex(Song value, int index) {
        if (index < 0) return;
        if (index == 0) {
            System.out.println(head.getPrev().getData().getNazev() + " (" + head.getPrev().getData().getInterpret() + ")["+head.getPrev().getData().getDelkaS()+"s] -> ");
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) return;
            current = current.getNext();
        }
        if (current == null) return;

        Node indexNode = new Node(value);
        System.out.println(indexNode.getPrev().getData().getNazev() + " (" + indexNode.getPrev().getData().getInterpret() + ")["+indexNode.getPrev().getData().getDelkaS()+"s] -> ");// 1. Propojit nový uzel se zbytkem
    }

    public void playAfterIndex(Song value, int index) {
        if (index < 0) return;
        if (index == 0) {
            System.out.println(head.getNext().getData().getNazev() + " (" + head.getNext().getData().getInterpret() + ")["+head.getNext().getData().getDelkaS()+"s] -> ");
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) return;
            current = current.getNext();
        }
        if (current == null) return;

        Node indexNode = new Node(value);
        System.out.println(indexNode.getNext().getData().getNazev() + " (" + indexNode.getNext().getData().getInterpret() + ")["+indexNode.getNext().getData().getDelkaS()+"s] -> ");// 1. Propojit nový uzel se zbytkem
    }

    public void removeFirst() {
        if (head == null) return;

        head = head.getNext();
        if (head != null) {
            head.setPrev(null);
        } else {
            tail = null;
        }
    }

    public void removeOnIndex(int index) {
        if (head == null || index < 0) {
            System.out.println("Seznam je prázdný nebo neplatný index");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current.getNext() == null) return;
            current = current.getNext();
        }

        Node toRemove = current.getNext();
        if (toRemove == null) return;

        Node nextNode = toRemove.getNext();
        current.setNext(nextNode);

        if (nextNode != null) {
            nextNode.setPrev(current);
        } else {
            tail = current;
        }
    }


    public void printAll(){
        Node current = head;
        while (current != null) {
            System.out.print(current.getData().getNazev());
            current = current.getNext();
        }
        System.out.println("null");
    }
}
