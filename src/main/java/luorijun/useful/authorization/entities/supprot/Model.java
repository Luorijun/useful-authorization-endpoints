package luorijun.useful.authorization.entities.supprot;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import luorijun.useful.authorization.entities.Account;
import luorijun.useful.authorization.utils.SessionUtils;
import org.hibernate.Hibernate;

@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class Model {

    // ==============================
    // 主键
    // ==============================

    @Id
    @GeneratedValue
    private Long id;

    // ==============================
    // 审计字段
    // ==============================

    @ManyToOne
    private Account create_by;
    private LocalDateTime create_at;

    @ManyToOne
    private Account update_by;
    private LocalDateTime update_at;

    @PrePersist
    public void prePersist() {

        create_at = LocalDateTime.now();
        create_by = SessionUtils.currentAccount();

        update_at = LocalDateTime.now();
        update_by = SessionUtils.currentAccount();
    }

    @PreUpdate
    public void preUpdate() {
        update_at = LocalDateTime.now();
        update_by = SessionUtils.currentAccount();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Model model = (Model) o;
        return id != null && Objects.equals(id, model.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
