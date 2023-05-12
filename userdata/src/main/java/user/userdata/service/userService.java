package user.userdata.service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import user.userdata.model.UserData;

@Service
@Component
public class userService {
    ArrayList<UserData> userList= new ArrayList<>();
    public String saveUser(UserData user){
        userList.add(user);
    System.out.println(user.getEmail());
    System.out.println("user saved successfully");
    System.out.println(user.getFirstName());
    return user.getFirstName();
       

    }
    public ArrayList<UserData> getUserList(){
        return userList;
    }
    public UserData getUserByEmail(String email) {
        for (UserData tempuser : userList) {
            if (tempuser.getEmail().equals(email)) {
                return tempuser;
            }
        }
        return null;
    }
    
    
}
