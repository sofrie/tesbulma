/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.repository;

import com.gdn.scm.bolivia.entity.AWB;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sofrie.zumaytis
 */
public interface AWBRepository extends JpaRepository<AWB, String>{
     public List<AWB> findByReconStatus(String status);
     public List<AWB> findByMonth(String month);
}
