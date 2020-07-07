public class LGComputerFactory implements Computer {
    public Keyboard getKeyboard() {
        return new LGKeyboard();
    }
    public Monitor getMonitor() {
        return new LGMonitor();
    }
}