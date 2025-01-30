import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    private static List<Trip> trips = new ArrayList<>();

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running)
        {
            System.out.println("Plan a trip");
            System.out.println("1. add a skiing trip");
            System.out.println("2. add a beach trip");
            System.out.println("3. show all trips that you have planned");
            System.out.println("4. finish");

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
        System.out.println("Plan a ski trip");
        System.out.println("enter the country:");
        String country = scanner.nextLine();
        System.out.println("enter the duration of the trip:");
        int duration = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter the date of departure:");
        int departure = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter any planned adventures:");
        String plannedAdventures = scanner.nextLine();
        System.out.println("enter whitch gear you are using (Ski/snowboard/other)");
        String gear = scanner.nextLine();
        System.out.println("enter the lift card price:");
        int liftCardPrice = scanner.nextInt();
        scanner.nextLine();

        SkiTrip skiTrip = new SkiTrip(country, duration, departure, plannedAdventures, gear, liftCardPrice);
        trips.add(skiTrip);
        System.out.println("Skitrip created");

    }

    private static void createBeachTrip(Scanner scanner)
    {
        System.out.println("Plan a beach trip");
        System.out.println("Enter the country:");
        String country = scanner.nextLine();
        System.out.println("Enter the duration of the trip:");
        int duration = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter date of departure:");
        int departure = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter any planned adventures:");
        String plannedAdventures = scanner.nextLine();
        System.out.println("enter beach names you have planned to visit:");
        String beachNames = scanner.nextLine();
        System.out.println("Do you have any inflatable animals with you (true/false)");
        boolean inflatableAnimals = scanner.nextBoolean();
        scanner.nextLine();

        BeachTrip beachTrip = new BeachTrip(country, duration, departure,plannedAdventures, beachNames, inflatableAnimals);
        trips.add(beachTrip);
        System.out.println("Beachtrip created");
    }

    private static void showAllTrips()
    {
        if(trips.isEmpty())
        {
            System.out.println("No trips planned");
        }
        else
        {
            System.out.println("planned trips:");
                for(int i = 0; i < trips.size(); i++)
                {
                    System.out.println(trips.get(i).toString());
                }
        }
    }




}