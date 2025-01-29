import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    private List<Trip> trips = new ArrayList<>();

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running)
        {
            System.out.println("Plan a trip");
            System.out.println("1. add a skiing trip");
            System.out.println("2. add a beach trip");
            System.out.println("show all trips that you have planned");
            System.out.println("finish");

            System.out.println("choose what you want to do");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice)
            {
                case 1:
                    createSkiTrip(scanner);
                    break;


                case 2:
                    createBeachTrip(scanner);
                        break;

                case 3:
                    showAllTrips();
                        break;

                case 4:
                    System.out.println("Goodbye");
                    running = false;
                        break;

                    default:
                        System.out.println("error, try another number");

            }

            System.out.println();


        }
        scanner.close();

    }

    private static void createSkiTrip(Scanner scanner)
    {

    }

    private static void createBeachTrip(Scanner scanner)
    {

    }

    private static void showAllTrips()
    {

    }


}