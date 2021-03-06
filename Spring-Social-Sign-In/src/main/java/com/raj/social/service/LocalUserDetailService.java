package com.raj.social.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raj.social.database.dao.UserDAO;
import com.raj.social.database.model.Role;
import com.raj.social.database.model.User;
import com.raj.social.dto.LocalUser;

@Service("localUserDetailService")
public class LocalUserDetailService implements UserDetailsService {

    @Autowired
    private UserDAO userDAO;

    /* (non-Javadoc)
     * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
     */
    @Override
    @Transactional
    public LocalUser loadUserByUsername(final String userId) throws UsernameNotFoundException {
        User user = userDAO.get(userId);
        if (user == null) {
            return null;
        }
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = buildSimpleGrantedAuthorities(user);
        return new LocalUser(user.getUserId(), user.getName(), user.getPassword(), user.getActive() == 1 ? true : false, true
                , true, true, simpleGrantedAuthorities);
    }

    /**
     * @param user
     * @return
     */
    private List<SimpleGrantedAuthority> buildSimpleGrantedAuthorities(final User user) {
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
        if (user.getRoles() != null) {
            for (Role role : user.getRoles()) {
                simpleGrantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
            }
        }
        return simpleGrantedAuthorities;
    }
}
