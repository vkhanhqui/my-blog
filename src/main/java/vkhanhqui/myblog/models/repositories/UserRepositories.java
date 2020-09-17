package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.User;

import java.util.List;
import java.util.Optional;

@Repository("userRepository")
public interface UserRepositories extends JpaRepository<User, String> {
    Optional<User> findByUsernameAndPassword(String username, String password);
    List<User> findAllByUsernameNotIn(String username);
}
