package web.mvc.test.business.custom.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Service;

import org.springframework.web.server.ResponseStatusException;
import web.mvc.test.business.custom.UserBO;
import web.mvc.test.entity.User;
import web.mvc.test.repository.UserRepository;

@Service
public class UserBOImpl implements UserBO {

    private UserRepository userRepository;

    public UserBOImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }


/*    @Override
    public User findByUsername(String username)  {

        User user = userRepository.findByUsername(username);
        if(user == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), mapRolesToAuthorities(user.getRole()));
    }*/




}
