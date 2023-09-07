public class Ram {
    public final TypeRam typeRam;
    public final int volumeRam;
    public final double weightRam;

    public Ram(TypeRam typeRam, int volumeRam, double weightRam) {
        this.typeRam = typeRam;
        this.volumeRam = volumeRam;
        this.weightRam = weightRam;
    }

    public TypeRam getTypeRam() {
        return typeRam;
    }
    public Ram setTypeRam(TypeRam typeRam){
        return new Ram(typeRam, volumeRam, weightRam);
    }

    public int getVolumeRam() {
        return volumeRam;
    }
    public Ram setVolumeRam(int volumeRam){
        return new Ram(typeRam, volumeRam, weightRam);
    }

    public double getWeightRam() {
        return weightRam;
    }
    public Ram setWeightRam(double weightRam){
        return new Ram(typeRam, volumeRam, weightRam);
    }

    @Override
    public String toString() {
        return "Тип: " + typeRam + "\n" +
                "Объем: " + volumeRam + " Гб" + "\n" +
                "Вес: " + weightRam + " кг.";
    }
}
