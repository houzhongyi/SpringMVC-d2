package com.icss.ys.bean;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Boy {
	@Value(value="jack")
	private String name ;
	private int age;
	@Resource(name="dog")
	private Dog dog;
	private String[] phones;
	private ArrayList<String> address;
	private Map<String,String> maps;
	private Set set;
	
	
	public Boy() {
		System.out.println("默认boy被创建时调用的构造方法");
	}
	
	
	public Boy(String name, int age) {
		System.out.println("自定义构造器创建");
		this.name = name;
		this.age = age;
	}
		

	public Boy(String name, int age, Dog dog) {
		super();
		this.name = name;
		this.age = age;
		this.dog = dog;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	//初始化
	@PostConstruct
	public void init(){
		System.out.println("容器将对象初始化");
	}
	//销毁
	@PreDestroy
	public void destroy(){
		System.out.println("对象被销毁");
	}


	public String[] getPhones() {
		return phones;
	}


	public void setPhones(String[] phones) {
		this.phones = phones;
	}


	public ArrayList<String> getAddress() {
		return address;
	}


	public void setAddress(ArrayList<String> address) {
		this.address = address;
	}


	public Map<String, String> getMaps() {
		return maps;
	}


	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	
	
}
