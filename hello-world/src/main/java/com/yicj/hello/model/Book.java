package com.yicj.hello.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: elasticsearch-study
 * @description:
 * @author: yicj1
 * @create: 2022-01-04 11:27
 **/
@Data
@Document(indexName = "book",createIndex = true)
public class Book implements Serializable {
    @Id
    @Field(type = FieldType.Text)
    private String id;
    // 标题
    @Field(analyzer="ik_max_word")
    private String title;
    //作者
    @Field(analyzer="ik_max_word")
    private String author;
    //价格
    @Field(type = FieldType.Double)
    private Double price;
    //创建日期
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    @Field(type = FieldType.Date,format = DateFormat.basic_date_time)
    private Date createTime;
    //更新日期
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    @Field(type = FieldType.Date,format = DateFormat.basic_date_time)
    private Date updateTime;
}
