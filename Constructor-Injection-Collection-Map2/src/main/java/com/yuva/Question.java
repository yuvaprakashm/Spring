package com.yuva;

import java.util.Map;

public class Question {
	private int id;
	private String name;
	private Map<Answer, User> answers;

	public Question(int id, String name, Map<Answer, User> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("Question ID: " + id);
		System.out.println("Question Name: " + name);
		System.out.println("Answers...");

		for (Map.Entry<Answer, User> entry : answers.entrySet()) {
			Answer answer = entry.getKey();
			User user = entry.getValue();

			System.out.println("Answer Information:");
			System.out.println(answer);
			System.out.println("Posted By:");
			System.out.println(user);
		}
	}

}
