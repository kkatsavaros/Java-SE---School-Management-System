package pkg100.myfirstproject;

import java.util.ArrayList;
import java.util.Collections;


public class zStudentsPerCourse {
    
    public static void StudentsPerCourse(){
        
       //Φτιάχνω έναν προσωρινό πίνακα που αποθηκεύω όλα τα coures που έχουν μαθητές.
       // Υπάρχει περίπτωση να υπάρχει κάποιο Course αλλά να μην έχει μαθητές ακόμα.       
        ArrayList<String> tempListOfCourses = new ArrayList<>();
        
        for(int k=0;k<=Student.allStudents.size()-1;k++){     
            
            if(tempListOfCourses.contains(Student.allStudents.get(k).course.getTitle())){
                //Για να αποφύγω τις διπλοεγγραφές.
            }else{
               tempListOfCourses.add(Student.allStudents.get(k).course.getTitle());
            }
        }
        
        //sort
        Collections.sort(tempListOfCourses);
        System.out.println(tempListOfCourses);//[CB1, CB2,CB3,CB4,CB5,CB6]
        
        
        
        //
        for(String element:tempListOfCourses){//element = [CB1,CB2,CB3,CB4,CB5,CB6]
            
            //System.out.println(element);
            System.out.println("Στο Course : "+element+" διδάσκουν οι Καθηγητές."); //
            
            int count=0;
            for(Student elementStudent: Student.allStudents){ // Object                               
                
                
                if(element.equals(Student.allStudents.get(count).course.getTitle())){    
                
                System.out.println(Student.allStudents.get(count).getLastName());
               
                }
                
                 count++;
            }       
        }
       
        
        
    }
    
}
