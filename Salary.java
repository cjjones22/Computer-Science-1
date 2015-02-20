/*
 * Name: Chris Jones
 *
 * Date: 2/3/2014
 *
 * Instructor: Todd Simeone
 *
 * Write A Program that will:
 * 1) allow user to enter job code (M, P, or O)
 * 2) allow user to enter salary
 * 3) calculate the bonus according to:
 * 			Everyone makes at least the $500
 *			Managers making over $100,000 make an additional $1,000
 *			Programmers making over $70,000 make an additional $500
 */

import csci130.*;

public class Salary {

	public static void main(String[] args) {

		char manager = 'M', programmer = 'P', other = 'O', position;

		double salary = 0.0, bonus = 500.00;

		System.out.print("Please enter the position code: ");
		position = KeyboardReader.readChar();

		System.out.print("Please enter your salary: $");
		salary = KeyboardReader.readDouble();

		System.out.println("You've entered " + position );

		// all receive 500
		// M making over 100000 get + $1000
		// P making over 70000 get + $500

		bonus = ((position == 'M') && (salary >= 100000))?(bonus + 1000):bonus;
		bonus = ((position == 'P') && (salary >= 70000))?(bonus + 500):bonus;

		System.out.println("Your bonus is $" + bonus + ", congratulations!");

	}

}