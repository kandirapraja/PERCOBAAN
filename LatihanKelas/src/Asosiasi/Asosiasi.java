/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asosiasi;

/**
 *
 * @author BAGINDAS
 */
public class Asosiasi {
   
    public static void main (String[] args) 

	{ 

		Bank bank = new Bank("Axis"); 

		Employee emp = new Employee("Neha"); 

		

		System.out.println(emp.getEmployeeName() + 

			" is employee of " + bank.getBankName()); 

	} 
}
