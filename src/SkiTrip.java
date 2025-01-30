public class SkiTrip extends Trip
{
    private String typeOfgear;
    private int liftCardPrice;

    public SkiTrip(){}

    public SkiTrip(String country, int duration, int date, String adventures, String typeOfGear, int liftCardPrice)
    {
        super(country, duration, date, adventures);
        this.typeOfgear = typeOfGear;
        this.liftCardPrice = liftCardPrice;
    }

    public String typeOfGear()
    {
        return typeOfgear;
    }

    public int getliftCardPrice()
    {
        return liftCardPrice;
    }

    public void setTypeOfgear(String typeOfgear)
    {
        this.typeOfgear = typeOfgear;
    }

    public void setLiftCardPrice(int liftCardPrice)
    {
        this.liftCardPrice = liftCardPrice;
    }

    @Override
    public String toString()
    {
        return "Skitrip to:" + getCountry() + "\n"
                + "for " + getDuration() + " days" + "\n"
                + "departing date " + getDate() + "\n"
                + "Planned adventures: " + getAdventures() + "\n"
                + "with type of gear: " + typeOfgear + "\n"
                + "and the lift card price is: " + liftCardPrice;
    }

}
