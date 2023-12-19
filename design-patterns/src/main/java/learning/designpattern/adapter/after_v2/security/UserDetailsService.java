package learning.designpattern.adapter.after_v2.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
