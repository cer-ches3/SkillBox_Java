public class Display {
    private final double diagonal;
    private final TypeDisplay typeDisplay;
    private final double weightDisplay;

    public Display(double diagonal, TypeDisplay typeDisplay, double weightDisplay) {
        this.diagonal = diagonal;
        this.typeDisplay = typeDisplay;
        this.weightDisplay = weightDisplay;
    }

    public double getDiagonal() {
        return diagonal;
    }
    public Display setTypeDisplay(double diagonal){
        return new Display(diagonal, typeDisplay, weightDisplay);
    }

    public TypeDisplay getTypeDisplay() {
        return typeDisplay;
    }
    public Display setTypeDysplay(TypeDisplay typeDisplay){
        return new Display(diagonal, typeDisplay, weightDisplay);
    }

    public double getWeightDisplay() {
        return weightDisplay;
    }
    public Display setWeightDisplay(double weightDisplay){
        return new Display(diagonal, typeDisplay, weightDisplay);
    }

    @Override
    public String toString() {
        return "Диагональ: " + diagonal + " дюймов" + "\n" +
                "Тип: " + typeDisplay + "\n" +
                "Вес: " + weightDisplay + " кг.";
    }
}
