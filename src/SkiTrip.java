public class SkiTrip extends Trip
{
    private String typeOfgear;
    private int liftCardPrice;

    public SkiTrip(){}

    public SkiTrip(String country, int duration, String vacationType, String adventures, String typeOfGear, int liftCardPrice)
    {
        super(country, duration, vacationType, adventures);
        this.typeOfgear = typeOfGear;
        this.liftCardPrice = liftCardPrice;
    }
}
