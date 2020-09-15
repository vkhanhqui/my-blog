package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.Member;

import java.util.Optional;

@Repository("memberRepository")
public interface MemberRepositories extends JpaRepository<Member, Long> {
    Optional<Member> findByUsernameAndPassword(String username, String password);
}
