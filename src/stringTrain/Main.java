package stringTrain;


public class Main {
	public static void main(String[] args) {
		
		String str = "acgsx";
		System.out.println(isUniqueChars(str));

	}
	
	public static boolean isUniqueChars(String str) {
		if(str == null || str.length() == 0 || str.length() > 256)
			return false;
		
		boolean[] record_char = new boolean[256];
		
		for(char s : str.toCharArray()) {
			if(record_char[s]) {
				return false;
			} else {
				record_char[s] = true;
			}
		}
		
		return true;
	}

}
