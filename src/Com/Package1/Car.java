package Com.Package1;

public class Car extends Transport {

    public Car(float speed, int weight, String color, byte[] coordinat) {
      super(speed, weight, color, coordinat);

      super.SetSpeedValue(speed, weight, color, coordinat);
    }

}
