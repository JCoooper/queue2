import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LineTester {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Queue<line> line = new LinkedList<line>();
		System.out.println("What item do you want to place on the belt: ");
		String Item = scnr.next();
		int wait = 5;
		line l = new line(Item, wait);
		line.add(l);

		while (line.size() > 0) {
			System.out.println("There are " + line.size() + " items in the queue");
			System.out.println("Making: " + line.element().getItem());
			System.out.println("");
			System.out.print("Would you like to add another item to the line? (YES/NO):");
			String yn = scnr.next();
			if (yn.equals("YES")) {
				System.out.print("Item: ");
				Item = scnr.next();
				line newItem = new line(Item, wait);
				line.add(newItem);
			} else if (yn.equals("NO")) {
				System.out.println("done");
			}

			if (line.element().getWait() == 0) {
				System.out.println("");
				System.out.println("Item Made/Done: " + line.element().getItem());
				System.out.println("");
				line.remove();
				wait = 0;
			} else {
				System.out.println("");
				System.out.println("Item not done, please wait: " + (line.element().getWait() - wait) + " seconds");
			}
			System.out.print("");
			wait++;
		}

	}
}
