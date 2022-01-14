package desafioMobiauto;

public class Question02 {

	public static Integer teste(String[] result) {
		char star = '*';
		Integer totalStar = 0;
		for (int i = 0; i < result.length; i++) {
			Integer qtStarStage = Integer.parseInt(result[i]);
			totalStar += qtStarStage;

			String qtStar = "---";
			StringBuilder newString = new StringBuilder(qtStar);
			if (qtStarStage != 0) {
				int index = qtStarStage - 1;
				for (int j = 0; j <= index; j++) {
					newString.setCharAt(j, star);
				}
			}

			System.out.println("Stage " + i + " it has " + newString + " star.");
		}
		return totalStar;
	}

	public static void main(String[] args) {
		String[] resultFase = { "0", "2", "1", "3", "1" };
		System.out.println("Star total is " + teste(resultFase));

	}

}
