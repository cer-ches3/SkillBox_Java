public class Processor {
    public final double frequency;
    public final int coresCount;
    public final String vendorProcessor;
    public final double weightProcessor;

    public Processor(double frequency, int coresCount, String vendorProcessor, double weightProcessor) {
        this.frequency = frequency;
        this.coresCount = coresCount;
        this.vendorProcessor = vendorProcessor;
        this.weightProcessor = weightProcessor;
    }

    public double getFrequency() {
        return frequency;
    }
    public Processor setFrequency(double frequency){
        return new Processor(frequency, coresCount, vendorProcessor, weightProcessor);
    }

    public int getCoresCount() {
        return coresCount;
    }
    public Processor setCoresCount(int coresCount){
        return new Processor(frequency, coresCount, vendorProcessor, weightProcessor);
    }

    public String getVendorProcessor() {
        return vendorProcessor;
    }
    public Processor setVendorProcessor(String vendorProcessor){
        return new Processor(frequency, coresCount, vendorProcessor, weightProcessor);
    }

    public double getWeightProcessor() {
        return weightProcessor;
    }
    public Processor setWeightProcessor(double weightProcessor){
        return new Processor(frequency, coresCount, vendorProcessor, weightProcessor);
    }

    @Override
    public String toString() {
        return
                "Частота: " + frequency + " Ггц" + "\n" +
                "Количество ядер: " + coresCount + "\n" +
                "Производитель: " + vendorProcessor + "\n" +
                "Вес: " + weightProcessor + " кг.";
    }
}
