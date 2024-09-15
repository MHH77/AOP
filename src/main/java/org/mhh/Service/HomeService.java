package org.mhh.Service;

import org.mhh.DTO.UserDTO;
import org.mhh.DTO.UserRespDTO;
import org.mhh.Log.Loggable;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Loggable
    public String sayHello(String name) {
        return "Hello World ".concat(name);
    }

    @Loggable
    public String sayHello(UserDTO user) {
        return "Hello ".concat(user.getName());
    }

    @Loggable
    public UserRespDTO sayHello2(UserDTO user) {
        UserRespDTO userRespDTO = new UserRespDTO();
        userRespDTO.setName(user.getName());
        userRespDTO.setId(1);
        return userRespDTO;
    }


}
