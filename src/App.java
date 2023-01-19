import java.util.ArrayList;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) throws Exception {

        App todo = new App();
        todo.toDoImpl();
    }

    /*
     * 1. write a new function <xyz>
     * 2. function behavior:- takes user input for tasks to be done
     * 3. tasks:- add, show, exit --(edit, delete)
     */
    private static Logger LOGGER = Logger.getLogger(App.class.getName());

    public void toDoImpl() {

        LOGGER.log(Level.INFO, "Inside toDoImpl method");
        // boolean runLoop = true;
        ArrayList<String> arr = new ArrayList<String>();

        while (true) {
            System.out.print("Enter a task from add, show, exit: ");

            Scanner userScanner = new Scanner(System.in);
            // String s = sc.nextLine();

            String userAction = userScanner.nextLine();
            if (userAction.equals("add")) {
                System.out.println("Enter a task to add : ");

                String userInput = userScanner.nextLine();
                // ArrayList arr = new ArrayList<>();
                arr.add(userInput);

                LOGGER.log(Level.INFO, "user has entered  : " + userInput);
            } else if (userAction.equals("show")) {
                System.out.println("array size " + arr.size());
                for (int i = 0; i < arr.size(); i++) {
                    System.out.println(arr.get(i));
                    LOGGER.log(Level.INFO, "Inside  array loop ");

                }

            } else if (userAction.equals("exit")) {
                LOGGER.log(Level.WARNING, "Exiting from loop");
                break;

            } else {
                LOGGER.log(Level.WARNING, "Please enter correct input");

            }

        }

    }
}
