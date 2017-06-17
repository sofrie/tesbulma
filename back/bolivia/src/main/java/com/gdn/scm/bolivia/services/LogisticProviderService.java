/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.LogisticProvider;
import com.gdn.scm.bolivia.request.LogisticProviderRequest;
import java.util.List;

/**
 *
 * @author sofrie.zumaytis
 */
public interface LogisticProviderService {
    void addLogisticProvider(LogisticProviderRequest a);
    List<LogisticProvider> GetAll();
    List<LogisticProvider> GetbyStatus(String status);
    void updateLogisticProvider(LogisticProvider a);
    void DeleteLogisticProvider(Integer id);
//    List<LogisticProvider> GetAllLogisticProvider(Integer merchantid);
}