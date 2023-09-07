public class Storage {
    private final TypeStorage typeStorage;
    private final int volumeStorage;
    private final double weightStorage;

    public Storage(TypeStorage typeStorage, int volumeStorage, double weightStorage) {
        this.typeStorage = typeStorage;
        this.volumeStorage = volumeStorage;
        this.weightStorage = weightStorage;
    }

    public TypeStorage getTypeStorage() {
        return typeStorage;
    }
    public Storage setTypeStorage(TypeStorage typeStorage){
        return new Storage(typeStorage, volumeStorage, weightStorage);
    }

    public int getVolumeStorage() {
        return volumeStorage;
    }
    public Storage setVolumeStorage(int volumeStorage){
        return new Storage(typeStorage, volumeStorage, weightStorage);
    }

    public double getWeightStorage() {
        return weightStorage;
    }
    public Storage setWeightStorage(double weightStorage){
        return new Storage(typeStorage, volumeStorage, weightStorage);
    }

    @Override
    public String toString() {
        return "Тип: " + typeStorage + "\n" +
                "Объем: " + volumeStorage + " Гб" + "\n" +
                "Вес: " + weightStorage + " кг.";
    }
}
