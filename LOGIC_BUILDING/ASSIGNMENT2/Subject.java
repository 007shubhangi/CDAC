/*
//Write a program that determines whether a student passes or fails based on their grades in three
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or
more subjects, print the number of subjects they failed in.
*/

class Subject{
	public static void main(String args[])
	{
	 int s1=45,s2=20,s3=50;
     int count=0;
     if(s1>40)
        count++;
	
     if(s2>40)
		count++	;
	 
	 if(s3>40)
		count++;
	if(count==3)
		System.out.println("Pass in all subjects");
	
	else if(count==2)
		System.out.println("Fail in one subjects");
	
    else if(count==1)
		System.out.println("Fail in two subjects");
	
	else
		System.out.println("Fail in all subjects");

		
	}
	
}