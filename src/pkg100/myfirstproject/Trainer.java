package pkg100.myfirstproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Trainer {
    
    private String firstName;
    private String lastName;
    private String subject;  //Τι μάθημα κάνει ο καθηγητής. 
    Course course; // Association
    
    
    //Array List όπου κρατάω όλα τα Trainers σε αντικείμενα.
    public static ArrayList<Trainer> allTrainers = new ArrayList<Trainer>();//ok   
    
    //------------------------------------------------------------------------------------------------------ 
    
    public static ArrayList AddTrainersFromUserInput(){    
     
        String answer;
        answer="";
        
        Scanner input = new Scanner(System.in);
        
        String trainerFirstName;
        String trainerLastName;
        String trainerSubject;
        String trainerCourse;
        int trainerNumberOfCourses;
        
        
        
        System.out.println("Εισαγωγή στοιχείων ενός Trainer: ");
        
        
        do{ // Αυτό είναι του "}while(answer.equalsIgnoreCase("YES"));"
        
        //1. Εισαγωγή Ονόματος Καθηγητή:   
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης δεν πληκτρολόγησε τίποτα χρησιμοποιώντας την μέθοδο CheckIfItIsEmpty της κλάσης CheckUserInputs.
        boolean checkEmpty1=false;       
        do{
            
            System.out.println("\n1. Εισαγωγή Ονόματος Καθηγητή: ");         
            trainerFirstName=input.nextLine();  
            
            checkEmpty1=CheckUserInputs.CheckIfItIsEmpty(trainerFirstName);  // Εδώ γίνεται ο έλεγχος.
            //System.out.println(checkEmpty1);
            
            if(checkEmpty1==false){
                System.out.println("Το πεδίο είναι άδειο.");
            }
        }
        while(checkEmpty1==false);
        //------------------------------------------------------------------------------------------------------------------
        
        
        //2. Εισαγωγή Επίθετου Καθηγητή:
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης δεν πληκτρολόγησε τίποτα χρησιμοποιώντας την μέθοδο CheckIfItIsEmpty της κλάσης CheckUserInputs.
        boolean checkEmpty2=false;       
        do{
            
            System.out.println("\n2. Εισαγωγή Επίθετου Καθηγητή: "); 
            trainerLastName=input.nextLine();
            
            checkEmpty2=CheckUserInputs.CheckIfItIsEmpty(trainerLastName);  // Εδώ γίνεται ο έλεγχος.
            //System.out.println(checkEmpty2);
            
            if(checkEmpty2==false){
                System.out.println("Το πεδίο είναι άδειο.");
            }
        }
        while(checkEmpty2==false);
        //------------------------------------------------------------------------------------------------------------------
        
        //3. Εισαγωγή Μαθήματος Καθηγητή:
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης δεν πληκτρολόγησε τίποτα χρησιμοποιώντας την μέθοδο CheckIfItIsEmpty της κλάσης CheckUserInputs.
        boolean checkEmpty3=false;       
        do{
            
            System.out.println("\n3. Εισαγωγή Μαθήματος Καθηγητή: "); 
            trainerSubject=input.nextLine();
            
            checkEmpty3=CheckUserInputs.CheckIfItIsEmpty(trainerSubject);  // Εδώ γίνεται ο έλεγχος.
            //System.out.println(checkEmpty2);
            
            if(checkEmpty3==false){
                System.out.println("Το πεδίο είναι άδειο.");
            }
        }
        while(checkEmpty3==false);
        //------------------------------------------------------------------------------------------------------------------
        
        
        //4. Σε ποιο Course θα διδάσκει ο Καθηγητής;
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης δεν πληκτρολόγησε τίποτα χρησιμοποιώντας την μέθοδο CheckIfItIsEmpty της κλάσης CheckUserInputs.
        boolean checkEmpty4=false;       
        do{
            
            // Βάζω όλους τους τίτλους σε έναν πίνακα, γιαυτό δημιουργώ έναν ArrayList με strings.    
            // Αυτό το κάνω για να εντοπίσω αν ο χρήστης πληκτρολόγησε σωστά το course.
            ArrayList<String> tempListOfTitles = new ArrayList<>();
            for(int k=0;k<=Course.allCourses.size()-1;k++){                
                tempListOfTitles.add(Course.allCourses.get(k).getTitle());
            }
                
                    
           
           
            System.out.println("\n4. Σε πόσα Courses θα διδάσκει ο Καθηγητής; : "); 
            trainerNumberOfCourses=input.nextInt();
            
            
                     
            // loop 
            for (int numberOfCources=1;numberOfCources<=trainerNumberOfCourses;numberOfCources++){
                
                
                boolean checkEmpty5=false;    
                do{   
                        System.out.println("\n5. Εισαγωγή το "+ numberOfCources +"ο  Course που θα διδάσκει ο Καθηγητής; : "); 
                        trainerCourse=input.nextLine();
            
                        // Εδώ γίνεται ο έλεγχος, αν πάτησε κάτι άδειο.
                        checkEmpty5=CheckUserInputs.CheckIfItIsEmpty(trainerCourse);                          

                        if(checkEmpty5==false){
                            System.out.println("Το πεδίο είναι άδειο.");
                        }
                                    

                                 
                       //Αν ο πίνακας περιέχει αυτό που έγραψε ο χρήστης.
                       boolean ans = tempListOfTitles.contains(trainerCourse);  
                       if(ans) { // Αν true,
                           // βρες το index
                           int indexOfTheElement=tempListOfTitles.indexOf(trainerCourse);                          

                            // Δημουργία του αντικειμένου trainer με μία παράμετρο το object Course, Association. //************//
                            Trainer t=new Trainer(trainerFirstName, trainerLastName, trainerSubject, Course.allCourses.get(indexOfTheElement));
                            allTrainers.add(t);

                            checkEmpty4=true; //βγες από την do while την μεγάλη.
                       }else{
                           // Αν δεν υπάρχει κάνε ξανά βόλτα στην μικρή do και ξαναρώτα.
                           System.out.println("Δεν υπάρχει...");     
                           checkEmpty5=false;
                       }
                 }while(checkEmpty5==false);          

            } // end of: for 
                        
            
           checkEmpty4=true; //βγες από την do while την μεγάλη.
            
            
        }
        while(checkEmpty4==false);
        //------------------------------------------------------------------------------------------------------------------
        
        //------------------------------------------------------------------------------------------------------------------
        // Ελέγχω αν ο χρήστης πληκτρολόγησε μόνο YES ή ΝO χρησιμοποιώντας την μέθοδο CheckYesNo της κλάσης CheckUserInputs.
        boolean a=false;       
        do{
            System.out.println("\n Θέλεις να Εισάγεις άλλον Καθηγητή; YES/NO :");
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
        return allTrainers;
        
        
        
        
        
        
    } // τέλος μεθόδου.  
    //--------------------------------------------------------------------------------------------------- 
    
    
    
    
    //Constructor

    public Trainer(String firstName, String lastName, String subject, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.course = course;
    }

    //Getters,Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public static ArrayList<Trainer> getAllTrainers() {
        return allTrainers;
    }

    public static void setAllTrainers(ArrayList<Trainer> allTrainers) {
        Trainer.allTrainers = allTrainers;
    }
   
            
      
        
    } // τέλος κλάσης.  
    //---------------------------------------------------------------------------------------------------