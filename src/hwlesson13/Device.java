package hwlesson13;

import java.util.Objects;

public class Device {
    /* class fields */
    private final String name;
    private final String origin;
    private int price;
    private final Type type;
    private final int wattPowerConsumption;
    private final boolean isCoolerAvailable;
    private final Port port;
    private final boolean isCriticalDevice;

    /* constructors */
    public Device(){
        this.name = "winchester";
        this.origin = "China";
        this.price = 80;
        this.type = Type.INTERNAL_USE;
        this.wattPowerConsumption = 120;
        this.isCoolerAvailable = true;
        this.port = Port.USB;
        this.isCriticalDevice = true;
    }

    public Device(String name, String origin, int price, Type type, int wattPowerConsumption, boolean isCoolerAvailable, Port port, boolean isCriticalDevice) {
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.type = type;
        this.wattPowerConsumption = wattPowerConsumption;
        this.isCoolerAvailable = isCoolerAvailable;
        this.port = port;
        this.isCriticalDevice = isCriticalDevice;
    }

    /* getters & setter*/
    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public int getWattPowerConsumption() {
        return wattPowerConsumption;
    }

    public boolean isCoolerAvailable() {
        return isCoolerAvailable;
    }

    public Port getPort() {
        return port;
    }

    public boolean isCriticalDevice() {
        return isCriticalDevice;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return price == device.price && wattPowerConsumption == device.wattPowerConsumption && isCoolerAvailable == device.isCoolerAvailable && isCriticalDevice == device.isCriticalDevice && Objects.equals(name, device.name) && Objects.equals(origin, device.origin) && type == device.type && port == device.port;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, origin, price, type, wattPowerConsumption, isCoolerAvailable, port, isCriticalDevice);
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", wattPowerConsumption=" + wattPowerConsumption +
                ", isCoolerAvailable=" + isCoolerAvailable +
                ", port=" + port +
                ", isCriticalDevice=" + isCriticalDevice +
                '}';
    }
}//class ends
