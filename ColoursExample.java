/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coloursexample;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dimco
 */
public class ColoursExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
	System.out.println("What is your age: ");
	int age = sc.nextInt();
	
	ArrayList<String> colours = new ArrayList<>();
	
	colours.add("white");
	colours.add("pink");
	colours.add("red");
	colours.add("green");
	colours.add("blue");
	colours.add("black");
	
	
	String result = "";
	
	if (age <=17)
	{
	result = colours.get(0);
	}
	else if (age <= 24)
	{
	result = colours.get(1);
	}
	else if (age <= 35)
	{
	result = colours.get(2);
	}
	else if (age <= 45)
	{
	result = colours.get(3);
	}
	else if (age <= 55)
	{
	result = colours.get(4);
	}
	else
	{
	result = colours.get(5);
	}

		System.out.println("The colour that suits you because of your age is " + result);
    }
    
}
