package desafioMobiauto;

import java.util.ArrayList;
import java.util.List;

public class Question04 {

	List<Integer> points = new ArrayList<Integer>();

	public void checkScore(int[] wins, int[] ties) {
		Integer max = 0;
		Integer index = null;
		for (int i = 0; i < wins.length; i++) {
			for (int j = 0; j < ties.length; j++) {
				Integer win = wins[i] * 3;
				Integer tie = ties[j];
				if (i == j) {
					Integer teamScore = win + tie;
					points.add(teamScore);
					if (teamScore > max) {
						index = i;
						max = teamScore;
					}
				}
			}
		}
		System.out.println("The team " + index + " won this championship with " + max + " points.");
	}

	public static void main(String[] args) {
		int[] wins = { 1, 0, 3 };
		int[] tie = { 2, 2, 0 };

		Question04 ds = new Question04();
		ds.checkScore(wins, tie);

	}

}
