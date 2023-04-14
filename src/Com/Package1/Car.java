package Com.Package1;

public class Car extends Transport implements iLights{
    public Dviglo dviglo = new Dviglo();
    private boolean OpenClose;

    public Car(){};

    public Car(float speed, int weight, String color, byte[] coordinat) {
      super(speed, weight, color, coordinat);

      super.SetSpeedValue(speed, weight, color, coordinat);
    }

    @Override
    public void MoveObject(float speed) {
        System.out.println("Dviglo gonyaet so speed : " + speed);
    }

    @Override
    public boolean StopObject() {
        this.SpeedCar = 0;
        return true;
    }

    @Override
    public void setLight(boolean set) {
      this.OpenClose = set;
    }

    @Override
    public void migatFarami() {
        System.out.println("Promorgali farami");
    }
}
