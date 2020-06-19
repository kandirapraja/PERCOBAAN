/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agregasi;

import java.util.List;

/**
 *
 * @author BAGINDAS
 *
 */
public class Institute {
    String instituteName; 

	private List<Departement> departments; 

	

	Institute(String instituteName, List<Departement> departments) 

	{ 

		this.instituteName = instituteName; 

		this.departments = departments; 

	} 

	

	// count total students of all departments 

	// in a given institute 

	public int getTotalStudentsInInstitute() 

	{ 

		int noOfStudents = 0; 

		List<Student> students; 

		for(Departement dept : departments) 

		{ 

			students = dept.getStudents();

			noOfStudents += students.size();

		} 

		return noOfStudents; 

	} 
}
