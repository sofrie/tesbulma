/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.entity;

import static com.gdn.scm.bolivia.entity.User.COLUMN_ID;
import static com.gdn.scm.bolivia.entity.User.COLUMN_USERNAME;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author marlina
 */
@Entity
@Table(name = Role.TABLE_NAME)
public class Role {
    public static final String TABLE_NAME = "BLV_ROLE";
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_NAME = "NAME";
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = COLUMN_ID, nullable = false)    
    private Integer id;
    
    @Column(name = COLUMN_NAME, nullable = false)    
    private String name;
    
    Role() {}

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
