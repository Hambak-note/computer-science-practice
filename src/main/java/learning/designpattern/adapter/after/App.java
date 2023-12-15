package learning.designpattern.adapter.after;

import learning.designpattern.adapter.after.security.LoginHandler;
import learning.designpattern.adapter.after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("hambak", "hambak");
        System.out.println(login);
    }
}
