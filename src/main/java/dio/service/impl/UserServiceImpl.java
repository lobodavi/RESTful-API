package dio.service.impl;

import java.util.NoSuchElementException;

import dio.service.UserService;
import org.springframework.stereotype.Service;

import dio.domain.model.User;
import dio.domain.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public User create(User userToCreate) {
        if (userRepository.existsById(userToCreate.getId()) && userToCreate.getId() != null) {
            throw new IllegalArgumentException("This User ID already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
