package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.Information;

@Repository("informationRepository")
public interface InformationRepositories extends JpaRepository<Information, Long> {
}
