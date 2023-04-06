package Com.Package1;

public class Transport {

    protected float SpeedCar;
    protected int   WeightCar;
    protected String ColorCar;
    protected byte[] Coordinate;

    public Transport(float speed, int weight, String color, byte[] coordinat) {
        System.out.println("Object created");
        SetSpeedValue(speed, weight, color, coordinat);
//        System.out.println(this.GetValues());
    }

    public Transport(int _weight, byte[] coordinat) {
      this.WeightCar  = _weight;
      this.Coordinate = coordinat;
//        System.out.println(this.GetValues());
    }

    protected void SetSpeedValue(float speed, int weight, String color, byte[] coordinat) {
      this.SpeedCar   = speed;
      this.WeightCar  = weight;
      this.ColorCar   = color;
      this.Coordinate = coordinat;
    }

    protected String GetValues() {
        String info = "Object speed : " + SpeedCar + ". Weight object : " + WeightCar + ". Color : " + ColorCar + ".\n";
        String CoordinateValue = "Coordinates:\n";
        for (int i = 0; i < Coordinate.length; i++) {
         CoordinateValue += Coordinate[i] + "\n";
        }
        return info + CoordinateValue;
    }
}
