package learning.designpattern.adapter.after_v2;

import learning.designpattern.adapter.after_v2.security.LoginHandler;
import learning.designpattern.adapter.after_v2.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("hambak", "hambak");
        System.out.println(login);
    }
}
