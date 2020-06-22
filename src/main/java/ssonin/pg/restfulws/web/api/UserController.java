package ssonin.pg.restfulws.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ssonin.pg.restfulws.model.UserDto;
import ssonin.pg.restfulws.service.UserService;

@RestController
@RequestMapping(path = "users", produces = "application/json")
class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getUser() {
        return "GET /users/ is called";
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<UserDto> postUser(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(userService.create(userDto), HttpStatus.CREATED);
    }

    @PutMapping
    public String putUser() {
        return "PUT /users/ is called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "DELETE /users/ is called";
    }
}
