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
public class Client extends TenantModel {

    // ==============================
    // 基本信息
    // ==============================

    private String icon;
    private String name;
    private String description;

    // ==============================
    // 认证
    // ==============================

    private String clientId;
    private String clientSecret;

    // ==============================
    // 授权
    // ==============================

    private Integer lifetime;

    private Boolean delay;
    private Integer delayLength;

    private Boolean refresh;
    private Integer refreshLifetime;

    // ==============================
    // 关联字段
    // ==============================

    @OneToMany(mappedBy = "client")
    private List<Approval> approvals;

}
