package com.example.board;

import java.util.Date;
public class BoardVO {
	private int seq;

	private String title;

	private String writer;
	private String category;
	private String professor;
	private String place;
	private String duedate;
	private String content;
	private String grade;
	private String major;
	private Date regdate;

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getWriter() {
		return writer;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getPlace() {return place;}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDuedate() {return duedate;}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	public String getContent() {return content;}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getGrade() {return grade;}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String  getMajor() {
		return major;
	}
	public void setMajor(String  major) {
		this.major = major;
	}

}