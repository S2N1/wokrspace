package Homework;

public class StudentGroup {

	String groupSubject;
	Student[] students;
	int freePlaces;

	/*-конструктор по подразбиране който създава места за 5 студента в групата
	(инициализира полето students с нов масив от 5 елемента) и задава стойност
	5 на полето freePlaces
	*/

	StudentGroup() {

		this.students = new Student[5];
		this.freePlaces = 5;

	}

	/*
	 * констуктор StudentGroup(String subject) които първо извиква конструктора
	 * по подразбиране и задава стойност на полето groupSubject
	 */

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

	void addStudent(Student student) {
		
		if(this.groupSubject == groupSubject && )

	}

}
