package com.shin.web.board.dao;

//import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.shin.web.board.dto.BoardDto;
import com.shin.web.util.Constant;

public class BoardDao {
	//DataSource dataSource;
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}


	public BoardDao() {
		template = Constant.template;
//		try {
//			Context context = new InitialContext();
//			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
//		} catch (NamingException e) {
//			e.printStackTrace();
//		}
	}
	
	public ArrayList<BoardDto> list(){
		String query = "select ID, WRITER, TITLE, CONTENT, \"DATE\", HIT, \"GROUP\", STEP, INDENT from mvc_board order by \"GROUP\" desc, STEP asc";
		ArrayList<BoardDto> list = (ArrayList<BoardDto>) template.query(query, new BeanPropertyRowMapper<BoardDto>(BoardDto.class));
		return list;
	}
	
	public BoardDto view(String vid) {
		System.out.println("board dao : "+ vid);
		
		upHit(vid);
		String query = "select * from mvc_board where id = "+vid;

		BoardDto dto = template.queryForObject(query, new BeanPropertyRowMapper<BoardDto>(BoardDto.class));
		return dto;
	}

	public void write(final String writer, final String title, final String content) {

		String query = "insert into mvc_board (id, name, title, content, hit, group, step, indent) values (mvc_board_seq.nextval, ?, ?, ?, 0, mvc_board_seq.currval, 0, 0)";
		
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, writer);
				ps.setString(2, title);
				ps.setString(3, content);
			}
		});
	}

	public void delete(final String id) {
		String query = "delete from mvc_board where bId = ?";

		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, id);
			}
		});
	}
	

	public void modify(final String id, final String writer, final String title, final String content) {
		String query = "update mvc_board set writer=?, title=?, content=? where id=?";
		
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, writer);
				ps.setString(2, title);
				ps.setString(3, content);
				ps.setInt(4, Integer.parseInt(id));
			}
		});
	}

	

	public BoardDto reply_view(String id) {
		String query = "select * from mvc_board where id = " + id;
		return template.queryForObject(query, new BeanPropertyRowMapper<BoardDto>(BoardDto.class));
	}

	public void reply(String id, final String writer, final String title, final String content, final String group, final String step, final String indent) {
		//System.out.println("boarddao----reply:"+title);
		replyShape(group, step);

		String query = "insert into mvc_board (id, writer, title, content, group, step, indent) values (mvc_board_seq.nextval, ?, ?, ?, ?, ?, ?)";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, writer);
				ps.setString(2, title);
				ps.setString(3, content);
				ps.setInt(4, Integer.parseInt(group));
				ps.setInt(5, Integer.parseInt(step)+1);
				ps.setInt(6, Integer.parseInt(indent)+1);
			}
		});
	}
	
	public void upHit(final String id) {
		String query = "update mvc_board set hit = hit + 1 where id = ?";
		template.update(query, new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(id));
			}
		});
	}
	
	private void replyShape(final String group, final String step) {
		String query = "update mvc_board set step = step + 1 where group = ? and step > ?";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, group);
				ps.setString(2, step);
			}
		});
	}
}
