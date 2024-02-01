import java.util.LinkedList;
import java.util.Queue;

public class QueueInJava {
    public static void main(String[] args) {
        Queue<String> letters=new LinkedList<>();
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");
        System.out.println(letters);
        System.out.println("▒░(°◡°)░▒▓");
        System.out.println();
        String peeking= letters.peek();
        System.out.println("Running peek getter: "+ peeking);
        System.out.println("▒░(°◡°)░▒▓");
        System.out.println();
        System.out.println(letters.poll());
        System.out.println("▒░(°◡°)░▒▓");
        System.out.println();
        System.out.println(letters);
        System.out.println("▒░(°◡°)░▒▓");
        System.out.println();
        System.out.println(letters.poll());
        System.out.println("▒░(°◡°)░▒▓");
        System.out.println();
        System.out.println(letters);
        System.out.println("▒░(°◡°)░▒▓");
        System.out.println();
        System.out.println(letters.poll());
        System.out.println("▒░(°◡°)░▒▓");
        System.out.println();
        System.out.println(letters);

    }
}
