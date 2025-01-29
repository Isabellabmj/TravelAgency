public class Trip
{
    protected String country;
    protected int duration;
    protected String vacationType;
    protected String adventures;

    public Trip(){}

    public Trip(String country, int duration, String vacationType, String adventures)
    {
        this.country = country;
        this.duration = duration;
        this.vacationType = vacationType;
        this.adventures = adventures;
    }

    public String getCountry()
    {
        return country;
    }

    public int getDuration()
    {
        return duration;
    }

    public String getVacationType()
    {
        return vacationType;
    }

    public String getAdventures()
    {
        return adventures;
    }




}
