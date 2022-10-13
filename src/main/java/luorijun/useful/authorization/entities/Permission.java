package luorijun.useful.authorization.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import luorijun.useful.authorization.entities.supprot.TenantModel;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class Permission extends TenantModel {

    private String code;
    private String name;
    private String description;

    // ==============================
    // 关联字段
    // ==============================

    @ManyToOne
    private Service service;
}
