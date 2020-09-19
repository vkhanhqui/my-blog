package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.User;

import java.util.List;
import java.util.Optional;

@Repository("userRepository")
public interface UserRepositories extends JpaRepository<User, String> {
    Optional<User> findByUsernameAndPassword(String username, String password);
    List<User> findAllByUsernameNotIn(String username);
    @Modifying
    @Query(value = "delete from User where username = ?1", nativeQuery = true)
    void customDeletingUserByUsername(String username);
    @Modifying
    @Query(value ="delete from user_role where user_id = ?1", nativeQuery = true)
    void customDeletingUserIdInUserRole(String user_id);
}
