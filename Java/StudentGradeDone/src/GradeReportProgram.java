

import java.io.*;
import java.util.*;

public class GradeReportProgram
{
    static final int maxNumberOfStudents = 10;

    public static void main(String[] args) throws IOException,
                                           FileNotFoundException
    {
	    Student[] studentList = new Student[maxNumberOfStudents];

	    int noOfStudents;
	    double tuitionRate;
	    StringTokenizer tokenizer;

        BufferedReader infile =
                new BufferedReader(new FileReader("stData.txt"));
        PrintWriter outfile =
                new PrintWriter(new FileWriter("sDataOut.txt"));

        for(int i = 0; i < maxNumberOfStudents; i++)
           studentList[i] = new Student();


	    tokenizer = new StringTokenizer(infile.readLine());
        noOfStudents =
            Integer.parseInt(tokenizer.nextToken());   	//get the number of students
        tuitionRate =
            Double.parseDouble(tokenizer.nextToken());		//get the tuition rate

	    getStudentData(infile, studentList, noOfStudents);
	    printGradeReports(outfile, studentList,
  		                  noOfStudents, tuitionRate);

        outfile.close();
    }

    public static void getStudentData(BufferedReader infile,
			              Student[] sList,
			              int numberOfStudents)  throws IOException
	{
		  	//Local variable
	    String fName;	    //variable to store the first name
	    String lName;	    //variable to store the last name
	    int ID;		        //variable to store the student ID
	    int noOfCourses;   //variable to store the number of courses
	    char isPaid;	    //variable to store Y/N; that is,
	                          //is tuition paid?
	    boolean isTuitionPaid;	//variable to store true/false

	    String cName;	//variable to store the course name
	    String cNo;	//variable to store the course number
	    int credits;	//variable to store the course credit hours
	    char grade;	//variable to store the course grade

	    int count;	//loop control variable
	    int i;		//loop control variable

	    Course[] courses = new Course[6]; //array of objects to
	                                      //store course information
	    StringTokenizer tokenizer;

	    for(i = 0; i < 6; i++)
	        courses[i] = new Course();

	    for(count = 0; count < numberOfStudents; count++)
	    {
		         	//Step 1
	        tokenizer = new StringTokenizer(infile.readLine());
	   		fName = tokenizer.nextToken();
	        lName = tokenizer.nextToken();
	        ID = Integer.parseInt(tokenizer.nextToken());
	        isPaid = tokenizer.nextToken().charAt(0);

	        if(isPaid == 'Y')			  	     			//Step 2
		       isTuitionPaid = true;
		  	else
		       isTuitionPaid = false;

		  	noOfCourses =
	            Integer.parseInt(tokenizer.nextToken());	//Step 3

		  	for(i = 0; i < noOfCourses; i++)				//Step 4
		  	{
		      	tokenizer = new StringTokenizer(infile.readLine());
	            cName = tokenizer.nextToken();
	            cNo = tokenizer.nextToken();
	            credits =
	                 Integer.parseInt(tokenizer.nextToken());
	            grade = tokenizer.nextToken().charAt(0);	//Step 4.a

		        courses[i].setCourseInfo(cName, cNo,
	                                grade, credits);		//Step 4.b
	        }

		  	sList[count].setInfo(fName, lName, ID,
		                             noOfCourses, isTuitionPaid,
	   	                             courses);           	//Step 5
	  	}//end for
	}


    public static void printGradeReports(PrintWriter outfile,
                                         Student[] sList,
			                             int numberOfStudents,
     	   		                         double tuitionRate)
    {
        int count;

        for(count = 0; count < numberOfStudents; count++)
	          sList[count].print(outfile,tuitionRate);
    }
}
