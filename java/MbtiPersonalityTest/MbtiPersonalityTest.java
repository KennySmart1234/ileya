import java.util.Scanner;

public class MbtiPersonalityTest{

    public static void personalityTesting(){
    
        Scanner inputCollector = new Scanner(System.in);
        
        String [] questions = {
            " A. Spend time with others"      ,      " B. Spend time alone",
            " A. Focus on facts"              ,      " B. Focus on ideas",
            " A. Make decisions with logic"   ,      " B. Make decisions with feelings",
            " A. Plan ahead"                  ,      " B. Be spontaneous",   
            " A. Enjoy group activities"      ,      " B. Enjoy quiet activities",
            " A. Prefer practical things"     ,      " B. Prefer imagination",
            " A. Value justice more"          ,      " B. Value mercy more",
            " A. Like schedules"              ,      " B. Like flexibility",
            " A. Talk more"                   ,      " B. Listen more",
            " A. Observe details"             ,      " B. See big picture",
            " A. Think with head"             ,      " B. Think with heart",
            " A. Finish tasks early"          ,      " B. Work under pressure",
            " A. Meet many people"            ,      " B. Meet few close friends",
            " A. Trust experience"            ,      " B. Trust intuition",
            " A. Honesty over emotions?"      ,      " B. Prefer emotions over honesty",
            " A. Keep things organized"       ,      " B. Keep options open",
            " A. Gain energy socially"        ,      " B. Gain energy privately",
            " A. Focus on reality"            ,      " B. Focus on possibilities",
            " A. Analyze situations"          ,      " B. Empathize with people",
            " A. Follow plans strictly"       ,      " B. Adapt easily"           
        
        
                            };

        
            System.out.print("What is your name: ");
            String userName = inputCollector.nextLine();
             

               String extroverVsIntroverted = "";
               String sensingVsIntuitive = "";
               String thinkingVsFeeling = "";
               String judingVsPerceptive = "";  
               
               int numberOfAInExtroverVsIntroverted = 0;
               int numberOfBInExtroverVsIntroverted = 0;
               
               int numberOfAInSensingVsIntuitive = 0;
               int numberOfBInSensingVsIntuitive = 0;
               
               int numberOfAInThinkingVsFeeling = 0;
               int numberOfBInThinkingVsFeeling = 0;
               
               int numberOfAInJudingVsPerceptive = 0;
               int numberOfBInJudingVsPerceptive = 0;
                
                
                                                                
                              
               
             for(int arrayCount = 0; arrayCount < 40; arrayCount += 2){

                System.out.println(arrayCount);
                System.out.println(questions[arrayCount] + " " + questions[arrayCount + 1]);
                System.out.println();
                
                System.out.print(" Enter your choice (A or B): ");
                String userResponse = inputCollector.nextLine();
                
                while(!userResponse.equalsIgnoreCase("A") && !userResponse.equalsIgnoreCase("B")){
                    System.out.println();
                    System.out.println(" Expected A or B as Response \nI know tis an error, please retry again");                
                    System.out.println();
                    System.out.println(questions[arrayCount] + " " + questions[arrayCount + 1]);
                    System.out.println();
                    System.out.print(" Enter your choice (A or B): ");
                    userResponse = inputCollector.nextLine();
                    
                    }

              if(arrayCount == 0 || arrayCount == 8 || arrayCount == 16 || arrayCount == 24 || arrayCount == 32){
                if(userResponse.equalsIgnoreCase("A")){
                    extroverVsIntroverted += questions[arrayCount] + "\n";
                    numberOfAInExtroverVsIntroverted ++;
                    }
                else if(userResponse.equalsIgnoreCase("B")){
                    extroverVsIntroverted += questions[arrayCount + 1] + " \n";
                    numberOfBInExtroverVsIntroverted ++;
                    }
              }
              
              else if(arrayCount == 2 || arrayCount == 10 || arrayCount == 18 || arrayCount == 26 || arrayCount == 34){
                if(userResponse.equalsIgnoreCase("A")){
                    sensingVsIntuitive += questions[arrayCount] + "\n";
                    numberOfAInSensingVsIntuitive ++;
                    }
                else if(userResponse.equalsIgnoreCase("B")){
                    sensingVsIntuitive += questions[arrayCount + 1] + "\n";
                    numberOfBInSensingVsIntuitive ++;
                    }
              }              

              else if(arrayCount == 4 || arrayCount == 12 || arrayCount == 20 || arrayCount == 28 || arrayCount == 36){
                if(userResponse.equalsIgnoreCase("A")){
                    thinkingVsFeeling += questions[arrayCount] + "\n";
                    numberOfAInThinkingVsFeeling ++;
                    }
                else if(userResponse.equalsIgnoreCase("B")){
                    thinkingVsFeeling += questions[arrayCount + 1] + " \n";
                    numberOfBInThinkingVsFeeling ++;
                    }
                    
              }                                                      

              else if(arrayCount == 6 || arrayCount == 14 || arrayCount == 22 || arrayCount == 30 || arrayCount == 38){
                if(userResponse.equalsIgnoreCase("A")){
                    judingVsPerceptive += questions[arrayCount] + "\n";
                    numberOfAInJudingVsPerceptive ++;
                    }
                else if(userResponse.equalsIgnoreCase("B")){
                    judingVsPerceptive += questions[arrayCount + 1] + "\n";
                    numberOfBInJudingVsPerceptive ++;
                    }
              }

              
        }
        
        int totalOfA = numberOfAInExtroverVsIntroverted + 
                       numberOfAInSensingVsIntuitive + 
                       numberOfAInThinkingVsFeeling + 
                       numberOfAInJudingVsPerceptive;
                       
        int totalOfB = numberOfBInExtroverVsIntroverted + 
                       numberOfBInSensingVsIntuitive + 
                       numberOfBInThinkingVsFeeling + 
                       numberOfBInJudingVsPerceptive;  
                      
         
         System.out.println();
         System.out.printf("Hello %s you selected\n", userName);
         System.out.print(extroverVsIntroverted);
         System.out.println(" Number of A Selected: " + numberOfAInExtroverVsIntroverted); 
         System.out.println(" Number of B Selected: " + numberOfBInExtroverVsIntroverted);
          
         System.out.println(); 
         System.out.print(sensingVsIntuitive);
         System.out.println(" Number of A Selected: " + numberOfAInSensingVsIntuitive);
         System.out.println(" Number of B Selected: " + numberOfBInSensingVsIntuitive); 
         
         System.out.println();
         System.out.print(thinkingVsFeeling);
         System.out.println(" Number of A Selected: " + numberOfAInThinkingVsFeeling); 
         System.out.println(" Number of B Selected: " + numberOfBInThinkingVsFeeling);
         
         System.out.println();
         System.out.print(judingVsPerceptive); 
         System.out.println(" Number of A Selected: " + numberOfAInJudingVsPerceptive);
         System.out.println(" Number of B Selected: " + numberOfBInJudingVsPerceptive); 
                 
 

    String iNFPPersonaliy = """
                                INFP Personality Type: The Idealist

                                INFP stands for Introverted, Intuitive, Feeling, and Perceiving. People 
                                with this personality type are often  called The Idealists because they 
                                are guided by their values, imagination, and desire to make the world a better place.

                                Key Characteristics

                                INFPs are thoughtful and reflective individuals who enjoy spending time alone. 
                                They are highly creative and often express themselves through writing, art, 
                                music, or other forms of creativity. Rather than focusing on facts and details,
                                they prefer to explore ideas, possibilities, and deeper meanings.""";


                 
                    
 
                    

    String eSTJPersonaliy = """ 
                                ESTJ Personality Type: The Executive

                                ESTJ stands for Extroverted, Sensing, Thinking, and Judging. 
                                People with this personality type are often called The Executives
                                because they are practical, organized, and skilled at leading others.

                                Key Characteristics

                                ESTJs are energetic and action-oriented individuals who enjoy structure 
                                and order. They focus on facts, logic, and efficiency when making decisions. 
                                They are confident in their abilities and often take charge of situations to 
                                ensure that goals are achieved.

                                They value responsibility, tradition, and hard work. Because of their strong 
                                organizational skills, they are often trusted to manage projects, teams, 
                                and important responsibilities.""";
 
if(totalOfB > totalOfA) 
  
          System.out.println(iNFPPersonaliy); 

    
else if(totalOfA > totalOfB)                     
 
        System.out.println(eSTJPersonaliy);                 
    
}
public static void main(String... args){


personalityTesting();

    }


} 
