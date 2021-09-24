package jun.algorithm.romannumerals;

public class RomanNumeralsConverter {

	public int convert(String romanNumber) {
		if("".equals(romanNumber)) throw new NullPointerException();
		return calculate(romanNumber);
	}
	
	private int calculate(String romanNumber) {
		int result = 0;
		if(romanNumber.length() == 1) { return romanNumeralDictionary(romanNumber); } 
		else {
			String[] num = romanNumber.split("");
			for (int i = 0; i < num.length-1; i++) {
				int curr = romanNumeralDictionary(num[i]);
				
				if(romanNumeralsLogic(num[i], num[i+1])) { result -= curr; }
				else { result += curr; }
			}
			result += romanNumeralDictionary(num[num.length-1]);
		}
		return result;	
	}

	public boolean romanNumeralsLogic(String curr, String next) {
		return (romanNumeralDictionary(curr) < romanNumeralDictionary(next)) ? true : false;
	}

	private int romanNumeralDictionary(String curr) {
		switch (curr) {
			case "I": return 1;
			case "V": return 5;
			case "X": return 10;
			case "L": return 50;
			case "C": return 100;
			case "D": return 500;
			case "M": return 1000;
			default: throw new UnknownRomanNumberException();
		}
	}
}
