package com.sonder.interview;

import java.util.Arrays;
import java.util.List;

public class Sample {
	private String name;
    private int age;
    private String[] position;              
    private List<String> skills;   
    
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
	public String[] getPosition() {
		return position;
	}
	public void setPosition(String[] position) {
		this.position = position;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Sample [name=" + name + ", age=" + age + ", position=" + Arrays.toString(position) + ", skills="
				+ skills + "]";
	}
    
}
