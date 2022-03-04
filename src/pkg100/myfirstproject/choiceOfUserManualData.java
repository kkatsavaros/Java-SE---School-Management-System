package pkg100.myfirstproject;

// Ο χρήστης επέλεξε να εισάγει Manual Data.
public class choiceOfUserManualData {
    
    
    public static void UserHasButton2Pressed(){
        
       //1.Course --------------------------------------------------------------------- 
       //Εισαγωγή Courses από τον χρήστη.
       Course.AddCoursesFromUserInput(); // κλάση.μέθοδος
       
       //Εμφάνιση όλων των courses.
       AllData.showAllCourses();   
       
        
       
       //2. Trainer --------------------------------------------------------------------- 
       //Εισαγωγή Trainers από τον χρήστη.
       Trainer.AddTrainersFromUserInput();  //κλάση.μέθοδος.
       
       // Εμφάνιση όλων των Trainers.
       AllData.showAllTrainers();   
       
       
       //3. Student --------------------------------------------------------------------- 
       //Εισαγωγή Student από τον χρήστη.
       Student.AddStudentsFromUserInput();  //κλάση.μέθοδος.
       
       // Εμφάνιση όλων των Trainers.
       AllData.showAllStudents();     
       
       
       
       //4. Assignments --------------------------------------------------------------------- 
       //Εισαγωγή Assignments από τον χρήστη.
       Assignment.AddAssignmentsFromUserInput();  //κλάση.μέθοδος.
       
       // Εμφάνιση όλων των Trainers.
       AllData.showAllAssignments(); 
    
    }
    
}