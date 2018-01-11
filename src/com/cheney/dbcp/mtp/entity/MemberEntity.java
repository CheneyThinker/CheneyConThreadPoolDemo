package com.cheney.dbcp.mtp.entity;

import com.cheney.dbcp.mtp.annotation.FieldDecorate;
import com.cheney.dbcp.mtp.annotation.TypeDecorate;

@SuppressWarnings("serial")
@TypeDecorate(table = "Member")
public class MemberEntity implements java.io.Serializable {

	@FieldDecorate
	private String note;
	@FieldDecorate
	private String name;
	@FieldDecorate(key = true , inc = true)
	private Integer id;

	public MemberEntity() {
	}
	public MemberEntity(String note, String name) {
		this.note = note;
		this.name = name;
	}
	public String getNote() {
		return note;
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
