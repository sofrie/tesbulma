/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.entity;

import static com.gdn.scm.bolivia.entity.Invoice.COLUMN_ID;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author marlina
 */
@Entity
@Table(name = User.TABLE_NAME)
public class User {
    
    public static final String TABLE_NAME = "BLV_USER";
    
    public static final String COLUMN_ID = "ID";
    
    public static final String COLUMN_USERNAME = "USERNAME";
    
    public static final String COLUMN_PASSWORD = "PASSWORD";
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = COLUMN_ID, nullable = false)    
    private Integer id;
    
    @Column(name = COLUMN_USERNAME, nullable = false)    
    private String username;
     
    @Column(name = COLUMN_PASSWORD, nullable = false)    
    private String password;
      
    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private List<Role> roles;

    User() {}

    public User(String username, String password, List<Role> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
