package luorijun.useful.authorization.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import luorijun.useful.authorization.entities.supprot.TenantModel;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class Agent extends TenantModel {

    @ManyToOne
    private Account sender;

    @ManyToOne
    private Account receiver;

    @ManyToMany
    private List<Permission> permissions;
}
