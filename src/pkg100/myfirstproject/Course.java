package pkg100.myfirstproject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Course{    
    String title;
    String stream;
    String type;
    String start_date;
    String end_date;   
    
    //Array List όπου κρατάω όλα τα courses σε αντικείμενα.
    public static ArrayList<Course> allCourses = new ArrayList<Course>();//ok   
    
    
    
    //------------------------------------------------------------------------------------------------------ 
    // Δημιουργώ αυτήν την μέθοδο για είσοδο στοιχείων για ένα course.
    public static ArrayList AddCoursesFromUserInput(){    
     
        String answer;
        answer="";
        
        Scanner input = new Scanner(System.in);
        
        String courseTitle;
        String courseStream;
        String courseType;
        String courseStartDate;
        String courseEndDate; 
        
        Trainer trainer;
        String courseInsertTrainer;
        
        
        System.out.println("Εισαγωγή στοιχείων ενός course: ");
        
        
        do{ // Αυτό είναι του YES/NO
        
        //1.    
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης δεν πληκτρολόγησε τίποτα χρησιμοποιώντας την μέθοδο CheckIfItIsEmpty της κλάσης CheckUserInputs.
        boolean checkEmpty1=false;       
        do{
            
            System.out.println("\n1. Εισαγωγή Τίλου Mαθήματος (title): ");         
            courseTitle=input.nextLine();  
            
            checkEmpty1=CheckUserInputs.CheckIfItIsEmpty(courseTitle);  // Εδώ γίνεται ο έλεγχος.
            //System.out.println(checkEmpty1);
            
            // Ελεγχος αν ο χρήστης πληκτρολόγησε κάτι.
            if(checkEmpty1==false){
                System.out.println("Το πεδίο είναι άδειο.");
            }
        }
        while(checkEmpty1==false);
        //------------------------------------------------------------------------------------------------------------------
        
        //2.
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης δεν πληκτρολόγησε τίποτα χρησιμοποιώντας την μέθοδο CheckIfItIsEmpty της κλάσης CheckUserInputs.
        boolean checkEmpty2=false;       
        do{
            
            System.out.println("\n2. Εισαγωγή ονόματος Μαθήματος (stream): "); 
            courseStream=input.nextLine();
            
            // Ελεγχος αν ο χρήστης πληκτρολόγησε κάτι.
            checkEmpty2=CheckUserInputs.CheckIfItIsEmpty(courseStream);  
            //System.out.println(checkEmpty2);
            
            if(checkEmpty2==false){
                System.out.println("Το πεδίο είναι άδειο.");
            }
        }
        while(checkEmpty2==false);
        //------------------------------------------------------------------------------------------------------------------
        
        //3.
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης δεν πληκτρολόγησε τίποτα χρησιμοποιώντας την μέθοδο CheckIfItIsEmpty της κλάσης CheckUserInputs.
        // Ελέγχω αν ο χρήστης πληκτρολόγησε μόνο FULL ή PART χρησιμοποιώντας την μέθοδο CheckFullPart της κλάσης CheckUserInputs.
        
        boolean checkEmpty3=false;
        boolean a1=false;       
        do{
            
            System.out.println("\n3. Εισαγωγή Τύπου Μαθήματος(type) \"FULL\" για Full Time ή \"PART\" για Part Time: FULL/PART.."); 
            courseType=input.nextLine();
            
            // Ελεγχος αν ο χρήστης πληκτρολόγησε κάτι.
            checkEmpty3=CheckUserInputs.CheckIfItIsEmpty(courseType);  
            //System.out.println(checkEmpty3);
            
            if(checkEmpty3==false){
                System.out.println("Το πεδίο είναι άδειο.");
            }           
            
            
            // Ελεγχος αν ο χρήστης πληκτρολόγησε σωστά την ημερομηνία.
            a1=CheckUserInputs.CheckFullPart(courseType);  
            //System.out.println(a1);
        }
        while(a1==false);
        //------------------------------------------------------------------------------------------------------------------
       
        //4.
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης δεν πληκτρολόγησε τίποτα χρησιμοποιώντας την μέθοδο CheckIfItIsEmpty της κλάσης CheckUserInputs.
        // Ελέγχω αν ο χρήστης πληκτρολόγησε μόνο FULL ή PART χρησιμοποιώντας την μέθοδο CheckFullPart της κλάσης CheckUserInputs.
        boolean checkEmpty4=false;
        boolean a2=false;       
        do{
            
            System.out.println("\n4. Εισαγωγή Ημερομηνίας έναρξης του Μαθήματος σε μορφή: DD/MM/YYYY: "); 
            courseStartDate=input.nextLine();
            
            // Ελεγχος αν ο χρήστης πληκτρολόγησε κάτι.
            checkEmpty4=CheckUserInputs.CheckIfItIsEmpty(courseStartDate);  
            //System.out.println(checkEmpty4);
            
//            if(checkEmpty4==false  && a2==true){
//                System.out.println("Το πεδίο είναι άδειο.");
//            }   
            

            // Ελεγχος αν ο χρήστης πληκτρολόγησε σωστά την ημερομηνία.
            a2=CheckUserInputs.CheckStartDate(courseStartDate);  
            //System.out.println(a2);
            
            if(a2==false){
                System.out.println("Οχι σωστός τύπος ημερομηνίας.");
            } 
        }
        while(a2==false);
        //------------------------------------------------------------------------------------------------------------------        
        
        //5.
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης πληκτρολόγησε σωστά την Ημερομηνία χρησιμοποιώντας την μέθοδο CheckDate της κλάσης CheckUserInputs.
        boolean checkEmpty5=false;
        boolean a3=false;       
        boolean checkBetweenDates4=false;       
        do{
            
            System.out.println("\n5. Εισαγωγή Ημερομηνίας λήξης του Μαθήματος σε μορφή: DD/MM/YYYY: "
                    + "και να είναι μεγαλύτερη από την ημερομηνία: "+ courseStartDate);
            courseEndDate=input.nextLine();           
            
            
            // Ελεγχος αν ο χρήστης πληκτρολόγησε κάτι.
            checkEmpty5=CheckUserInputs.CheckIfItIsEmpty(courseEndDate);
            //System.out.println(checkEmpty4);
            
//            if(checkEmpty5==false  a3==true){
//                System.out.println("Το πεδίο είναι άδειο.");
//            }
            
            // Ελεγχος αν ο χρήστης πληκτρολόγησε σωστά την ημερομηνία.
            a3=CheckUserInputs.CheckStartDate(courseEndDate);  
            
            if(a3==false){
                System.out.println("Οχι σωστός τύπος ημερομηνίας.");
            } 
            
            
            // Εδώ γίνεται ο έλεγχος αν είναι μεγαλύτερη ημερομηνία από την προηγούμενη.
            //CheckUserInputs.CheckBetweenDates(courseStartDate, courseEndDate);
            //System.out.println("Η ημερομηνία πρέπει να είναι μεγαλύτερη από την :"+ courseStartDate);
            //System.out.println(checkBetweenDates4);
            
        }
        while(a3==false);
        //------------------------------------------------------------------------------------------------------------------    
       
        
        
        Course c=new Course(courseTitle,courseStream,courseType,courseStartDate,courseEndDate);
        
            
        Course.allCourses.add(c);
           
        
        
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης πληκτρολόγησε μόνο YES ή ΝO χρησιμοποιώντας την μέθοδο CheckYesNo της κλάσης CheckUserInputs.
        boolean a=false;       
        do{
            System.out.println("\n Θέλεις να φτιάξεις και άλλο course; YES/NO :");
            answer=input.next();
            
            a=CheckUserInputs.CheckYesNo(answer);  // Εδώ γίνεται ο έλεγχος.
            //System.out.println(a);
        }
        while(a==false); 
        //------------------------------------------------------------------------------------------------------------------
        
        
        
        
        
        
        
       
        
        }while(answer.equalsIgnoreCase("YES")); // Το αρχικού do.
        
        //System.out.println(Course.allCourses.get(0).getTitle()); // Δουλεύει. ok
        return allCourses;
        
    } // τέλος μεθόδου.  
    //---------------------------------------------------------------------------------------------------
    
    
    // Constructor
    public Course(String title, String stream, String type, String start_date, String end_date) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
    }

   
    
   

    
    //Getters,Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public static ArrayList getAllCourses() {
        return allCourses;
    }

    public static void setAllCourses(ArrayList allCourses) {
        Course.allCourses = allCourses;
    }
    
}