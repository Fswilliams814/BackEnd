package switchy;


public class SwitchDemo {
	int numberGrade = 83;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwitchDemo().runTests();
		
		

	}

	private void runTests() {
		// TODO Auto-generated method stub
		calculateLetterGradeUsingIf(numberGrade);
		
	}

	private void calculateLetterGradeUsingIf(int numberGrade2) {
		// TODO Auto-generated method stub
		String letterGrade;
		
		if(numberGrade >= 90) {
			letterGrade = "A";
		}
		else if(numberGrade >= 80) {
			letterGrade = "B";
		}
		else if(numberGrade >= 70) {
			letterGrade = "C";
		}
		else if(numberGrade >= 60) {
			letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}
		System.out.println();
	}

}
