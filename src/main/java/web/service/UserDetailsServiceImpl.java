package web.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


// Для создания UserDetails используется интерфейс UserDetailsService, с единственным методом:
public class UserDetailsServiceImpl implements UserDetailsService {
    // тут будет юзер дао и конструктор

    // тут возвращать будет юзерДао по ID
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
