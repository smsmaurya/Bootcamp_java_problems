package com.bridgeLab.solution.bootCamp.day3;

public class StudentAnalyzer {
	
	public static double[] generateRandomMarks(int totalStudents) {
     
        double[] marksList = new double[totalStudents];
        for (int i = 0; i < totalStudents; i++) {
           
        	marksList[i] = (Math.floor(Math.random()*100))+1.0;
        }
        return marksList;
    }
	
	// calculate total percentage of passed student
	public static double calc_PassPercentage(double[] marksList) {
        int passedStudent = 0;
        double passingPercetage =0;
        for (double mark : marksList) {
            if (mark >= 45.0) {
                passedStudent++;
            }
        }
        passingPercetage = passedStudent * 100.0/ marksList.length ;
        return passingPercetage;
    }
	
	public static double calc_1stDiv_Percentage(double[] marksList) {
        int countStudent = 0;
        double paasingPercentage=0;
        for (double mark : marksList) {
            if (mark >= 60.0) {
                countStudent++;
            }
        }
        paasingPercentage = countStudent* 100.0 / marksList.length ;
        return paasingPercentage;
    }
	
	public static int countStudentsAbove90(double[] marksList) {
        int above90 = 0;
        for (double mark : marksList) {
            if (mark >= 90.0) {
                above90++;
            }
        }
        return above90;
    }
	
	public static double calcAvg_MarksOf_1stDiv(double[] marksList) {
		int countStudent = 0;
		double totalMarksOfstudent =0;
		double avgMarks=0;
		
		for(double mark : marksList) {
			if(mark >= 60) {
				countStudent++;
				totalMarksOfstudent += mark;
			}
		}
		avgMarks = totalMarksOfstudent/countStudent;
		
		return avgMarks;	
	}
	
	public static double calcAvg_MarksOf_2ndDiv(double[] marksList) {
		int countStudent = 0;
		double totalMarksOfstudent =0;
		double avgMarks=0;
		
		for(double mark : marksList) {
			if(mark>=40 && mark<=60) {
				countStudent++;
				totalMarksOfstudent += mark;
			}
		}
		avgMarks = totalMarksOfstudent/countStudent;
		
		return avgMarks;	
	}
	
	public static void splitStudentsInBoysNGirls(double[] marksList, int totalStudents) {
		//int totalStudents =marksList.length;
		double boysPercentage = 55/100;
        double girlsPercentage = 45/100;

        // Calculate the number of boys and girls based on percentages
        int totalBoys = (int) (totalStudents * boysPercentage);
        int totalGirls = totalStudents - totalBoys;

        // Split the marks into two arrays: boysMarks and girlsMarks
        double[] boysMarks = new double[totalBoys];
        double[] girlsMarks = new double[totalGirls];

        for (int i = 0, j = 0, k = 0; i < totalStudents; i++) {
            if (i < totalBoys) {
                boysMarks[j++] = marksList[i];
            } else {
                girlsMarks[k++] = marksList[i];
            }
        }
        
        System.out.println("----------------------------------------------------------------------------------------------");
        printPassingDetails(boysMarks);
        System.out.println("---------------------------------------------------------------------------------------");
        printPassingDetails(girlsMarks);
        
	}
	
	public static double avgMarks(double[] marksList) {
		double totalMarks =0;
		int totalStudents = marksList.length;
		double avgMarks =0;
		for(double mark : marksList) {
			totalMarks += mark;
		}
		avgMarks = totalMarks/totalStudents;
		return avgMarks;
	}
	
	public static void printPassingDetails(double[] marksList) {
		
		//double[] marks = generateRandomMarks(totalStudents);
		
		double calc_PassPercentage = calc_PassPercentage(marksList);
		System.out.println("Percentage of students who passed : "+calc_PassPercentage);
		
		double calc_1stDiv_Percentage = calc_1stDiv_Percentage(marksList);
		System.out.println("Percentage of student who passed with first division : "+calc_1stDiv_Percentage);
		
		int countStudentAbove90 = countStudentsAbove90(marksList);
		System.out.println("Total no. of students who scored 90 above marks : "+countStudentAbove90);
		
		double calcAvg_MarksOf_1stDiv = calcAvg_MarksOf_1stDiv(marksList);
		System.out.println("Average marks of first division students : "+calcAvg_MarksOf_1stDiv);
		
		double calcAvg_MarksOf_2ndDiv = calcAvg_MarksOf_2ndDiv(marksList);
		System.out.println("Average marks of second division students :"+calcAvg_MarksOf_2ndDiv);
		
		double avgMarks = avgMarks(marksList);
		System.out.println("Avg Marks :=> "+avgMarks);
		
	}

	public static void main(String[] args) {
		
		int totalStudents = 435;
		double bp =55, gp = 45;  //(bp: boys percentage)  or (gp : girls percentage)
		
		double[] marksList = generateRandomMarks(totalStudents);

        // Calculate the number of boys and girls based on percentages
        int totalBoys = (int) ((totalStudents * bp)/100);
        int totalGirls = totalStudents - totalBoys;

        // Split marks into boysMarksList and girlsMarksList
        double[] boysMarks = new double[totalBoys];
        double[] girlsMarks = new double[totalGirls];

        for (int i = 0, j = 0, k = 0; i < totalStudents; i++) {
            if (i < totalBoys) {
                boysMarks[j++] = marksList[i];
            } else {
                girlsMarks[k++] = marksList[i];
            }
        }

		
		//printPassingDetails(marksList);
		//System.out.println("---------------------------------------------------------------------------------------------");
		//splitStudentsInBoysNGirls(marksList, totalStudents);
		System.out.println("------------------------------All students passing details -------------------------");
		printPassingDetails(marksList);
		System.out.println();
		System.out.println("------------------------------All Boys passing details -------------------------");
		printPassingDetails(boysMarks);
		System.out.println();
		System.out.println("------------------------------All Girls passing details -------------------------");
		printPassingDetails(girlsMarks);
		System.out.println();
		double difference = avgMarks(boysMarks)-avgMarks(girlsMarks);
		System.out.println("Difference between girlsMarks and boysMarks : "+difference);
		
//		double calc_PassPercentage = calc_PassPercentage(marksList);
//		System.out.println("Percentage of students who passed : "+calc_PassPercentage);
//		
//		double calc_1stDiv_Percentage = calc_1stDiv_Percentage(marksList);
//		System.out.println("Percentage of student who passed with first division : "+calc_1stDiv_Percentage);
//		
//		int countStudentAbove90 = countStudentsAbove90(marksList);
//		System.out.println("Total no. of students who scored 90 above marks : "+countStudentAbove90);
//		
//		double calcAvg_MarksOf_1stDiv = calcAvg_MarksOf_1stDiv(marksList);
//		System.out.println("Average marks of first division students : "+calcAvg_MarksOf_1stDiv);
//		
//		double calcAvg_MarksOf_2ndDiv = calcAvg_MarksOf_2ndDiv(marksList);
//		System.out.println("Average marks of second division students :"+calcAvg_MarksOf_2ndDiv);
//		
//		System.out.println("-----------------------------------------------------------------------------------------------");
//		
//		
		
		
		
	}

}
