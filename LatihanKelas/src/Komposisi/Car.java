/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komposisi;

/**
 *
 * @author BAGINDAS
 */
class Car {

 //engine is a mandatory part of the car

 private final Engine engine;



 Car (String jenis) {

    engine = new Engine(jenis);

 }

 

 public Engine getEngine () {

	 return this.engine;

 }
 class Engine {

	String jenis;

	

	Engine(String jenis){

		this.jenis=jenis;

	}

	

	public String getJenis() {

		return jenis;

	}

}
}
