package cn.gsein.platform.system.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "system_user")
@Data
public class User extends BaseEntity {

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    @Column
    private String username;

    /**
     * 性别 0-男 1-女
     */
    private Integer gender;
    /**
     * 密码
     */
    @Column
    private String password;


    /**
     * 身份证号
     */
    @Column
    private String idCard;


    /**
     * 邮箱
     */
    @Column
    private String email;


    /**
     * 电话
     */
    @Column
    private String phone;


    /**
     * 生日
     */
    @Column
    private LocalDateTime birthday;

    @Column
    private Integer age;

    /**
     * 状态 1-正常 2-禁用
     */
    @Column
    private Integer status;

    /**
     * 上次登录时间
     */
    @Column
    private LocalDateTime lastLogin;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", password='" + password + '\'' +
                ", idCard='" + idCard + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                ", status=" + status +
                ", lastLogin=" + lastLogin +
                "} " + super.toString();
    }
}
