/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.request.AWBRequest;
import java.util.List;

/**
 *
 * @author sofrie.zumaytis
 */
public interface AWBService {

    void addAWB(AWBRequest a);

    List<AWB> GetAll();

    List<AWB> GetbyStatus(String status);
    
    List<AWB> GetbyMonth(String month);

    void updateAWB(AWB a);

    void DeleteAWB(Integer id);
}
