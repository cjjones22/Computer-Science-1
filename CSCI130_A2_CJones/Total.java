/*
 * Name: Chris Jones
 *
 * Date: 2/5/2014
 *
 * Assignment Number: 2
 *
 * Instructor: Todd Simeone
 *
 *
 */

import java.util.Scanner;

public class Total {

	private long total;

	public Total() {
		total = 0;
	}

	public final void addToTotal(int val) {
		total += val;
	}

	public final void subtractFromTotal(int val) {
		total -= val;
	}

	public final void incrementTotal() {
		total++;
	}

	public final void decrementTotal() {
		--total;
	}

	public static final void main(String[] args) {
    Scanner input = new Scanner(System.in);

		Total running = new Total();

		System.out.println("Enter an initial value");
		running.addToTotal(input.nextInt());

		System.out.println();
		System.out.println("Enter an amount smaller than the initial value");
		running.subtractFromTotal(input.nextInt());

		System.out.println("Current total is " + running.total);

		System.out.println();
		System.out.println("Now incrementing total");
		running.incrementTotal();

		System.out.println("Current total is " + running.total);

		System.out.println();
		System.out.println("Now decrementing total");
		running.decrementTotal();

		System.out.println("Current total is " + running.total);
	}
}
