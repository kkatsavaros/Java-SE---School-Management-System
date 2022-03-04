package pkg100.myfirstproject;

// Ο χρήστης επέλεξε να εισάγει Synthetic Data.
public class choiceOfUserSyntheticData {    
    
    public static void UserHasButton1Pressed(){
        
       //Εισαγωγή SyntheticData.
       Synthetic.SyntheticData();
       
       
       
       //Εμφάνιση όλων των courses.
       AllData.showAllCourses();       
       
       // Εμφάνιση όλων των Trainers.
       AllData.showAllTrainers();       
       
       // Εμφάνιση όλων των Trainers.
       AllData.showAllStudents();     
       
       
       // Εμφάνιση όλων των Assignments. 
       AllData.showAllAssignments();  
       
       
       
       
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
