package com.divisiongis.rud.Config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableJpaRepositories(
    basePackages = "com.divisiongis.rud.Repository.gestion_direcciones",
    entityManagerFactoryRef = "entityManagerFactoryGD",
    transactionManagerRef = "transactionManagerGD"
)
public class JpaConfigGD {
    
    @Autowired
    private Environment env;

    @Primary
    @Bean(name = "entityManagerFactoryGD")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryGD(EntityManagerFactoryBuilder builder, @Qualifier("dataSourceGD") DataSource dataSource) {

        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));

        return builder.dataSource(dataSource)
                .properties(properties)
                .packages("com.divisongis.rud.Entity.gestion_direcciones")
                .persistenceUnit("gestion_direcciones")
                .build();

    }    

    @Primary
    @Bean(name = "transactionManagerGD")
    public PlatformTransactionManager transactionManager(@Qualifier("entityManagerFactoryGD") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
