package com.imooc.pojo;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 风间影月
 * @since 2023-05-22StuService
 */
public class Stu implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer id;

    private String name;

    private Integer age;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu{" +
        "id=" + id +
        ", name=" + name +
        ", age=" + age +
        "}";
    }
}
