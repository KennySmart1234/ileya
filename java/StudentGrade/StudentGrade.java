import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade{

    static Scanner inputCollector = new Scanner(System.in);    
    

    
    public static int[][] getSubjectsScoresForEachStudent(int students, int subjects){
    
        
        int [][] studentScores = new int [students][subjects];
        System.out.println(" Saving >>>>>>>>>>>>>>>>>>>>>>>\n Saved successfully\n");
        for(int student = 0; student < students; student++){
        
            System.out.printf(" Enter score for student %d ", (student+1));
            System.out.println();
            for(int subject = 0; subject < subjects; subject++){
                
                System.out.printf(" Enter score for subject %d%n ", (subject+1));
                
                int score = inputCollector.nextInt();
                
                while(score < 0 || score > 100){
                    System.out.printf(" Invalid Input %n ");
                    System.out.println();
                    System.out.printf(" Enter score for subject %d%n ", (subject+1));
                    score = inputCollector.nextInt();
                
                }
              
                studentScores[student][subject] = score;
                System.out.println(" Saving >>>>>>>>>>>>>>>>>>>>>>\n Saved successfully");
                System.out.println("\n");

            }   
        
        }
        
        
        return studentScores;
    
    }          
    
    public static int[] getSumOfEachStudentScores(int [][] studentsScores, int students, int subjects){
    

        int [] studentTotalScore = new int [students];
        
        System.out.println("=============================================================");
        System.out.print("STUDENT\t");
        for(int subject = 0; subject < subjects; subject++){
            System.out.printf("\tSUB%d", (subject+1));
        
        }
        
        System.out.println("\tTOT\tAVG\tPOS");
        System.out.println("=============================================================");
        for(int student = 0; student < students; student++){
            int sumOfScores = 0;
            
            
            System.out.printf("Student %d\t" , (student+1) );
            for(int score = 0; score < subjects; score++){
            
                sumOfScores += studentsScores[student][score];
                
                System.out.print(studentsScores[student][score] + "\t");
            
            }
                studentTotalScore[student] = sumOfScores;
                System.out.print(sumOfScores + "\t");
                double scoreAverage = sumOfScores/subjects;
                System.out.printf("%.2f", scoreAverage);
                System.out.println();
        
        }
  
        return studentTotalScore;
     }   
        
    public static void getSubjectSummary(int[][] studentsScores, int students, int subjects){
    

        for(int subject = 0; subject < subjects; subject++){
           
            int totalScore = 0;
            
            int numberOfPasses = 0;
            int numberOfFails = 0;
            
            int bestStudent = 0;
            int worstStudent = 0;
 
            
            int highestScore = studentsScores[0][subject];
            int lowestScore = studentsScores[0][subject];
           
            
            for(int student = 0; student < students; student++){
            
                   if(studentsScores[student][subject] > highestScore){
                        highestScore = studentsScores[student][subject];
                       
                    }   
                     
                   if(studentsScores[student][subject] < lowestScore){
                        lowestScore = studentsScores[student][subject]; 
                                                                   
                   } 
                   
                   totalScore += studentsScores[student][subject];          
                    
                   if(studentsScores[student][subject] >= 50){
                    numberOfPasses++;
                   
                   } 
                   
                   else{
                    numberOfFails++;
                   
                   } 
                   
  
            }
            
            double scoreAverage =  (double) totalScore / students;
            System.out.println();
            System.out.printf("Subject %d%n", (subject + 1));
                
                System.out.printf(" Highest scoring student is: student %d scoring %d%n ", subject, highestScore);
                System.out.printf("Lowest scoring student is: student %d scoring %d%n ", (subject+1), lowestScore);
                System.out.printf("Total Score is: %d%n ", totalScore);
                System.out.printf("Average Score is: %.2f%n ", scoreAverage);
                System.out.printf("Number of passess: %d%n ", numberOfPasses);
                System.out.printf("Number of fails: %d%n ", numberOfFails);
    
        }
        
   }     

    public static void getClassSummary(int [][] studentsScores, int []studentTotalScore, int students, int subjects){
        
        
            int bestStudent = studentTotalScore[0];
            int worstStudent = studentTotalScore[0];
            int classTotalScore = 0;
            
            
        for(int student = 0; student < students; student++){
            if(studentTotalScore[student] > bestStudent){
                bestStudent = studentTotalScore[student];
            }
            
            if(studentTotalScore[student] < worstStudent){
                worstStudent = studentTotalScore[student];
            }
            
            classTotalScore += studentTotalScore[student];  
            
        }
        
        
        

            int overallHighestScore = studentsScores[0][0];
            int overallLowestScore = studentsScores[0][0];

        for(int subject = 0; subject < subjects; subject++){
           
//                int passes = 0;
//                int failures = 0;
            for(int student = 0; student < students; student++){
            
                if(studentsScores[student][subject] > overallHighestScore){
                    overallHighestScore = studentsScores[student][subject];
                    }
            
                if(studentsScores[student][subject] < overallLowestScore){
                overallLowestScore = studentsScores[student][subject];
            
                }
//                if(studentsScores[student][subject] >= 50){
//                    
//                    passes++;
//
//                }
//                else{
//                    failures++
//                }
                
            
            }
        
       }
        
        
        double classAverage = (double)(classTotalScore / students );
            System.out.println();
            System.out.println();     
                   
//        System.out.println("The hardest subject is with failures");
//        System.out.println("The easiest subject is with passes");       
        System.out.printf("The overall Higest score is scored by student in subject scoring %d%n", overallHighestScore); 
        System.out.printf("The overall lowest score is scored by student in subject scoring %d%n", overallLowestScore);
        System.out.println("================================================");            
        System.out.println("CLASS SUMMARY");                
        System.out.println("================================================");      
        System.out.printf("Best Graduating student is: Student scoring %d%n", bestStudent);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");   
        System.out.printf("worst Graduating student is: Student scoring %d%n", worstStudent);  
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");   

        System.out.println("================================================");            
        System.out.printf("Class total score is: %d%n ", classTotalScore); 
        System.out.printf("Class Average score is : %.2f%n ", classAverage);                
        System.out.println("================================================"); 

    }      
        
     
        


public static void main(String... args){
        
        
        System.out.print("How many students do you have? ");
        int students = inputCollector.nextInt();
        
        System.out.print("How many subject do you offer? ");
        int subjects = inputCollector.nextInt();
        




int [][] studentsScores = getSubjectsScoresForEachStudent(students, subjects);
int [] studentTotalScore = getSumOfEachStudentScores(studentsScores, students, subjects);

getSubjectSummary(studentsScores, students, subjects);

getClassSummary(studentsScores, studentTotalScore, students, subjects);

    } 

}






















