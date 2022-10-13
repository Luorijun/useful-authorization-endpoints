package luorijun.useful.authorization.utils;

import org.springframework.security.core.context.SecurityContextHolder;

import lombok.val;
import luorijun.useful.authorization.entities.Account;

public class SessionUtils {
    public static Account currentAccount() {
        val context = SecurityContextHolder.getContext();
        if (context == null) throw new RuntimeException("安全上下文不存在");

        val authentication = context.getAuthentication();
        if (authentication == null) throw new RuntimeException("认证信息不存在");

        val principal = authentication.getPrincipal();
        if (!(principal instanceof Account)) throw new RuntimeException("认证主体类型异常");

        return (Account) principal;
    }
}
