package luorijun.useful.authorization.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import luorijun.useful.authorization.entities.supprot.TenantModel;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class Role extends TenantModel {

    private String name;
    private String description;

    // ==============================
    // 关联字段
    // ==============================

    @ManyToMany
    private List<Permission> permissions;
}
