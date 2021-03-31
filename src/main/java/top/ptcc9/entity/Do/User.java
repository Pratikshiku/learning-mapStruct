package top.ptcc9.entity.Do;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @Author HE LONG CAN
 * @Description TODO
 * @Date 2021-03-31 18:37:54
 */
@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private Integer addressId;
    /**
     * vo 中没有 password 字段
     */
    private String password;
    private String name;
    /**
     * vo 中 phone => 130****000
     */
    private String phone;
    /**
     * birthday 在 vo 中将转换为 birthday(String) 和 age(Integer)
     */
    private Date birthday;
    /**
     * createTime => createTime(String)
     */
    private Date createTime;
}
