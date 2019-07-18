package com.practice.algo.greedy;

import java.util.Arrays;

/**
 * 
 * @author joykumar
 *
 *         Given an array of jobs where every job has a deadline and associated
 *         profit if the job is finished before the deadline. It is also given
 *         that every job takes single unit of time, so the minimum possible
 *         deadline for any job is 1. How to maximize total profit if only one
 *         job can be scheduled at a time.
 */
public class JobSequencing {

	public void findMaxProfit() {
		String[] jobs = { "J1", "J2", "J3", "J4", "J5" };
		
		Integer[] profits = { 20, 15, 10, 5, 1 };
		Integer[] deadline = { 2, 2, 1, 3, 3 };
		// find the max amount in deadline
		int max_deadline = 0;
		for (int i = 0; i < deadline.length; i++) {
			if (deadline[i] > max_deadline) {
				max_deadline = deadline[i];
			}
		}
		// we need to sort the arrays in order of the descending order of
		// profits .
		Arrays.sort(profits);
		int[] slots = new int[max_deadline];
		String[] job_Sequence = new String[max_deadline];
		int totalProfit = 0;
		for (int i = 0; i < profits.length; i++) {
			int d = deadline[i];
			while (d > 0) {
				if (slots[d-1] == 0) {
					slots[d-1] = deadline[i];
					totalProfit = totalProfit + profits[i];
					job_Sequence[d-1] = jobs[i];
					break;
				}
				d--;
			}
		}
		
		for (int i=0;i<max_deadline;i++){
			System.out.println(job_Sequence[i]);
			
		}
		System.out.println(totalProfit);
	}

	public static void main(String[] args) {

		new JobSequencing().findMaxProfit();
	}
}
