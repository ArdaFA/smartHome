package smarthome;

public class Button extends PowerDevice{


    static int counter = 1; // 1,3,5.. means off

    public Button(IDevice device) {
        super(device);
    }

    @Override
    public void poll() {
        if(counter%2==1){
            this.getDevice().run();
        }
        else{
            this.getDevice().stop();
        }
        counter++;

    }
}
