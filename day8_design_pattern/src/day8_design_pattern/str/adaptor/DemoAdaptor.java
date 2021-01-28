package day8_design_pattern.str.adaptor;
import java.util.*;
/*
 * data processing application
 * 
 * 		YMSLI				ABC
 * 	Employee				Employee
 * 
 * 
 */
class RoundPeg {
	public void insertTohole(String str) {
		System.out.println("roundpeg insertTohole(): " + str);
	}
}

class SquarePeg {
	public void insert(String str) {
		System.out.println("SquarePeg insert(): " + str);
	}
}

//i want to make round peg compatbale to Square peg

class RoundToSquareApdator extends SquarePeg{
	private RoundPeg roundPeg;

	public RoundToSquareApdator(RoundPeg roundPeg) {
		this.roundPeg = roundPeg;
	}

	@Override
	public void insert(String str) {
		roundPeg.insertTohole(str);
	}
	
	
}
public class DemoAdaptor {
	
	public static void main(String[] args) {
		
		RoundPeg peg=new RoundPeg();
		SquarePeg peg2=new RoundToSquareApdator(peg);
		peg2.insert("some shape");
	}

}
