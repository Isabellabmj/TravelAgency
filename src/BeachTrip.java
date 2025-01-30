public class BeachTrip extends Trip
{
    protected String beachName;
    protected Boolean inflatableAnimal;

    public BeachTrip(){}

    public BeachTrip(String country, int duration, int date, String adventures, String beachName, Boolean inflatableAnimal)
    {
        super(country, duration, date, adventures);
        this.beachName = beachName;
        this.inflatableAnimal = inflatableAnimal;
    }

    public String getBeachName()
    {
        return beachName;
    }

    public Boolean getInflatableAnimal()
    {
        return inflatableAnimal;
    }

    public void setBeachName(String beachName)
    {
        this.beachName = beachName;
    }

    public void setInflatableAnimal(Boolean inflatableAnimal)
    {
        this.inflatableAnimal = inflatableAnimal;
    }

    @Override
    public String toString()
    {
        return "Beach trip to: " + getCountry() + "\n"
                + "duration: " + getDuration() + "\n"
                + "date: " + getDate() + "\n"
                + "planned adventures: " + getAdventures() + "\n"
                + "beach names that you are planning to visit: " + beachName + "\n"
                + "if you are bringing inflatable animal: " + inflatableAnimal + "\n";
    }
}
