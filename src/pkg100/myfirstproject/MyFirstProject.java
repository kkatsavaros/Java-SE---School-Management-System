package pkg100.myfirstproject;

import java.util.Scanner;

public class MyFirstProject {
    
    public static void main(String[] args) {  
       
        int choiceOfTheUser;
        boolean answer=true;
        
        Scanner inputUser=new Scanner(System.in);        
        
        OUTER:
        do {
            System.out.println("\nΑν θέλεις εισαγωγή δεδομένων από Synthetic Data πάτησε το 1.");            
            System.out.println("\nΑν θέλεις εισαγωγή δεδομένων από τον χρήστη πάτησε το 2.");
            choiceOfTheUser=inputUser.nextInt();
           
            switch (choiceOfTheUser) {
                case 1:
                    System.out.println("Πάτησες το 1");
                    answer=true;            
                    
                    //
                    choiceOfUserSyntheticData.UserHasButton1Pressed();
                    
                    break OUTER;
                case 2:
                    System.out.println("Πάτησες το 2");
                    answer=true;
                    
                    //
                    choiceOfUserManualData.UserHasButton2Pressed();
                    
                    
                    break OUTER;
                default:
                    answer=false;
                    break;
            }
            
        } while (answer==false);
        
        
        
        
        // Ερώτηση 5:
       System.out.println("\n\n Απάντηση Ερώτησης 5 - Students per Course: ");        
       zStudentsPerCourse.StudentsPerCourse();
       
       
       // Ερώτηση 6:
       System.out.println("\n\n Απάντηση Ερώτησης 6 - Trainers per Course: ");
       zTrainersPerCourse.TrainersPerCourse();
       
       
       // Ερώτηση 7:
       System.out.println("\n\n Απάντηση Ερώτησης 7 - Assignments per Course: ");
       zAssignmentsPerCourse.AssignmentsPerCourse();
       
       
       // Ερώτηση 8:       
       System.out.println("\n\n Απάντηση Ερώτησης 8 - Assignments per Student: ************ I love Maps ********\n");
       zAssignmentsPerStudent.AssignmentsPerStudent();
       
       
       // Ερώτηση 9:       
       System.out.println("\n\n Απάντηση Ερώτησης 9 - Λίστα Μαθητών που είναι σε περισσότερα από 1 courses: ");
       zAssignmentsPerStudent.StudentsWithMoreThanOneCourses();
       
       
        
    }    
}
