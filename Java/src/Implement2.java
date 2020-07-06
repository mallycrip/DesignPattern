public class Implement2 implements Interface{
    private String name = "Benz";
    private String status = "Not init";

    public void drive() {
        this.status = "drive";
        System.out.println("Drive Drive!");
    }
    public void stop() {
        this.status = "stop";
        System.out.println("Stop!");
    }

    public String getName() {
        return this.name;
    }

    public String getStatus() {
        return this.status;
    }
}