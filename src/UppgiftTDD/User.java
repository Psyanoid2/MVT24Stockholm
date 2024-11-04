package UppgiftTDD;

public class User {
    // Attributes
    private String userName;

    // Constructor to initialize userName
    public User(String userName) {
        this.userName = userName;
    }

    // Getter for userName
    public String getUserName() {
        return userName;
    }

    // Setter for userName (if you need it)
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // Pass class to handle passwords
    public static class Pass {
        // Attributes
        private String passWord;

        // Constructor to initialize passWord
        public Pass(String passWord) {
            this.passWord = passWord;
        }

        // Getter for passWord
        public String getPassWord() {
            return passWord;
        }

        // Setter for passWord (if you need it)
        public void setPassWord(String passWord) {
            this.passWord = passWord;
        }
    }
}

