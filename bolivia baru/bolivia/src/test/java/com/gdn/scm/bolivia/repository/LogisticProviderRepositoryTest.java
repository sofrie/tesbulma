/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.repository;

import com.gdn.scm.bolivia.entity.LogisticProvider;
import java.math.BigDecimal;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author sofrie.zumaytis
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class LogisticProviderRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private LogisticProviderRepository logisticProviderRepository;

    @Test
    public void whenFindByLogisticName_thenReturnLogisticProvider() {
        
        // given
        LogisticProvider logistic = new LogisticProvider("kode", "a logistic", "Active", new BigDecimal(10), new BigDecimal(7));
        entityManager.persist(logistic);
        entityManager.flush();

        // when
        List<LogisticProvider> found = logisticProviderRepository.findByStatus(logistic.getStatus());

        // then
        assertThat(found.get(0).getStatus())
                .isEqualTo("Active");
    }
    
}
