package com.divisiongis.rud.Config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DataSourceConfig {

    @Bean(name = "dataSourcePD")
    @ConfigurationProperties(prefix = "spring.datasource.padrones_direcciones")
    public DataSource dataSourcePD() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "dataSourceGD")
    @ConfigurationProperties(prefix = "spring.datasource.gestion_direcciones")
    public DataSource dataSourceGD() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "dataSourceCAT")
    @ConfigurationProperties(prefix = "spring.datasource.catastro")
    public DataSource dataSourceCAT() {
        return DataSourceBuilder.create().build();
    }

}
