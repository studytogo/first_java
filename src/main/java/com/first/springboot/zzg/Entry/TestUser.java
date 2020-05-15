package com.first.springboot.zzg.Entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "test_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestUser {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 20)
    private String name;
}
