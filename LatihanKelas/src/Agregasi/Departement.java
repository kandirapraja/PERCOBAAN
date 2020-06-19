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
 */
public class Departement {
    String name; 

	private List<Student> students; 

	Departement(String name, List<Student> students) 

	{ 

		

		this.name = name; 

		this.students = students; 

		

	} 

	

	public List<Student> getStudents() 

	{ 

		return students; 

	} 
}
