package pkg100.myfirstproject;

import java.util.ArrayList;
import java.util.Collections;


public class zTrainersPerCourse {
    
     public static void TrainersPerCourse(){
        
        // Φτιάχνω έναν προσωρινό πίνακα που αποθηκεύω όλα τα coures που έχουν μαθητές.
        // Υπάρχει περίπτωση να υπάρχει κάποιο Course αλλά να μην έχει Καθηγητές ακόμα.
        
        ArrayList<String> tempListOfCourses = new ArrayList<>();//[CB1, CB2,CB3,CB4,CB5,CB6]
        
        
        for(int k=0;k<=Trainer.allTrainers.size()-1;k++){     
            
            if(tempListOfCourses.contains( Trainer.allTrainers.get(k).course.getTitle() )){
                //Για να αποφύγω τις διπλοεγγραφές.
            }else{
               tempListOfCourses.add( Trainer.allTrainers.get(k).course.getTitle() );
            }
        }
        
        //sort
        Collections.sort(tempListOfCourses);//[CB1, CB2,CB3,CB4,CB5,CB6]
        
        
        //
        for(String element:tempListOfCourses){//element = [[CB1, CB2,CB3,CB4,CB5,CB6]
            
            //System.out.println(element);
            System.out.println("\nΣτο Course : "+element+" διδάσκουν οι Καθηγητές."); //
            
            int count=0;
            for(Trainer elementTrainer: Trainer.allTrainers){ //Object           
              
                
                if(element.equals(Trainer.allTrainers.get(count).course.getTitle())){    
                
                    System.out.println(Trainer.allTrainers.get(count).getLastName() + "  "
                                       +Trainer.allTrainers.get(count).getFirstName()
                    );
                               
                }
                
                 count++;
            }       
        }
    
        
        
    }
}
