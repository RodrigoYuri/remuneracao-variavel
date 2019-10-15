package br.com.portoseguro.rbc.remuneracaovariavel.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "oracleEntityManagerFactory",
        transactionManagerRef = "oracleTransactionManager",
        basePackages = { "br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.repository" }
)
public class OracleConnection {
	
	    @NotNull
		private String username;
		
		@NotNull
		private String password;
		
		@NotNull
		private String url;
	
	   @Primary
	   @Bean(name = "oracleDataSource")
	    @ConfigurationProperties(prefix = "spring.oracle.datasource")
	    public DataSource dataSource() {
		   DriverManagerDataSource dataSource = new DriverManagerDataSource();
		   	dataSource.setUsername(username);
		   	dataSource.setPassword(password);
		   	dataSource.setUrl(url);
		   	dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		   	return dataSource;

	    }

	    @Primary
	    @Bean(name = "oracleEntityManagerFactory")
	    public LocalContainerEntityManagerFactoryBean
	    entityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("oracleDataSource") DataSource dataSource) {
	        return builder
	                .dataSource(dataSource)
	                .packages("br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity")
	                .persistenceUnit("oraclePU")
	                .build();
	    }
	    @Primary
	    @Bean(name = "oracleTransactionManager")
	    public PlatformTransactionManager transactionManager(@Qualifier("oracleEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
	        return new JpaTransactionManager(entityManagerFactory);
	    }
	    
	  


}
