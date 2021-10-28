package ssonin.pg.restfulws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ssonin.pg.restfulws.domain.User;
import ssonin.pg.restfulws.model.UserDto;
import ssonin.pg.restfulws.repository.UserRepository;

@Service("UserService")
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto create(UserDto userDto) {
        User user = User.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .password(userDto.getPassword()).build();
        User savedUser = this.userRepository.save(user);
        UserDto result = new UserDto();
        result.setFirstName(savedUser.getFirstName());
        result.setLastName(savedUser.getLastName());
        result.setEmail(savedUser.getEmail());
        return result;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
