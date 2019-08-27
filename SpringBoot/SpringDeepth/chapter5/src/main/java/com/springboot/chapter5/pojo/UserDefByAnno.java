package com.springboot.chapter5.pojo;

import com.springboot.chapter5.converter.SexConverter;
import com.springboot.chapter5.enumeration.SexEnum;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @param
 * @param
 * @param
 * @author
 * @Title:
 * @Description:
 * @return
 * @date 2019/8/18 8:49
 * @throws
 */

// 标明是一个实体类
@Entity(name="userDefByAnno") //用于JPA
// 定义映射的表
@Table(name="t_user")
public class UserDefByAnno {
    // 标明主键
    @Id
    // 主键策略，递增
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id = null;

    // 定义属性和表的映射关系
    @Column (name = "user_name")
    private String userName = null;

    private String note = null;

    // 定义转换器
    @Convert(converter = SexConverter.class)
    private SexEnum sex = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }
}
