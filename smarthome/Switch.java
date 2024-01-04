package smarthome;

public class Switch extends PowerDevice{

    private boolean isOn;

    public Switch(IDevice device) {
        super(device);
        this.isOn = false;
    }

    @Override
    public void poll() {
        if(isOn()){
            this.getDevice().stop();
            this.setOn(false);
        }
        else {
            this.getDevice().run();
            this.setOn(true);
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
