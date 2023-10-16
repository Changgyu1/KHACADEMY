package com.kh.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparExam {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person( 78, "학생1"));
		people.add(new Person(79, "학생2"));
		people.add(new Person(71, "학생3"));
		//나이를 기준으로 정렬
		Collections.sort(people);
		for(Person person : people) {
			System.out.println(person);
		}

	}

}
