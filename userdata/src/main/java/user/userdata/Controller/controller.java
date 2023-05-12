package user.userdata.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import user.userdata.model.UserData;
import user.userdata.service.userService;

@RestController
public class controller {
    @Autowired
    userService userService;
    @PostMapping("/create-user")
public String saveUser(@RequestBody UserData user) {
    return userService.saveUser(user);
}

    @GetMapping("get-users")
    public ArrayList<UserData> getAlluser(){
        return userService.getUserList();
    }
        @GetMapping("/get-user")
    public UserData getUserByEmail(@RequestParam String email) {
        return userService.getUserByEmail(email);
    }

}
