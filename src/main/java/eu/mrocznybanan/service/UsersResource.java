package eu.mrocznybanan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import eu.mrocznybanan.entity.User;

@RestController
@RequestMapping("/users")
public class UsersResource {

    UsersService usersService;

    @Autowired
    UsersResource(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> allUsers() {
        return usersService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        int sqlCount = usersService.update(user);
        if (sqlCount == 0) {
            throw new UserNotFoundException(user.getId());
        }
        return new ResponseEntity<>(usersService.findById(user.getId()), HttpStatus.OK);
    }

    //

    @ResponseStatus(HttpStatus.NOT_FOUND)
    class UserNotFoundException extends RuntimeException {

        private static final long serialVersionUID = -5087293050785386886L;

        public UserNotFoundException(Long userId) {
            super("Could not find user '" + userId + "'.");
        }
    }

}