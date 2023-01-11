import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inside main"); // soni
        App a = new App();
        a.userInput();
    }

    /*
     * 1. write a new function <xyz>
     * 2. function behavior:- takes user input for tasks to be done
     * 3. tasks:- add, show, exit --(edit, delete)
     */

    public void userInput() {
        System.out.println("Inside userInput");
        boolean runLoop = true;
        ArrayList<String> arr = new ArrayList<String>();

        while (runLoop) {
            System.out.print("Enter a task from add, show, exit: ");
            Scanner sc = new Scanner(System.in);
            // String s = sc.nextLine();

            String s = sc.nextLine();
            if (s.equals("add")) {
                System.out.print("Enter a task to add : ");
                String s1 = sc.nextLine();
                // ArrayList arr = new ArrayList<>();
                arr.add(s1);
                System.out.println("user has entered  : " + s1);
            } else if (s.equals("show")) {
                System.out.println("array size " + arr.size());
                for (int i = 0; i < arr.size(); i++) {
                    System.out.println(arr.get(i));
                }

            } else if (s.equals("exit")) {
                runLoop = false;
                System.out.println("exit " + runLoop);
            } else {
                System.out.println("Please enter correct input");
            }

        }

    }
}
