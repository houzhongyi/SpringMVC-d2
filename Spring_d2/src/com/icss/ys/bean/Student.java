package com.icss.ys.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * 学生类
 * @author Administrator
 *
 */
public class Student {
	
	private int no;
	private String name;
	private String[] address;
	private ArrayList<String> phones;
	private Set<Hobby> hobbys; 
	private Map<String,Double> scores;
	
	
	public Student() {
		System.out.println("学生被创建");
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getAddress() {
		return address;
	}
	public void setAddress(String[] address) {
		this.address = address;
	}
	public ArrayList<String> getPhones() {
		return phones;
	}
	public void setPhones(ArrayList<String> phones) {
		this.phones = phones;
	}
	public Set getHobbys() {
		return hobbys;
	}
	public void setHobbys(Set hobbys) {
		this.hobbys = hobbys;
	}
	public Map<String, Double> getScores() {
		return scores;
	}
	public void setScores(Map<String, Double> scores) {
		this.scores = scores;
	}
	/**
	 * 方法： 学生考试
	 */
	public void exam(){
		System.out.println("中软大月考");
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", address=" + Arrays.toString(address) + ", phones=" + phones + ", hobbys="
				+ hobbys + ", scores=" + scores + "]";
	}	
}
