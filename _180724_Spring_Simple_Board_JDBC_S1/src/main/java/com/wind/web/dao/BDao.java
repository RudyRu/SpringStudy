package com.wind.web.dao;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.wind.web.dto.BDto;
import com.wind.web.util.Constant;

public class BDao {
	
	DataSource dataSource;
	JdbcTemplate template = null;
	
	public BDao() {
		template = Constant.template;
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
		
	public ArrayList<BDto> list(){		
		String query = "select bId, bName, bTitle, bContent, "
				+ "bDate, bHit, bGroup, bStep, bIndent "
				+ "from mvc_board order by bGroup desc, bStep asc";
		return (ArrayList<BDto>) template.query(query, new BeanPropertyRowMapper<BDto>(BDto.class));				
	}	
	
	public BDto contentView(String strID) {			
		upHit(strID);
		String query = "select * from mvc_board where bId = " + strID;
		return (BDto) template.queryForObject(query, new BeanPropertyRowMapper<BDto>(BDto.class));
	}	
	
	public void upHit(String bId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "update mvc_board set bHit = bHit + 1 where bId = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bId);
			
			int rn = preparedStatement.executeUpdate();
						
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}		
	}	
	
	public void write(final String bName, final String bTitle, final String bContent) {
		String query = "insert into mvc_board (bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) "
				+ "values (mvc_board_seq.nextval, ?, ?, ?, 0, mvc_board_seq.currval, 0, 0)";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);				
			}			
		});		
	}	
	
	public void delete(final String bId) {
		String query = "delete from mvc_board where bId = ?";
		template.update(query, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bId));				
			}			
		});
	}	
	
	public void modify(final String bId, final String bName, final String bTitle, final String bContent) {
		String query = "update mvc_board set bName = ?, bTitle = ?, bContent = ? where bId = ?";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setInt(4, Integer.parseInt(bId));				
			}
		});		
	}
	
	public void reply(String bId, final String bName, final String bTitle, final String bContent, 
			final String bGroup, final String bStep, final String bIndent) {
		replyShape(bGroup, bStep);
		String query = "insert into mvc_board (bId, bName, bTitle, bContent, "
				+ "bGroup, bStep, bIndent) values ("
				+ "mvc_board_seq.nextval, ?, ?, ?, ?, ?, ?)";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setInt(4, Integer.parseInt(bGroup));
				ps.setInt(5, Integer.parseInt(bStep) + 1);
				ps.setInt(6, Integer.parseInt(bIndent) + 1);
			}			
		});		
	}

	public BDto reply_view(String str) {
		String query = "select * from mvc_board where bId = " + str;
		return template.queryForObject(query, new BeanPropertyRowMapper<BDto>(BDto.class));
	}
	
	private void replyShape(final String strGroup, final String strStep) {
		String query = "update mvc_board set bStep = bStep + 1 where bGroup = ? and bStep > ?";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(strGroup));
				ps.setInt(2, Integer.parseInt(strStep));
			}			
		});		
	}
	
}
