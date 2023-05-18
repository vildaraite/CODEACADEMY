package lt.code.academy.eshop.service;

import lt.code.academy.eshop.dto.User;
import lt.code.academy.eshop.entity.UserEntity;
import lt.code.academy.eshop.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(User user) {
        userRepository.save(UserEntity.convert(user));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity =  userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(String.format("User %s not found", username)));

        return User.convert(userEntity);
    }
}