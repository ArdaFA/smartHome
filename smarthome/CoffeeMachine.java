package smarthome;

public class CoffeeMachine implements IDevice{


    @Override
    public void run(){
        System.out.println("Coffee Machine started.");
    }

    @Override
    public void stop() {
        System.out.println("Coffee Machine stopped");
    }
}
