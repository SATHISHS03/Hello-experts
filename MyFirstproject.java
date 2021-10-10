import java.util.Scanner;

public class MyFirstproject {
  public static void main(String[] args) {
    Scanner forchoice = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    int available[] = new int[6];
    String ticketS[][] = new String[4][3];
    int ticketI[][] = new int[4][3];
    for (int o = 1; o <= 5; o++) {
      available[o] = 20;
    }

    System.out.println("********************************************************");
    System.out.println("** WELOCME TO THE PONDICHERRY BUS RESERVATION SYSTEM  **");
    System.out.println("********************************************************");
    System.out.println("**     [1] Destination                                **");
    System.out.println("**     [2] Book Tickets                               **");
    System.out.println("**     [3] Exit                                       **");
    System.out.println("********************************************************");
    System.out.println("********************************************************\n");

    System.out.print("ENTER CHOICE: ");
    int choice = forchoice.nextInt();
    for (int x = 1; x == 1;) {

      switch (choice) {
      case 1:
        System.out.println("******************************************************************");
        System.out.println("**  FROM            |    TO      | FARE    |    Available SEAT  **");
        System.out.println("******************************************************************");
        System.out.println("** 1.)PONDICHERRY  | KARIKAL     | RS.90  |   " + available[1] + "      **");
        System.out.println("** 2.)PONDICHERRY  | CHENNAI     | RS.170 |   " + available[2] + "      **");
        System.out.println("** 3.)PONDICHERRY  | MADURAI     | RS.250 |   " + available[3] + "      **");
        System.out.println("** 4.)PONDICHERRY  | CHIDAMBARAM | RS.60  |   " + available[4] + "      **");
        System.out.println("** 5.)PONDICHERRY  | MAHE        | RS.350 |   " + available[5] + "      **");
        System.out.println("******************************************************************");

      case 2:

        System.out.print("\nENTER PASSENGER'S NAME: ");
        ticketS[0][1] = in.nextLine();
        System.out.print("ENTER DESTINATION [number]: ");
        int to = forchoice.nextInt();
        if (to < 1 || to > 5) {
          System.out.println("Invalid Input!");

        }

        System.out.print("HOW MANY PASSENGERS ARE YOU?: ");

        ticketI[0][1] = in.nextInt();
        for (int d = 1; d <= 5; d++) {
          if (to == d) {
            if (available[to] == 0) {
              System.out.println("Sorry, We don't have available seat!");
              ;
            }
            ;
          }
        }
        String dest[] = { " ", "KARIKAL", "CHENNAI", "MADURAI", "CHIDAMBARAM", "MAHE" };
        int fare[] = { 0, 90, 170, 250, 60, 350 };
        ticketS[0][2] = dest[to];
        ticketI[0][2] = fare[to];
        ticketI[0][2] *= ticketI[0][1];
        System.out.println("\nPASSENGER'S TOTAL FARE: RS " + ticketI[0][2]);

        System.out.println("\n***************************************");
        System.out.println("**        PASSENGER'S DETAILS        **");
        System.out.println("***************************************");
        System.out.println("PASSENGER'S NAME: " + ticketS[0][1]);
        System.out.println("PASSENGER'S DESTINATION : " + ticketS[0][2]);
        System.out.println("FARE PRICE: RS " + ticketI[0][2]);
        System.out.println("NO. OF PASSENGERS: " + ticketI[0][1]);
        System.out.println("***************************************");
        System.out.println("***************************************\n");

      case 3:
        System.out.println("\nTHANK YOU FOR VISTING US");
        break;

      default:
        System.out.println("Please Enter valid choice");
      }
    }
  }
}
