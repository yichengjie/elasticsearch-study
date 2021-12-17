package com.yicj.hello.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @program: elasticsearch-study
 * @description:
 * @author: yicj1
 * @create: 2021-12-17 13:54
 **/
@Data
//通过这个注解可以声明一个文档，指定其所在的索引库和type
@Document(indexName = "hello-document", type = "UserInfoBean")
public class UserInfo implements Serializable {
    // 必须指定一个id，
    @Id
    private long id;
    // 这里配置了分词器，字段类型，可以不配置，默认也可
    @Field(analyzer = "ik_smart", type = FieldType.Text)
    private String name;
    private Integer age;
    @Field(analyzer = "ik_smart", type = FieldType.Text)
    private String sex;
    @Field(analyzer = "ik_smart", type = FieldType.Text)
    private String desc;


    public UserInfo() {

    }

    public UserInfo(long id, String name, Integer age, String sex, String desc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.desc = desc;
    }
}
