package com.example.bootjpsthymeleaf1.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})//标注 哪个属性 不用转化为json的
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer age;

}
