package com.pojo;

public class Pojo_b {
public static void main(String[] args) {
	

	Pojo_A po = new Pojo_A();
int age = po.getAge();
System.out.println(age);


po.setAge(50);
int age2 = po.getAge();

System.out.println(age2);


}

}
