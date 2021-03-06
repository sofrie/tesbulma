/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.repository;

import com.gdn.scm.bolivia.entity.UploadHistory;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sofrie.zumaytis
 */
@Repository
public interface UploadHistoryRepository extends JpaRepository<UploadHistory, String> {

    public List<UploadHistory> findByMonth(String month);

    public List<UploadHistory> findByYear(String year);

    public List<UploadHistory> findByLogistic(String logistic);
}
