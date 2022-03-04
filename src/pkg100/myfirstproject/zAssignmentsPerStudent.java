package pkg100.myfirstproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class zAssignmentsPerStudent {
    
     public static void AssignmentsPerStudent(){
         
        //1. ok Γεμίζω το Map.
        Map<String,String> assignment = new HashMap<>();        
        for(int k=0;k<=Assignment.allAssignments.size()-1;k++){                 
            assignment.putIfAbsent(Assignment.allAssignments.get(k).getTitleAssignment(),Assignment.allAssignments.get(k).course.getTitle());
        }
        //System.out.println("Pinakas: "+ assignment);          
        
        
        //2.Φτιάχνω τον πίνακα Set.
        Set<Map.Entry<String,String>> mapentries=assignment.entrySet();        
        for (Map.Entry<String,String> me: mapentries){
           // System.out.println("Key: "+me.getKey() +"---> Value:"+me.getValue());            
        }  
        //System.out.println(Assignment.allAssignments.size());
        //System.out.println(mapentries);
        
        
        //3. Τα συνδυάζω για να απαντήσω στο Students Per Course.
        for(int k=0;k<=Student.allStudents.size()-1;k++){                 
                //System.out.println(k+" " +Student.allStudents.get(k).getLastName()+ " --> "+Student.allStudents.get(k).course.getTitle() );           
                
            for (Map.Entry<String,String> me: mapentries){                    
                //CB1.equals
                if(Student.allStudents.get(k).course.getTitle().equals(me.getValue()))
                
            
                System.out.println("O Μαθητής "+ Student.allStudents.get(k).getLastName() + "  " +Student.allStudents.get(k).getFirstName()
                                   +" είναι στο course "+ Student.allStudents.get(k).course.getTitle()
                                   +" έχει για αυτό το course έχει Assignments τα  : "+me.getKey()
                );                
            }   
            System.out.println("");
        }               
        
        
     }// end of method
     
     
     
    public static void StudentsWithMoreThanOneCourses(){        
        
        //Βάζω όλους του μαθητές σε ένα ArrayList.
        ArrayList<String>  allDoubleStudents=new ArrayList<>();
        
        for(int k=0;k<=Student.allStudents.size()-1;k++){             
            allDoubleStudents.add(Student.allStudents.get(k).getLastName());          
        }        
        
        //Απάντηση με κάλεσμα της μεθόδου.
        //System.out.println(findDuplicates(allDoubleStudents));//KARAMITROS,KARAPIPERIS
        
        //Εμφάνιση των Courses των μαθητών που είναι σε περισσότερα από 1.
        for(int k=0;k<=Student.allStudents.size()-1;k++){  
            
            boolean ans = findDuplicates(allDoubleStudents).contains(Student.allStudents.get(k).getLastName());
            
            if(ans){
            
            System.out.println("Ο μαθητής: "+Student.allStudents.get(k).getLastName() 
                              + " είναι στο Course: "+Student.allStudents.get(k).course.getTitle());
            }else{
            
            } 
        }        
          
    }// end of method
        
    
    
    public static Set<String> findDuplicates(List<String> listContainingDuplicates) {
 
	final Set<String> setToReturn = new HashSet<String>();
	final Set<String> set1 = new HashSet<String>();
 
	for (String yourInt : listContainingDuplicates) {
            if (!set1.add(yourInt)) {
		setToReturn.add(yourInt);
            }
	}
	
        return setToReturn;
    }
             
             
} // end of class.