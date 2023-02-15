public class Main {

    public static void main(String[] args) {
        // Just to note, not using a database, but using a hashmap.
        IdAndPasswords idAndPasswords = new IdAndPasswords();

        LoginPage loginPage = new LoginPage(idAndPasswords.getLoginInfo());


    }
}
