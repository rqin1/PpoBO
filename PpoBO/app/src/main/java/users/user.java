package users;

public class User {
    // === Instance Variables ===
    private String name;
    private String phoneNum;
    private String email;
    private String userType;

    // === Methods ===
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType(){
        return userType;
    }
}
