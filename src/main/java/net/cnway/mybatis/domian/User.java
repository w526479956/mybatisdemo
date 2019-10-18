package net.cnway.mybatis.domian;

import lombok.Data;

/**
 * @author john.wang
 * @create 2019-10-16
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
