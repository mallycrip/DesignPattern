public class Main {
    public static void main(String[] args) {
        User defaultUser = new User();
        User copyUser = defaultUser.clone();
        copyUser.setName("다른 이름");
    }
}