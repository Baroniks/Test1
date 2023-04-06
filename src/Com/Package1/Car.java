package Com.Package1;

public class Car extends Transport {

    public Car(float speed, int weight, String color, byte[] coordinat) {
      super(speed, weight, color, coordinat);

      super.SetSpeedValue(speed, weight, color, coordinat);
    }

    @Override
    public void MoveObject(float speed) {
        System.out.println("Uspehov" + speed);
    }

    @Override
    public boolean StopObject() {
        this.SpeedCar = 0;
        return true;
    }

}
