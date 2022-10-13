package luorijun.useful.authorization.entities;

import java.util.List;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import luorijun.useful.authorization.entities.supprot.TenantModel;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class Account extends TenantModel {

    // ==============================
    // 认证字段
    // ==============================

    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String username;
    private String email;
    private Boolean emailValid;
    private String phone;
    private Boolean phoneValid;

    @Column(nullable = false)
    private Status status = Status.ENABLED;

    // ==============================
    // 账号信息
    // ==============================

    private String avatar;
    private String name;
    private String bio;
    @Column(nullable = false)
    private Gender gender = Gender.SECRETED;

    // ==============================
    // 关联字段
    // ==============================

    @ManyToOne
    private Organization organization;

    @ManyToMany
    private List<Role> roles;

    @ManyToMany
    private List<Permission> permissions;

    @OneToMany(mappedBy = "sender")
    private List<Agent> sentAgents;

    @OneToMany(mappedBy = "receiver")
    private List<Agent> receivedAgents;

    @OneToMany(mappedBy = "account")
    private List<Approval> approvals;

    // ==============================
    // 子类型
    // ==============================

    public enum Gender {
        MALE, FEMALE, OTHER, SECRETED,
    }

    public enum Status {
        ENABLED, DISABLED,
    }
}
