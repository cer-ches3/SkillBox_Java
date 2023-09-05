public class Dimensions {
    private final double lenght;
    private final double width;
    private final double height;

    public Dimensions(double lenght, double width, double height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Dimensions setLenght (double lenght){
        return new Dimensions(lenght, width, height);
    }
    public Dimensions setWidth (double width){
        return new Dimensions(lenght, width, height);
    }
    public Dimensions setHeight (double height){
        return new Dimensions(lenght, width, height);
    }

    @Override
    public String toString() {
        return "Длина - " + lenght + " м., " +
                "Ширина - " + width + " м., " +
                "Высота - " + height + " м.";
    }
}
