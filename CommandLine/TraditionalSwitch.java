public class TraditionalSwitch{
	public static void main(String[] a){
		String day = "MONDAY";
		switch (day) {
			case "MONDAY":
			case "FRIDAY":
			case "SUNDAY":
				System.out.println(6);
				break;
			case "TUESDAY":
				System.out.println(7);
				break;
			case "THURSDAY":
			case "SATURDAY":
				System.out.println(8);
				break;
			case "WEDNESDAY":
				System.out.println(9);
				break;
		}
	}
}