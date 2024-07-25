package com.example.youthlabdemo.domain;

import com.example.youthlabdemo.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "member_id")
    private Long id;

    private String username;
    private String password;

    private Integer age;

    private String email;
    private Integer point;


    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Community> communities=new ArrayList<>();
}
