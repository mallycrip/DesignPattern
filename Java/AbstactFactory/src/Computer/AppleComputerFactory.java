public class AppleComputerFactory implements Computer {
    public Keyboard getKeyboard() {
        return new AppleKeyboard();
    }
    public Monitor getMonitor() {
        return new AppleMonitor();
    }
}