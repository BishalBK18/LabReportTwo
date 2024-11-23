package com.labtwo;

public class VoteChecker {
	public void validage(int age) throws VoteAgeException {
		if (age < 18) {
			throw new VoteAgeException("You cannot vote");
		} else {
			System.out.println("Vote Your Choice");
		}
	}

	public static void main(String[] arg) {
		VoteChecker voteObject = new VoteChecker();

		try {
			voteObject.validage(10);
		} catch (VoteAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception caught");
		}

	}

}
