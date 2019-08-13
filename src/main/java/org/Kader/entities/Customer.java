package org.Kader.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id @GeneratedValue
	private Integer id;
	private String name;
	private String issue;
	private String issueId;
	private String age;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer id, String name, String issue, String issueId, String age) {
		super();
		this.id = id;
		this.name = name;
		this.issue = issue;
		this.issueId = issueId;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getIssueId() {
		return issueId;
	}

	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", issue=" + issue + ", issueId=" + issueId + ", age=" + age
				+ "]";
	}
	
	

}
