import java.util.Scanner;
import java.io.IOException;
public class Do_while {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char choice;
            do {
                System.out.println("1.call to Ashok");
                System.out.println("2.open facebook");
                System.out.println("3.open whatsapp");
                System.out.println("4.open twitter");
                System.out.println("5.battery percentage");
                choice = sc.next().charAt(0);

            } while (choice < '1' || choice > '5');
            switch (choice) {
                case '1':
                    System.out.println("Calling Ashok Kurapati ");
                    System.out.println("you want it on speaker phone: ");
                    String yn = sc.next(); //doubt ask about this
                    System.out.println(yn);
                    if (yn.equalsIgnoreCase("yes")) {
                        System.out.println("Aye Aye captain");
                        System.out.println("on speaker got it");
                    } else if (yn.equalsIgnoreCase("no")) {
                        System.out.println("Aye Aye captain");
                        System.out.println("go it");

                    } else {
                        System.out.println("choose yes or no");
                    }
                    break;
                case '2':
                    System.out.println("opening facebook.........");
                    System.out.println("they are no new messages");
                    break;
                case '3':
                    System.out.println("opening whatsapp......");
                    System.out.println("they are no new messages");
                    break;
                case '4':
                    System.out.println("opening twitter.......");
                    System.out.println("they are no new messages");
                    break;
                case '5':
                    int battery = 95;
                    System.out.println(battery + "%");
                    break;

            }

        }
    }


    /*                             Notes

    Next() vs NextLine()
    the next will return the words that are before the whitespaces.
    NextLine()
    the nextLine() returns all the words without skip
     //////////////////////////////////////////////////////////////////////////////////
     Ask anna about the concept.
    throws io.IOException.

     */