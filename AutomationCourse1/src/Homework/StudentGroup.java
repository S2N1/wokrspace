package Homework;

import java.util.Arrays;

public class StudentGroup {

	String groupSubject;
	Student[] student;
	int freePlaces;

	StudentGroup() {

		this.student = new Student[5];
		this.freePlaces = 5;

	}

	StudentGroup(String groupsubject) {
		this();
		this.groupSubject = groupsubject;

	}

	/*-метод void addStudent(Student s) който добавя студент към групата(добавя
			го към масива на следващата празна позиция) ако специалността на
			студента съвпада с тази на групата, и разбира се, ако има свободни места.
			След добавяне на студент към групата да се намалят свободните места в
			групата.
	*/

	void addStudent(Student s) {
		if (this.groupSubject.equals(s.getSubject())) {
			for (int i = 0; i < student.length; i++) {
				if (student[i] == null) {
					student[i] = s;
					this.freePlaces--;
					break;

				}

			}

		}

	}

	/*-метод void emptyGroup() който освобождава всички места в групата (задава
				нов празен масив за полето students) и задава стойност 5 за полето
				freePlaces.
	*/

	void emptyGroup() {

		for (int i = 0; i < student.length; i++) {
			student[i] = null;

		}
		this.freePlaces = 5;
	}

	void printStudentsInGroup() {
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) {
				System.out.println("This student age is  " + student[i].getAge() + " his grade is  "
						+ student[i].getGrade() + " his money are  " + student[i].getMoney() + "he is  "
						+ +student[i].getYearInCollege() + " year in gollege " + " his name is  " + student[i].getName()
						+ " his subject is  " + student[i].getSubject() +  " is he a graduate  " + student[i].isDegree());

			}

		}
	}

	void theBeststudent() {
		String name = null;
		for (int i = 0; i < student.length; i++) {
			for (int k = 1; k < student.length; k++) {
				if (student[i] != null && student[k] != null) {

					if (student[i].getGrade() > student[k].getGrade()) {
						name = student[i].getName();
					}
					if (student[k].getGrade() > student[i].getGrade()) {
						name = student[k].getName();

					}

				}
			}

		}
		System.out.println("The best student is " + name);
	}
}
