package smarthome;

public abstract class PowerDevice {

    private IDevice device;

    public PowerDevice(IDevice device) {
        this.device = device;
    }

    public IDevice getDevice() {
        return device;
    }

    public void setDevice(IDevice device) {
        this.device = device;
    }

    public abstract void poll(); // controls the Button and Switch
}
