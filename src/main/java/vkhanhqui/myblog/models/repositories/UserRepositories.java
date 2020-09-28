package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.User;
import vkhanhqui.myblog.models.dtos.UserDTO;

import java.util.List;
import java.util.Optional;

@Repository("userRepository")
public interface UserRepositories extends JpaRepository<User, String> {
    @Query(value = "select new vkhanhqui.myblog.models.dtos.UserDTO(username, password, email, enabled, roles) from User")
    List<UserDTO> findAllByUsernameNotIn(String username);

    @Modifying
    @Query(value = "delete p, u, ur from post p\r\n" + 
    		"      join user u ON p.user_id = u.username\r\n" + 
    		"      join user_role ur on ur.user_id=u.username\r\n" + 
    		"     where username= ?1", nativeQuery = true)
    void customDeletingUserByUsername(String username);
}
