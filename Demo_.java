package com.java.instance;
class Vehicle{
}
class R15 extends Vehicle{
}
public class Demo {

		// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo d = new Demo();
        R15 obj = new R15();
        Vehicle v = new Vehicle();
        System.out.println(v instanceof Vehicle);
        System.out.println(v instanceof R15);
        //System.out.println(obj instanceof Vehicle);
        //System.out.println(d instanceof Demo);
	}

}
