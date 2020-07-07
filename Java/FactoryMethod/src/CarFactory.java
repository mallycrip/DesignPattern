public class CarFactory {
    public static Car getCar(int i) {
        switch (i) {
            case 1: return new Bmw();
            case 2: return new Benz();
            default:
                break;
        }
		return null;
    }
}