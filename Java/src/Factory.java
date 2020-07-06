public class Factory {
    public Interface createCar(int i) {
        switch (i) {
            case 1:
                Interface bmw = new Implement1();
                return bmw;
            case 2:
                Interface benz = new Implement1();
                return benz;
            default:
                break;
        }
    }
}