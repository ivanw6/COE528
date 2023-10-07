package lab3;

import java.util.ArrayList;

/**
 *
 * @author ivan wang 501086429
 */
public class QueueOfDistinctStrings {

    // Overview: QueueOfDistinctStrings are mutable, bounded
    // collection of distinct strings that operate in
    // FIFO (First-In-First-Out) order.
    //
    // The abstraction function is:
    // AF(c) = a queue, q such that
    // q.front = c.items[0]
    // q.end = c.items[c.items.size()-1]
    // q.elements = {c.items[i] | 0 <= i < c.items.size()} and all elements in q.elements are distinct.
    //
    // The rep invariant is:
    // RI(c) = 
    // c.items != null
    // for all i, j in [0 to c.items.size()], i != j && c.items[i] != c.items[j].
    //
    //the rep
    private ArrayList<String> items;

    // constructor
    public QueueOfDistinctStrings() {
        // EFFECTS: Creates a new QueueOfDistinctStrings object
        items = new ArrayList<String>();
    }
    // MODIFIES: this
    // EFFECTS: Appends the element at the end of the queue
    // if the element is not in the queue, otherwise
    // does nothing.

    public void enqueue(String element) throws Exception {
        if (element == null) {
            throw new Exception();
        }
        if (false == items.contains(element)) {
            items.add(element);
        }
    }

    public String dequeue() throws Exception {
        // MODIFIES: this
        // EFFECTS: Removes an element from the front of the queue
        if (items.size() == 0) {
            throw new Exception();
        }
        return items.remove(0);
    }

    public boolean repOK() {
        // EFFECTS: Returns true if the rep invariant holds for this
        // object; otherwise returns false      
        if (items == null) {
            return false;
        } else {
            //for loop to check if the elements are distinct
            for (int i = 0; i < items.size(); i++) {
                for (int j = i + 1; j < items.size(); j++) {
                    if (items.get(i).equals(items.get(j))) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    @Override
    public String toString() {
        // EFFECTS: Returns a string that contains the strings in the
        // queue, the front element and the end element.
        // Implements the abstraction function.
        String output = "";
        for (int i = 0; i < items.size(); i++) {
            output += items.get(i);
            if (i < items.size() - 1) {
                output += ", ";
            }
        }
        return "Front [" + output + "] End";
    }

    public static void main(String args[]) {
        //Testing the QueueOfDistinctStrings Class
        QueueOfDistinctStrings queue = new QueueOfDistinctStrings();
        try {
            queue.enqueue("A");
            queue.enqueue("B");
            queue.enqueue("C");
            System.out.println("Queue after adding three elements: " + queue);
            System.out.println("Removed element: " + queue.dequeue());
            System.out.println("Queue after removing one element: " + queue);
            queue.enqueue("D");
            System.out.println("Queue after adding another element: " + queue);
            queue.enqueue("B");
            System.out.println("Queue after trying to add a duplicate element (B): " + queue);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
