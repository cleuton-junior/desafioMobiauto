package desafioMobiauto;

public class Question03 {

	public static final String SEPARATOR = ":";

	public static Integer qtBeeps(String[] time) {
		int counter = 0;
		for (String hourString : time) {
			String[] timeFormat = hourString.split(SEPARATOR);

			String hour = timeFormat[0];
			String minute = timeFormat[1];

			Integer hour0 = Integer.parseInt(hour.substring(0, 1));
			Integer hour1 = Integer.parseInt(hour.substring(1, 2));

			Integer minute0 = Integer.parseInt(minute.substring(0, 1));
			Integer minute1 = Integer.parseInt(minute.substring(1, 2));

			// AB:AB, AA:BB, AB:BA or AA:AA
			if ((hour0 == minute0) && (hour1 == minute1)) {
				counter++;
			} else if ((hour0 == hour1) && (minute0 == minute1)) {
				counter++;
			} else if ((hour0 == minute1) && (hour1 == minute0)) {
				counter++;
			} else if ((hour0 == hour1) && (hour0 == minute0) && (hour0 == minute1)) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		String[] arrayTime = { "11:00", "13:13", "10:00", "22:22", "14:41", "12:30" };
		System.out.println(qtBeeps(arrayTime));

	}

}
