public class Computer {
    private final String vendor;
    private final String model;
    private  Processor processor;
    private Ram ram;
    private Storage storage;
    private Display display;
    private Keyboard keyboard;

    public double totalWeight;

    public Computer(String vendor, String model, Processor processor, Ram ram, Storage storage, Display display, Keyboard keyboard) {
        this.vendor = vendor;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.display = display;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public  double getTotalWeight() {
        totalWeight = processor.getWeightProcessor() + ram.getWeightRam() + storage.getWeightStorage()
                + display.getWeightDisplay() + keyboard.getWeightKeyboard();
        return totalWeight;
    }

    @Override
    public String toString() {
        return "\n" + "Производитель " + vendor + "\n" +
                "Модель " + model + "\n" +
                "\n" + "Процессор" + "\n" + processor + "\n" +
                "\n" + "Оперативная память" + "\n" + ram + "\n" +
                "\n" +  "Память" + "\n" + storage + "\n" +
                "\n" + "Дисплей" + "\n" + display + "\n" +
                "\n" + "Клавиатура" + "\n" + keyboard + "\n" +
                "\n" + "Общий вес: "  + getTotalWeight();
    }
}
