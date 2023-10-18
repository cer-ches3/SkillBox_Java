public class Car {
    private String number;
    private int power;
    private double engineVolume;
    private CarColor Color;

    public Car(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public CarColor getColor() {
        return Color;
    }

    public void setColor(CarColor color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", power=" + power +
                ", engineVolume=" + engineVolume +
                ", Color=" + Color +
                '}';
    }
}
