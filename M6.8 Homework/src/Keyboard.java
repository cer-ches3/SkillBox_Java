public class Keyboard {
    private final TypeKeyboard typeKeyboard;
    private final IsIlluminate isIlluminate;
    private final double weightKeyboard;

    public Keyboard(TypeKeyboard typeKeyboard, IsIlluminate isIlluminate, double weightKeyboard) {
        this.typeKeyboard = typeKeyboard;
        this.isIlluminate = isIlluminate;
        this.weightKeyboard = weightKeyboard;
    }

    public TypeKeyboard getTypeKeyboard() {
        return typeKeyboard;
    }
    public Keyboard setTypeKeyboard(TypeKeyboard typeKeyboard){
        return new Keyboard(typeKeyboard, isIlluminate, weightKeyboard);
    }

    public IsIlluminate getIsIlluminate() {
        return isIlluminate;
    }
    public Keyboard setIsIlluminate( IsIlluminate isIlluminate){
        return new Keyboard(typeKeyboard, isIlluminate, weightKeyboard);
    }

    public double getWeightKeyboard() {
        return weightKeyboard;
    }
    public Keyboard setWeightKeyboard(double weightKeyboard){
        return new Keyboard(typeKeyboard, isIlluminate, weightKeyboard);
    }

    @Override
    public String toString() {
        return "Тип: " + typeKeyboard + "\n" +
                "Наличие подсветки: " + isIlluminate + "\n" +
                "Вес: " + weightKeyboard + " кг.";
    }
}
