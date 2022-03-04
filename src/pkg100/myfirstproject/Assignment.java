package pkg100.myfirstproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment {
    
    private String titleAssignment;
    private String description;
    private String subDateTime;
    private int oralMark;
    private int writeMark;    
    private int totalMark;    
    
    Course course;  // Association
     
    //Array List όπου κρατάω όλα τα Trainers σε αντικείμενα.    
    public static ArrayList<Assignment> allAssignments = new ArrayList<Assignment>();//ok
    
    
    //------------------------------------------------------------------------------------------------------ 

   
    public static ArrayList AddAssignmentsFromUserInput(){   
      
        
        String answer;
        answer="";
        
        Scanner input = new Scanner(System.in);
        
        String titleAssignment;
        String description;
        String SubDateTime;
        int oralMark;
        int writeMark;
        int totalMark;
        String assignmentCourse;
        
        
        
        System.out.println("Εισαγωγή στοιχείων Assignment: ");
        
do{ // Αυτό είναι του "}while(answer.equalsIgnoreCase("YES"));"
        
        //1. Εισαγωγή τίτλου Assignemnt:   
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης δεν πληκτρολόγησε τίποτα χρησιμοποιώντας την μέθοδο CheckIfItIsEmpty της κλάσης CheckUserInputs.
        boolean checkEmpty1=false;       
        do{
            
            System.out.println("\n1. Εισαγωγή τίτλου Assignemnt: ");         
            titleAssignment=input.nextLine();  
            
            checkEmpty1=CheckUserInputs.CheckIfItIsEmpty(titleAssignment);  // Εδώ γίνεται ο έλεγχος.
            //System.out.println(checkEmpty1);
            
            if(checkEmpty1==false){
                System.out.println("Το πεδίο είναι άδειο.");
            }
        }
        while(checkEmpty1==false);
        //------------------------------------------------------------------------------------------------------------------
        
        
        //2. Εισαγωγή description Assignment:
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης δεν πληκτρολόγησε τίποτα χρησιμοποιώντας την μέθοδο CheckIfItIsEmpty της κλάσης CheckUserInputs.
        boolean checkEmpty2=false;       
        do{
            
            System.out.println("\n2. Εισαγωγή description Assignment: "); 
            description=input.nextLine();
            
            checkEmpty2=CheckUserInputs.CheckIfItIsEmpty(description);  // Εδώ γίνεται ο έλεγχος.
            //System.out.println(checkEmpty2);
            
            if(checkEmpty2==false){
                System.out.println("Το πεδίο είναι άδειο.");
            }
        }
        while(checkEmpty2==false);
        //------------------------------------------------------------------------------------------------------------------
        
        
        
        //3. Εισαγωγή Ημερομηνίας Υποβολής Assignment.
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης δεν πληκτρολόγησε τίποτα χρησιμοποιώντας την μέθοδο CheckIfItIsEmpty της κλάσης CheckUserInputs.
        // Ελέγχω αν ο χρήστης πληκτρολόγησε μόνο FULL ή PART χρησιμοποιώντας την μέθοδο CheckFullPart της κλάσης CheckUserInputs.
        boolean checkEmpty3=false;
        boolean a2=false;       
        do{
            
            System.out.println("\n4. Εισαγωγή Ημερομηνίας Υποβολής Assignment: DD/MM/YYYY: "); 
            SubDateTime=input.nextLine();
            
            // Ελεγχος αν ο χρήστης πληκτρολόγησε κάτι.
            checkEmpty3=CheckUserInputs.CheckIfItIsEmpty(SubDateTime);
            //System.out.println(checkEmpty4);
            
//            if(checkEmpty4==false  && a2==true){
//                System.out.println("Το πεδίο είναι άδειο.");
//            }   
            

            // Ελεγχος αν ο χρήστης πληκτρολόγησε σωστά την ημερομηνία.
            a2=CheckUserInputs.CheckStartDate(SubDateTime);  
            //System.out.println(a2);
            
            if(a2==false){
                System.out.println("Οχι σωστός τύπος ημερομηνίας.");
            } 
        }
        while(a2==false);
        //------------------------------------------------------------------------------------------------------------------ 
        
        
        //4. Εισαγωγή Oral Mark:   
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης δεν πληκτρολόγησε τίποτα χρησιμοποιώντας την μέθοδο CheckIfItIsEmpty της κλάσης CheckUserInputs.
        boolean checkEmptyOralMark=false;       
        do{
            
            System.out.println("\n1. Εισαγωγή oralMark: ");         
            oralMark=input.nextInt();
            
            //checkEmptyDate=CheckUserInputs.CheckIfItIsEmpty(studentTuitionFees);  // Εδώ γίνεται ο έλεγχος.
            //System.out.println(checkEmpty1);
            
//            if(checkEmpty1==false){
//                System.out.println("Το πεδίο είναι άδειο.");
//            }
            
            checkEmptyOralMark=true;

        }
        while(checkEmptyOralMark==false);
        //------------------------------------------------------------------------------------------------------------------
        
        
         //5. Εισαγωγή Write Mark:   
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης δεν πληκτρολόγησε τίποτα χρησιμοποιώντας την μέθοδο CheckIfItIsEmpty της κλάσης CheckUserInputs.
        boolean checkEmptyWriteMark=false;       
        do{
            
            System.out.println("\n1. Εισαγωγή Write Mark: ");         
            writeMark=input.nextInt();
            
            //checkEmptyDate=CheckUserInputs.CheckIfItIsEmpty(studentTuitionFees);  // Εδώ γίνεται ο έλεγχος.
            //System.out.println(checkEmpty1);
            
//            if(checkEmpty1==false){
//                System.out.println("Το πεδίο είναι άδειο.");
//            }
            
            checkEmptyWriteMark=true;

        }
        while(checkEmptyWriteMark==false);
        //------------------------------------------------------------------------------------------------------------------
        
        
        
        //6. Εισαγωγή Total Mark:   
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης δεν πληκτρολόγησε τίποτα χρησιμοποιώντας την μέθοδο CheckIfItIsEmpty της κλάσης CheckUserInputs.
        boolean checkEmptyTotalMark=false;       
        do{
            
            System.out.println("\n1. Εισαγωγή Total Mark: ");         
            totalMark=input.nextInt();
            
            //checkEmptyDate=CheckUserInputs.CheckIfItIsEmpty(studentTuitionFees);  // Εδώ γίνεται ο έλεγχος.
            //System.out.println(checkEmpty1);
            
//            if(checkEmpty1==false){
//                System.out.println("Το πεδίο είναι άδειο.");
//            }
            
            checkEmptyTotalMark=true;

         }
        while(checkEmptyTotalMark==false);
        //------------------------------------------------------------------------------------------------------------------
        
        
        
        //7. Εισαγωγή Course του Assignemnt:   
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης δεν πληκτρολόγησε τίποτα χρησιμοποιώντας την μέθοδο CheckIfItIsEmpty της κλάσης CheckUserInputs.
        boolean checkEmptyCourse=false;       
        do{ 
            
            ArrayList<String> tempListOfTitles = new ArrayList<>();
            for(int k=0;k<=Course.allCourses.size()-1;k++){                
                tempListOfTitles.add(Course.allCourses.get(k).getTitle());
            }
            
            System.out.println("\n1. Εισαγωγή Course του Assignment: ");         
            assignmentCourse=input.next();
  
            
            
            //Αν ο πίνακας περιέχει αυτό που έγραψε ο χρήστης.
            boolean ans = tempListOfTitles.contains(assignmentCourse);  
            if(ans) { // Αν true,
            // βρες το index
            int indexOfTheElement=tempListOfTitles.indexOf(assignmentCourse);             
            
            Assignment ass=new Assignment(titleAssignment,description,SubDateTime,oralMark,writeMark,totalMark,Course.allCourses.get(indexOfTheElement));        
            
            allAssignments.add(ass);
            
            
            
            checkEmptyCourse=true; //βγες από την do while την μεγάλη.
            
            
            
            
            
            
                }else{
            // Αν δεν υπάρχει κάνε ξανά βόλτα στην μικρή do και ξαναρώτα.
                System.out.println("Δεν υπάρχει...");     
            checkEmptyCourse=false;
            }
            
  
            
            //checkEmptyCourse=true;

         }
        while(checkEmptyCourse==false);
        //------------------------------------------------------------------------------------------------------------------
        
    
    
    
    
        
        
        
        
        
        
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης πληκτρολόγησε μόνο YES ή ΝO χρησιμοποιώντας την μέθοδο CheckYesNo της κλάσης CheckUserInputs.
        boolean a=false;       
        do{
            System.out.println("\n Θέλεις να Εισάγεις άλλο Assignment; YES/NO :");
            answer=input.next();
            
            // Εδώ γίνεται ο έλεγχος. Αν πατήσει YES ή Νο θα επιστρέψει true άρα θα βγει και θα πάει παρακάτω.
            // Αν πατήσει κάτι άλλο θα επιστρέψει false. 
            a=CheckUserInputs.CheckYesNo(answer);  
            //System.out.println(a);
        }
        while(a==false);// για όσο είνα false κάνε loop
        //------------------------------------------------------------------------------------------------------------------
        
       
        
}while(answer.equalsIgnoreCase("YES"));
        
//System.out.println(Course.allCourses.get(0).getTitle()); // Δουλεύει. ok            
        
        
        
        
        
        return allAssignments;
    }    
    
    
    
    
    //Constructor
    public Assignment(String titleAssignment, String description, String subDateTime, int oralMark, int writeMark, int totalMark, Course course) {
        this.titleAssignment = titleAssignment;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
        this.writeMark = writeMark;
        this.totalMark = totalMark;
        this.course = course;
    }
   
    
    //Getters, Setters
    public String getTitleAssignment() {
        return titleAssignment;
    }

    public void setTitleAssignment(String titleAssignment) {
        this.titleAssignment = titleAssignment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(String subDateTime) {
        this.subDateTime = subDateTime;
    }

    public int getOralMark() {
        return oralMark;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    public int getWriteMark() {
        return writeMark;
    }

    public void setWriteMark(int writeMark) {
        this.writeMark = writeMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public static ArrayList<Assignment> getAllAssignments() {
        return allAssignments;
    }

    public static void setAllAssignments(ArrayList<Assignment> allAssignments) {
        Assignment.allAssignments = allAssignments;
    }
    
    
   
    
    
}
