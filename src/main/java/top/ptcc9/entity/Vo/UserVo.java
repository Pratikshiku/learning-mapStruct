package top.ptcc9.entity.Vo;

import lombok.Data;

/**
 * @Author HE LONG CAN
 * @Description TODO
 * @Date 2021-03-31 18:40:11
 */
@Data
public class UserVo {
    private Integer id;
    private String username;
    private String phone;
    private String address;
    private String birthday;
    private Integer age;
    private String createTime;
}
