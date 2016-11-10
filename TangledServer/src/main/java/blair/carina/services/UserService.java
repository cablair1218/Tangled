package blair.carina.services;

import blair.carina.model.User;


public interface UserService {

    User findByEmail(String email);
}
