public class Main {
    public static void main(String[] args) {
        UserInfo user = UserInfo.getInstance(); 
        UserInfo user2 = UserInfo.getInstance();

        if(user == user2) {
            System.out.println("Same");
        }
    }
    
}