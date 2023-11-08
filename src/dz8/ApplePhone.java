package dz8;

public class ApplePhone extends Phone {


    public ApplePhone(String number, String model, double weight) {
        super(number, model, weight);
    }
    public void info(){
        System.out.printf("Phone: model=%s, number=%s, weight=%.2f\n", number, model, weight);
    }

    @Override
    protected Object getModel() {
        return null;
    }

    @Override
    protected Object getWeight() {
        return null;
    }


    @Override
    public void receiveCall(String name) {
        System.out.println("Call: " + name);
    }
}
