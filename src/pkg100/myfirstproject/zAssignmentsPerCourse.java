package pkg100.myfirstproject;

import java.util.ArrayList;
import java.util.Collections;

public class zAssignmentsPerCourse {
    
    
    public static void AssignmentsPerCourse(){
        
      
        //Φτιάχνω έναν προσωρινό πίνακα που αποθηκεύω όλα τα coures που έχουν μαθητές.
        // Υπάρχει περίπτωση να υπάρχει κάποιο Course αλλά να μην έχει Καθηγητές ακόμα.
        
        ArrayList<String> tempListOfCourses = new ArrayList<>();//[CB1, CB2,CB3,CB4,CB5,CB6]
        
        
        for(int k=0;k<=Assignment.allAssignments.size()-1;k++){     
            
            if(tempListOfCourses.contains(Assignment.allAssignments.get(k).course.getTitle() )){
                //Για να αποφύγω τις διπλοεγγραφές.
            }else{
               tempListOfCourses.add(Assignment.allAssignments.get(k).course.getTitle() );
            }
        }
        
        //sort
        Collections.sort(tempListOfCourses);//[CB1, CB2,CB3,CB4,CB5,CB6]
        //System.out.println(tempListOfAssignments);
        
        
        //
        for(String element:tempListOfCourses){//element = [CB1,CB2,CB3,CB4,CB5,CB6]
            
            //System.out.println(element);
            System.out.println("\nΣτο Course : "+element+" υπάρχουν τα Assignments."); //
            
            int count=0;
            for(Assignment elementAssignment: Assignment.allAssignments){ //Object           
              
                
                if(element.equals(Assignment.allAssignments.get(count).course.getTitle())){    
                
                    System.out.println(Assignment.allAssignments.get(count).getTitleAssignment()
                                      
                    );
                               
                }
                
                 count++;
            }       
        }
       
    
        
        
        
        
    }
    
}