package luorijun.useful.authorization.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import luorijun.useful.authorization.entities.supprot.TenantModel;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class Service extends TenantModel {

    private String icon;
    private String name;
    private String description;

    // ==============================
    // 关联字段
    // ==============================

    @OneToMany(mappedBy = "service")
    private List<Permission> permissions;
}
