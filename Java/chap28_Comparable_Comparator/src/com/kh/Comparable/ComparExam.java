package com.kh.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparExam {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person( 78, "�л�1"));
		people.add(new Person(79, "�л�2"));
		people.add(new Person(71, "�л�3"));
		//���̸� �������� ����
		Collections.sort(people);
		for(Person person : people) {
			System.out.println(person);
		}

	}

}
