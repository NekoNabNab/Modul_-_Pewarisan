/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author nabil
 */
class Parent {
	public int x = 5;
}

class Child extends Parent {
	public int x = 10;

	public void Info(int x) {
	   System.out.println("Nilai x sebagai parameter = " + x);
	   System.out.println("Data member x di class Child = " + this.x);
	   System.out.println("Data member x di class Parent = " + super.x);
	}
}

public class NilaiX {
	public static void main(String args[]) {
	   Child tes = new Child();
	   tes.Info(20);
	}

}
