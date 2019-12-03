package pl.kamilczubaszek.herokudeploy.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kamilczubaszek.herokudeploy.model.HerokuEntity;

@Repository
public interface HerokuRepository extends CrudRepository<HerokuEntity,Long> {
    HerokuEntity findByName(String name);
}
