class Account {
    public String name;
    protected String email;
    private String password;

    // getter
    public String getPassword() {
        return this.password;
    }

    // setter
    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class AccessModifiers {
    public static void main(String args[]) {
        Account account1 = new Account();
        account1.name = "Divyansh";
        account1.email = "777divyanshgoyal@gmail.com";
        account1.setPassword("Divyansh123");
        System.out.println(account1.getPassword());
    }
}
