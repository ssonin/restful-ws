package ssonin.pg.restfulws.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ssonin.pg.restfulws.model.UserDto;

public interface UserService extends UserDetailsService {

    UserDto create(UserDto userDto);
}
