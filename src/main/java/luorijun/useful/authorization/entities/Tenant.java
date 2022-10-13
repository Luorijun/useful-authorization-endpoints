package luorijun.useful.authorization.entities;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import luorijun.useful.authorization.entities.supprot.Model;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "Tenant", indexes = {
    @Index(name = "idx_tenant_name", columnList = "name")
})
public class Tenant extends Model {

    // ==============================
    // 基本信息
    // ==============================

    private String icon;
    private String name;
    private String description;

    private Status status;

    public enum Status {
        DEVELOPMENT, STAGING, PRODUCTION,
    }
}
