package Encapsulation;

public class CargoTransportation {
    public final Dimensions dimensions;
    public final double weigh;
    private  final String deliveryAddress;
    private final boolean coup;
    private final String registrationNumber;
    private final boolean fragile;

    public CargoTransportation(Dimensions dimensions, double weigh, String deliveryAddress, boolean coup, String registrationNumber, boolean fragile){
        this.dimensions = dimensions;
        this.weigh = weigh;
        this.deliveryAddress = deliveryAddress;
        this.coup = coup;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }
    public CargoTransportation setDimension(Dimensions dimensions){
        return new CargoTransportation(dimensions, weigh, deliveryAddress, coup, registrationNumber,fragile);
    }
    public CargoTransportation setWeigh(double weigh){
        return new CargoTransportation(dimensions, weigh, deliveryAddress, coup, registrationNumber,fragile);
    }
    public CargoTransportation setDeliveryAddress(String deliveryAddress){
        return new CargoTransportation(dimensions, weigh, deliveryAddress, coup, registrationNumber,fragile);
    }
    public CargoTransportation setCoup(boolean coup){
        return new CargoTransportation(dimensions, weigh, deliveryAddress, coup, registrationNumber,fragile);
    }
    public CargoTransportation setRegistrationNumber(String registrationNumber){
        return new CargoTransportation(dimensions, weigh, deliveryAddress, coup, registrationNumber,fragile);
    }
    public CargoTransportation setFragile(boolean fragile){
        return new CargoTransportation(dimensions, weigh, deliveryAddress, coup, registrationNumber,fragile);
    }
    public Dimensions getDimensions() {
        return dimensions;
    }
    public double getWeigh() {
        return weigh;
    }
    public boolean isCoup() {
        return coup;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public boolean isFragile() {
        return fragile;
    }
}

