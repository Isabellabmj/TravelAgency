import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    private static List<Trip> trips = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        boolean running = true;

        while(running)
        {
            System.out.println("Plan a trip");
            System.out.println("1. add a skiing trip");
            System.out.println("2. add a beach trip");
            System.out.println("3. show all trips that you have planned");
            System.out.println("4. edit a trip you have already planned");
            System.out.println("5. finish");

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
                    editTrip();
                    break;

                case 5:
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
                    System.out.println(i + 1 + ". " + trips.get(i));
                }
        }
    }

    public static void editTrip()
    {
        if(trips.isEmpty())
        {
            System.out.println("No trips to edit");
            return;
        }

        showAllTrips();
        System.out.println("Choose the number of the trip you want to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if(index < 1 || index >= trips.size())
        {
            System.out.println("error, try again");

            return;
        }

        Trip trip = trips.get(index - 1);
        System.out.println("You have chosen this trip to edit: " + "\n" + trip);

        System.out.println("What do you want to edit:");
        System.out.println("1. Country");
        System.out.println("2. Duration");
        System.out.println("3. Date");
        System.out.println("4. Adventures");
        if(trip instanceof SkiTrip)
        {
            System.out.println("5. Type of gear");
            System.out.println("6. Lift card price");
        }
        if(trip instanceof BeachTrip)
        {
            System.out.println("5. Beach name");
            System.out.println("6. inflatable animals");
        }


        int choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice)
        {
            case 1:
                System.out.println("Enter the country:");
                trip.setCountry(scanner.nextLine());
                break;

                case 2:
                    System.out.println("Enter the duration:");
                    trip.setDuration(scanner.nextInt());
                    scanner.nextLine();
                    break;

                    case 3:
                        System.out.println("Enter the date of departure:");
                        trip.setDate(scanner.nextInt());
                        scanner.nextLine();
                        break;

                        case 4:
                            System.out.println("Enter any planned adventures:");
                            trip.setAdventures(scanner.nextLine());
                            break;

                            case 5:
                                if (trip instanceof SkiTrip skiTrip)
                                {
                                    System.out.println("Enter new type of gear");
                                    skiTrip.setTypeOfGear(scanner.nextLine());

                                }
                                else if(trip instanceof BeachTrip beachTrip)
                                {
                                    System.out.println("Enter a new beach:");
                                    beachTrip.setBeachName(scanner.nextLine());
                                }
                                break;

                                case 6:
                                    if(trip instanceof SkiTrip skiTrip)
                                    {
                                        System.out.println("Enter a new price for liftcard");
                                        skiTrip.setLiftCardPrice(scanner.nextInt());
                                        scanner.nextLine();
                                    }
                                    else if(trip instanceof BeachTrip beachTrip)
                                    {
                                        System.out.println("Enter new status for inflatable animals");
                                        beachTrip.setInflatableAnimal(scanner.nextBoolean());
                                    }
                                    break;

                                    default: System.out.println("Invalid choice");
                                    return;
        }


        System.out.println("Trip succesfully updated.");

    }


}