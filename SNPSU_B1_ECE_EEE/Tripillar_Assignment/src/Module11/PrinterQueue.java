package Module11;

import java.util.LinkedList;
import java.util.Queue;

class PrintJob {
    String name;
    int pages;

    PrintJob(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }
}

public class PrinterQueue {
    public static void main(String[] args) {
        Queue<PrintJob> queue = new LinkedList<>();

        queue.add(new PrintJob("Doc1", 5));
        queue.add(new PrintJob("Doc2", 3));
        queue.add(new PrintJob("Doc3", 7));

        while (!queue.isEmpty()) {
            PrintJob job = queue.poll();
            System.out.println("Printing " + job.name + " (" + job.pages + " pages)");
        }
    }
}