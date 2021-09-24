package jun.algorithm.romannumerals;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

import jun.algorithm.romannumerals.RomanNumeralsConverter;

public class RomanNumeralsConverterTest {
	RomanNumeralsConverter converter;
	
	@Before
	public void setUp() {
		converter = new RomanNumeralsConverter(); 
	}
	
	@Test(expected=UnknownRomanNumberException.class)
	public void passingRandomCharacter() {
		converter.convert("ASDF");
	}
	
	@Test(expected=NullPointerException.class)
	public void passingEmptyCharacter() {
		converter.convert("");
	}
	
	@Test
	public void convertITo1() {
		int result = converter.convert("I");
		
		assertThat(result, is(1));
	}
	
	@Test
	public void convertIITo2() {
		int result = converter.convert("II");
		
		assertThat(result, is(2));
	}
	
	@Test
	public void convertIIITo3() {
		int result = converter.convert("III");
		
		assertThat(result, is(3));
	}
	
	@Test
	public void convertIVo4() {
		int result = converter.convert("IV");
		
		assertThat(result, is(4));
	}
	
	@Test
	public void convertXVIo16() {
		int result = converter.convert("XVI");
		
		assertThat(result, is(16));
	}
	
	@Test
	public void convertXLIXo49() {
		int result = converter.convert("XLIX");
		
		assertThat(result, is(49));
	}
	
	@Test
	public void convertDCCCo49() {
		int result = converter.convert("DCCC");
		
		assertThat(result, is(800));
	}
}
