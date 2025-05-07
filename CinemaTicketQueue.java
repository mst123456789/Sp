import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CinemaTicketQueue {
    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer names (type 'done' to stop): ");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) break;
            ticketQueue.add(name);
        }

        System.out.println("\nProcessing ticket sales...");
        while (!ticketQueue.isEmpty()) {
            String customer = ticketQueue.poll();
            System.out.println("Ticket sold to: " + customer);
        }

        System.out.println("\nAll tickets sold. Queue is empty!");
        scanner.close();
    }
}
