package com.first.springboot.zzg.Pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Data
@Entity
public class UserInfo {

    private Long id;

    private String name;
}
