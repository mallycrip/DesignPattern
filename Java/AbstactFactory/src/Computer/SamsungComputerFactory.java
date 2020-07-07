public class SamsungComputerFactory implements Computer {
    public Keyboard getKeyboard() {
        return new SamsungKeyboard();
    }
    public Monitor getMonitor() {
        return new SamsungMonitor();
    }
}