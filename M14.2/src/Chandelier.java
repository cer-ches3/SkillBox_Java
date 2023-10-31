public class Chandelier {
    public static final double MAX_BRIGHTNESS = 1D;
    public static final double MIN_BRIGHTNESS = 0D;

    public static final double LAMP_BRIGHTNESS_STEPS = 2;
    public static final double  CONSUMPTION_COEFF= 1.095;


    private final int power;
    private final int lampCount;
    private double brightness;

    public Chandelier(int power, int lampCount) {
        this.power = power;
        this.lampCount = lampCount;
    }

    public void setBrightness(double level) {
        if (level < MIN_BRIGHTNESS){
            brightness = MIN_BRIGHTNESS;
        } else if (level > MAX_BRIGHTNESS) {
            brightness = MAX_BRIGHTNESS;
        }else {
            double step = 1.0 / (lampCount * LAMP_BRIGHTNESS_STEPS);
            int stepCount = (int) Math.round(level/step);
            brightness = stepCount * step;
        }
    }

    public double getBrightness() {
        return brightness;
    }

    public void changeBrightness(double rate){
        double changed = brightness + brightness * rate;
        setBrightness(changed);
    }

    public double getEnergyConsumption() {
        return power * Math.pow(brightness, CONSUMPTION_COEFF);
    }
}
