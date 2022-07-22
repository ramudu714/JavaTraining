import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> pQueue = new PriorityQueue<String>();

		pQueue.add("Varish");
		pQueue.add("chaitu");
		pQueue.add("krish");
		pQueue.add("nag");
		pQueue.add("tulasi");

		Iterator<String> itr = pQueue.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println(" head is: " + pQueue.element());
		System.out.println(" head is: " + pQueue.peek());

		System.out.println(" head is: " + pQueue.remove());
		System.out.println(" head is: " + pQueue.poll());

		pQueue.clear();

		try {

			System.out.println(" head is: " + pQueue.element());
			System.out.println(" head is: " + pQueue.peek());
		} catch (Exception e) {
			System.out.println("exception message is: " + e.getLocalizedMessage());
		}
	}
}
