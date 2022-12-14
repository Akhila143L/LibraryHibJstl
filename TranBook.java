package com.infinite.libraryproj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TranBook")
public class TranBook {

	@Id
	@Column(name="tid")
	private int tid;

	@Column(name="userName")
	private String userName;
	
	@Column(name="bookId")
	private int bookId;

	public TranBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TranBook(int tid, String userName, int bookId) {
		super();
		this.tid = tid;
		this.userName = userName;
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "TranBook [tid=" + tid + ", userName=" + userName + ", bookId=" + bookId + "]";
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

}
