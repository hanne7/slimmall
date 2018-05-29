package kr.hkit.slimmall.admin.mapper;

import java.util.List;

public class MemberVO {
	
	private String tableName;
	
	private List<Integer> idxes;
	
	private int idx;
	private String username;
	private String password;
	private String email;
	private String phone;
	private String address;
	
	
	public List<Integer> getIdxes() {
		return idxes;
	}
	public void setIdxes(List<Integer> idxes) {
		this.idxes = idxes;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
