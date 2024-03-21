package com.yuva;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;

public class Question {
	private int id;
	private String name;
	private Map<String, String> answers;

	public Question(int id, String name, Map<String, String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("Question id :" + id);
		System.out.println("Question name :" + name);
		System.out.println("Answers are .....");
		Set<Entry<String, String>> set = answers.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println("Answer:" + entry.getKey() + " Posted By:" + entry.getValue());
		}
	}
}
