package pl.kamilczubaszek.herokudeploy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.kamilczubaszek.herokudeploy.model.HerokuEntity;
import pl.kamilczubaszek.herokudeploy.service.HerokuService;

@RestController
public class HerokuController {

    private HerokuService herokuService;

    public HerokuController(HerokuService herokuService) {
        this.herokuService = herokuService;
    }

    @GetMapping("/heroku/{name}")
    public ResponseEntity<HerokuEntity> heroku(@PathVariable String name) {
        HerokuEntity herokuEntity = herokuService.getByName(name);
        return new ResponseEntity<>(herokuEntity, HttpStatus.OK);
    }

    @GetMapping("/heroku/save/{name}/{description}")
    public ResponseEntity<String> herokuSave(@PathVariable String name, @PathVariable String description) {
        long id = herokuService.saveNewHeroku(name,description);
        return new ResponseEntity<>("Saved new heroku with id: " + id, HttpStatus.OK);
    }
}
