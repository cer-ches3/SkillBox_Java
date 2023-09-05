public class СargoProperties {
    private final Dimensions dimensions;
    private final double weight;
    private final String addressDelivery;
    private final String regNumber;
    private final boolean isFlipped;
    private final boolean isFragile;

    public СargoProperties(Dimensions dimensions, double weight, String addressDelivery,
                           String regNumber, boolean isFlipped, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.addressDelivery = addressDelivery;
        this.regNumber = regNumber;
        this.isFlipped = isFlipped;
        this.isFragile = isFragile;
    }

    public СargoProperties setDimensions(Dimensions dimensions){
        return new СargoProperties(dimensions, weight, addressDelivery,
                regNumber, isFlipped, isFragile);
    }
    public СargoProperties setWeight(double weight){
        return new СargoProperties(dimensions, weight, addressDelivery,
                regNumber, isFlipped, isFragile);
    }
    public СargoProperties setAddressDelivery(String addressDelivery){
        return new СargoProperties(dimensions, weight, addressDelivery,
                regNumber, isFlipped, isFragile);
    }


    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getAddressDelivery() {
        return addressDelivery;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isFlipped() {
        return isFlipped;
    }

    public boolean isFragile() {
        return isFragile;
    }



    @Override
    public String toString() {
        return "Габариты: " + dimensions + '\n' +
                "Масса: " + weight + " кг." + '\n' +
                "Адресс доставки: " + addressDelivery + '\n' +
                "Регистрационный номер: " + regNumber + '\n' +
                "Может быть перевенут : " + (isFlipped ? "Да" : "Нет") + '\n' +
                "Хрупкое: " + (isFragile ? "Да" : "Нет");
    }
}
