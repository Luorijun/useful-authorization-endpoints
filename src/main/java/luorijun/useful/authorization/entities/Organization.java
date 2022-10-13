package luorijun.useful.authorization.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import luorijun.useful.authorization.entities.supprot.TenantModel;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class Organization extends TenantModel {

    // ==============================
    // 基本信息
    // ==============================

    private String icon;
    private String name;
    private String description;

    // ==============================
    // 关联字段
    // ==============================

    @ManyToOne
    private Organization parent;

    @OneToMany(mappedBy = "parent")
    private List<Organization> children;

    @OneToMany(mappedBy = "organization")
    private List<Account> users;

    @ManyToMany
    private List<Permission> permissions;
}
