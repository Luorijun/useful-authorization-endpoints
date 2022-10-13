package luorijun.useful.authorization.entities.supprot;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;
import luorijun.useful.authorization.entities.Tenant;

@Getter
@Setter
@MappedSuperclass
public abstract class TenantModel extends Model {

    @ManyToOne
    private Tenant tenant;
}
