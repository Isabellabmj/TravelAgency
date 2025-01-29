public class BeachTrip extends Trip
{
    protected String beachName;
    protected Boolean inflatableAnimal;

    public BeachTrip(){}

    public BeachTrip(String country, int duration, String vacationType, String adventures, String beachName, Boolean inflatableAnimal)
    {
        super(country, duration, vacationType, adventures);
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
}
