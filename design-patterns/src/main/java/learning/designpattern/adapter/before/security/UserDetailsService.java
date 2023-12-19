package learning.designpattern.adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
