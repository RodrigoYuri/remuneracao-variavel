package br.com.portoseguro.rbc.remuneracaovariavel.config;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import lombok.Setter;

@Configuration
@ConfigurationProperties("spring.oracle.datasource")
@Setter
public class OracleConnection {
	
	    @NotNull
		private String username;
		
		@NotNull
		private String password;
		
		@NotNull
		private String url;
	
	   
	    @Bean
	    public DataSource dataSource() {
		   DriverManagerDataSource dataSource = new DriverManagerDataSource();
		   	dataSource.setUsername(username);
		   	dataSource.setPassword(password);
		   	dataSource.setUrl(url);
		   	dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		   	return dataSource;

	    }
	   
		@Bean
		HibernateJpaVendorAdapter jpaVendorAdapter() {
			HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
			adapter.setDatabase(Database.ORACLE);
			adapter.setShowSql(true);
			adapter.setDatabasePlatform("org.hibernate.dialect.Oracle10gDialect");
			adapter.setPrepareConnection(true);
			return adapter;
			
		}
		

	
	  


}
