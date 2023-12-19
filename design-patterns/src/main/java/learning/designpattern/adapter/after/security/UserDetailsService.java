package learning.designpattern.adapter.after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
