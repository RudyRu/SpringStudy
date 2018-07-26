package com.shin.web.board.dto;

import java.sql.Timestamp;

public class BoardDto {
	private int id;
	private String writer;
	private String title;
	private String content;
	private Timestamp date;
	private int hit;
	private int group;
	private int step;
	private int indent;

	public BoardDto() {}
	public BoardDto(int id, String writer, String title, String content, Timestamp date, int hit, int group, int step, int indent) {
		super();
		this.id = id;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.date = date;
		this.hit = hit;
		this.group = group;
		this.step = step;
		this.indent = indent;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	public int getIndent() {
		return indent;
	}
	public void setIndent(int indent) {
		this.indent = indent;
	}
	

}
