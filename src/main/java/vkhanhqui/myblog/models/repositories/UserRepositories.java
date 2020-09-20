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
    @Query(value = "delete p, u, ur\r\n" + 
    		"      from post p\r\n" + 
    		"      join user u ON p.user_id = u.username\r\n" + 
    		"      join user_role ur on ur.user_id=u.username\r\n" + 
    		"     where username= ?1", nativeQuery = true)
    void customDeletingUserByUsername(String username);
}
