package pl.kamilczubaszek.herokudeploy.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class HerokuEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    public HerokuEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public HerokuEntity() {
    }
}
