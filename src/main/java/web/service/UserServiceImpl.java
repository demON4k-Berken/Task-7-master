package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Service
//@Transactional(readOnly = true)
@Transactional
public class UserServiceImpl implements UserService {

//    @Autowired
    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
//    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
//    @Transactional
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
//    @Transactional
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);
    }

    @Override
    public User findById(Long id) {
        return userDAO.findById(id);
    }

    @Override
    public List<User> showAllUsers() {
        return userDAO.findAllUsers();
    }
}
