public class UserInfo {
    private String id;
    private String pw;

    private static UserInfo userInfo;

    public static UserInfo getInstance(){
        if(userInfo == null)
            userInfo = new UserInfo();
        
        return userInfo;
    }

    private UserInfo(){
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }  
}