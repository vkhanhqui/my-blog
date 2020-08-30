package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.Account;

@Repository("accountRepository")
public interface AccountRepositories extends JpaRepository<Account, Long> {
}
