import java.util.Arrays;
import java.util.Scanner;



public class SpecialTask {

           
    public static void main(String... args) {

        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter number of Student: ");
        int numberOfStudent = inputCollector.nextInt();
        
        System.out.print("Enter number of quizzes: ");
        int numberOfQuiz = inputCollector.nextInt();
        
        
        
            int [][] studentScores = new int [numberOfStudent][numberOfQuiz];
                
                    for(int coloum = 0; coloum < numberOfStudent; coloum++){
                        
                        System.out.println("    Student     " +( coloum + 1));
                        for(int row = 0; row < numberOfQuiz; row++){
                        
                        System.out.printf("Score for the Quiz %d: ", (row + 1));
                        studentScores[coloum][row] = inputCollector.nextInt();


                    }
                }
                
                String qZ = "QZ";
                System.out.println("============QUIZ GRADE REPORT==============");
                    
                    System.out.print("STUDENT\t");
                for(int count = 0; count < numberOfQuiz; count++){
                    System.out.printf("\t%s%d", qZ, (count+1));
                    }
                    
                    System.out.print("\tAVG");
                    
                for(int coloum = 0; coloum < numberOfStudent; coloum++){
                
                       double sumOfScore = 0;
                       System.out.println(); 
                       System.out.print("Student " + (coloum + 1));
                       
                    for(int row = 0; row < numberOfQuiz; row++){
                    
                        sumOfScore += studentScores[coloum][row];
                        System.out.print("\t" + (studentScores[coloum][row]));

                        }
                
                        System.out.print("\t" + (sumOfScore / numberOfQuiz));
                
                        System.out.println();
                        
                      }            
                
                    System.out.println();
                    System.out.printf("Quiz Averages: ");
                    String Quiz = "QZ";
                    double bestQuiz = 0;
                for(int coloum = 0; coloum < numberOfQuiz; coloum++){
                    
                        double quizAverages = 0;
                        
                    for(int row = 0; row < numberOfStudent; row++){
                    
                       quizAverages += studentScores[row][coloum];   
                        
                        if((quizAverages / numberOfStudent) > bestQuiz)
                            bestQuiz = (quizAverages / numberOfStudent);
                        }
                        System.out.printf("%s%d  %.2f  ", Quiz,(coloum+1), (quizAverages/numberOfStudent));
                        

                
                    }
                    
                    System.out.println();
                    System.out.println("Best quiz: " + bestQuiz);
                
            
            


    }           
            
}         
