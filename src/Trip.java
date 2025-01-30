public class Trip
{
    protected String country;
    protected int duration;
    protected int date;
    protected String adventures;

    public Trip(){}

    public Trip(String country, int duration, int date, String adventures)
    {
        this.country = country;
        this.duration = duration;
        this.date = date;
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

    public int getDate()
    {
        return date;
    }

    public String getAdventures()
    {
        return adventures;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public void setDate(int date)
    {
        this.date = date;
    }

    public void setAdventures(String adventures)
    {
        this.adventures = adventures;
    }




}
