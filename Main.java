import smarthome.*;

public class Main {
    public static void main(String[] args) {


        IDevice bedroomLamp = new Lamp("Bedroom Lamp");
        IDevice bathroomLamp = new Lamp("Bathroom Lamp");
        IDevice coffee = new CoffeeMachine();
        IDevice waterHeater = new Heater("Water Heater");

        PowerDevice bedLight = new Switch(bedroomLamp);
        PowerDevice bathLight = new Switch(bathroomLamp);
        PowerDevice coffeeMach = new Button(coffee);
        PowerDevice bathWater = new Switch(waterHeater);

        PowerDevice[] powerDevices = {
          bedLight,
          bathLight,
          coffeeMach,
          bathWater
        };

        for (PowerDevice device : powerDevices) {
            device.poll();
        }

        for (PowerDevice device : powerDevices) {
            device.poll();
        }

    }
}