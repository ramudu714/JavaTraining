import java.util.Deque;
import java.util.LinkedList;

public class DequeueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new LinkedList<String>();

    // Add at the last
    deque.add("Element 1 ");

    // Add at the first
    deque.addFirst("Element 2 ");

    // Add at the last
    deque.addLast("Element 3 ");

    // Add at the first
    deque.push("Element 4 ");

    // Add at the last
    deque.offer("Element 5 ");

    // Add at the first
    deque.offerFirst("Element 6 ");

    System.out.println(deque + "\n");

    // We can remove the first element
    // or the last element.
    deque.removeFirst();
    deque.removeLast();
    
    deque.pollFirst();
    deque.pollLast();
    
    System.out.println("Deque after removing " + "first and last: " + deque);

	}

}
