/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.repository;

import com.gdn.scm.bolivia.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author marlina
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
