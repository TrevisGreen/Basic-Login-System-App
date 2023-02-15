import java.util.HashMap;

public class IdAndPasswords {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IdAndPasswords() {

        loginInfo.put("Trey", "123");
        loginInfo.put("Earl", "abc");
        loginInfo.put("Jay", "PASSWORD");
    }

    protected HashMap getLoginInfo() {
        return loginInfo;
    }
}
