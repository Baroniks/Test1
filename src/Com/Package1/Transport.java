package Com.Package1;

public abstract class Transport {

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

    public abstract void MoveObject(float speed);
    public abstract boolean StopObject();

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

    class Dviglo {
        private  boolean isReady;
        private int kilometers;

        public void SetValues(boolean isReady, int km){
            this.isReady = isReady;
            this.kilometers = km;
        }

        public void isReady(boolean isReady) {
          this.isReady = isReady;
        }

        public void info() {
            if(isReady) {
                System.out.println("Chetkiy Dviglo");
            }
            else {
                System.out.println("Dviglo govno, on proehal " + kilometers + " kilometrs.");
            }
        }
    }
}
