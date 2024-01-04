package smarthome;

public class Lamp implements IDevice{

    private String name;

    public Lamp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println(this.getName() + " started.");
    }

    @Override
    public void stop() {
        System.out.println(this.getName() + " stopped.");
    }
}
