package ssonin.pg.restfulws.service;

import org.springframework.stereotype.Service;
import ssonin.pg.restfulws.domain.User;
import ssonin.pg.restfulws.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        User savedUser = this.userRepository.save(user);
        return user;
    }
}
