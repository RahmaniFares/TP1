package UserService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
@WebService
public class UserCRUD {

     private List<User> users = new ArrayList<>();

    @WebMethod
    public List<User> list(){
        System.out.println(users);
        return users;
    }
    @WebMethod
    public User add(@WebParam(name="user") User user){
        users.add(user);
        return user;
    }

    @WebMethod
    public User update(@WebParam(name="user") User user){
        for(int i = 0; i < users.size(); i++){
            if (users.get(i).getId() == user.getId()){
                users.remove(i);
                users.add(user);
            }
        }
        return user;
    }

    @WebMethod
    public void delete(@WebParam(name="user") User user){
        users.remove(user);
    }
}
