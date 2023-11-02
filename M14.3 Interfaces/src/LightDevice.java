public abstract class LightDevice implements ElectricDevice{
    protected static final double MAX_BRIGHTNESS = 1D;
    protected static final double MIN_BRIGHTNESS = 0D;
    protected final int power;
    protected double brightness;

    public LightDevice(int power) {
        this.power = power;
    }

    public void setBrightness(double level) {
        if (level < MIN_BRIGHTNESS){
            brightness = MIN_BRIGHTNESS;
        } else if (level > MAX_BRIGHTNESS) {
            brightness = MAX_BRIGHTNESS;
        }else {
            brightness = level;
        }
    }

    public double getBrightness() {
        return brightness;
    }

    public void changeBrightness(double rate){
        double changed = brightness + brightness * rate;
        setBrightness(changed);
    }

    public void switchOn() {
        brightness = MAX_BRIGHTNESS;
    }

    public void switchOff() {
        brightness = MIN_BRIGHTNESS;
    }

    public boolean isSwitchedOn() {
        return brightness > 0;
    }

}