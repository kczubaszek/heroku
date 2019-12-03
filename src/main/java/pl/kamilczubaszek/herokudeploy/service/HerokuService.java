package pl.kamilczubaszek.herokudeploy.service;

import org.springframework.stereotype.Service;
import pl.kamilczubaszek.herokudeploy.dao.HerokuRepository;
import pl.kamilczubaszek.herokudeploy.model.HerokuEntity;

@Service
public class HerokuService {

    private HerokuRepository herokuRepository;

    public HerokuService(HerokuRepository herokuRepository) {
        this.herokuRepository = herokuRepository;
    }

    public HerokuEntity getByName(String name) {
        return herokuRepository.findByName(name);
    }

    public long saveNewHeroku(String name, String description) {
        HerokuEntity herokuEntity = new HerokuEntity(name,description);
        return herokuRepository.save(herokuEntity).getId();
    }
}
