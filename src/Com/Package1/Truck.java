package Com.Package1;

public class Truck extends Transport{

    private boolean isLoaded;
    public Dviglo dviglo = new Dviglo();

    public Truck(int weight, byte[] coordinat) {
      super(weight, coordinat);
    }

    @Override
    public void MoveObject(float speed) {
        System.out.println("Uspeshnii : " + speed);
    }

    @Override
    public boolean StopObject() {
        this.SpeedCar = 0;
        return true;
    }

    public Truck(int weight, byte[] coordinat, boolean isLoaded) {
        super(weight, coordinat);
        this.isLoaded = isLoaded;
    }

    public void SetSpeedValue(float speed, int weight, String color, byte[] coordinat, boolean isLoaded) {
      super.SetSpeedValue(speed, weight, color, coordinat);
      this.isLoaded = isLoaded;
    }

    @Override
    protected String GetValues() {
        System.out.println(super.GetValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    public String getLoaded() {
        if(isLoaded) {
            return "Car is uspeshnii";
        }
        else {
            return "Car is ne uspeshnii";
        }
    }

}
