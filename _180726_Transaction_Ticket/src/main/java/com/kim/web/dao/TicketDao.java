package com.kim.web.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.kim.web.dto.TicketDto;

public class TicketDao {
	
	JdbcTemplate template;
	
	PlatformTransactionManager transactionManager;
	
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public TicketDao() {
		System.out.println(template);
	}
	
	public void buy_ticket(final TicketDto dto) {
		System.out.println("buyTicket()");
		System.out.println("dto.getConsumerId()");
		System.out.println("dto.getAmount()");
		
		TransactionDefinition definition = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(definition);
		
		try {
			
			//step1
			String query="insert into card(consumerId, amount) values (?, ?)";
			template.update(query, new PreparedStatementSetter() {
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setString(1, dto.getConsumerId());
					ps.setString(2, dto.getAmount());				
				}			
			});
			
			//step2
			query = "insert into ticket(consumerId, countnum) values (?, ?)";
			template.update(query, new PreparedStatementSetter() {
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setString(1, dto.getConsumerId());
					ps.setString(2, dto.getAmount());				
				}			
			});
			
			transactionManager.commit(status);
			
		}catch(Exception e) {
			e.printStackTrace();
			
			transactionManager.rollback(status);
		}
		
		
	}
}
