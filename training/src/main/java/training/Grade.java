package training;

public class Grade {
		
		public static char CalcGrade(int marks) 
		{
		if(marks>=80 && marks<=100)
		{
			return 'A';
		}
		else if(marks>=60 && marks<80)
		{
			return 'B';
		}
		else if(marks>=50 && marks<60)
		{
			return 'C';
		}
		else
		{
			return 'F';
		}
		

	}

}
