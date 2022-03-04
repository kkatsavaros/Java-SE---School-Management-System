package pkg100.myfirstproject;

import java.util.ArrayList;


public class Synthetic {   
    /*
    //Array List όπου κρατάω όλα τα courses σε αντικείμενα.
    public static ArrayList<Course> allCourses= new ArrayList<Course>();//ok    
    
    
    //Array List όπου κρατάω όλα τους Trainer σε αντικείμενα.
    public static ArrayList<Trainer> allTrainers= new ArrayList<Trainer>();//ok    
    */
      
    
    
    
    
    public static void SyntheticData(){
    
    
    //1.Courses   
    //----------------------------------------------------------------------------------------------------
    //System.out.println("Synthetic Data Courses:");    
    
    Course c1=new Course("CB1","JAVA","FULL","01/01/2020","31/03/2020");
    Course c2=new Course("CB2","JAVA","PART","01/01/2020","31/03/2020");
    Course c3=new Course("CB3","PYTHON","FULL","01/04/2020","31/06/2020");
    Course c4=new Course("CB4","PYTHON","PART","01/04/2020","31/06/2020");
    Course c5=new Course("CB5","JAVASCRIPT","FULL","01/06/2020","31/08/2020");
    Course c6=new Course("CB6","JAVASCRIPT","PART","01/06/2020","31/08/2020");
        
    Course.allCourses.add(c1);
    Course.allCourses.add(c2);
    Course.allCourses.add(c3);
    Course.allCourses.add(c4);
    Course.allCourses.add(c5);
    Course.allCourses.add(c6);
    //----------------------------------------------------------------------------------------------------    
    
    //2. Trainers
    //----------------------------------------------------------------------------------------------------    
    //System.out.println("Synthetic Data Trainers:");    
    
    Trainer t1=new Trainer("KOSTAS","GEORGIOU","JAVA",c1);
    Trainer t2=new Trainer("KOSTAS","GEORGIOU","JAVA",c2);
    Trainer t3=new Trainer("KOSTAS","GEORGIOU","JAVA",c5);

    Trainer t4=new Trainer("DIMITRIS","PAPAS","PYTHON",c3);
    Trainer t5=new Trainer("DIMITRIS","PAPAS","PYTHON",c4);
    Trainer t6=new Trainer("DIMITRIS","PAPAS","PYTHON",c1);

    Trainer t7=new Trainer("JOHN","DIMITRIOU","JAVASCRIPT",c5);
    Trainer t8=new Trainer("JOHN","DIMITRIOU","JAVASCRIPT",c6);
    Trainer t9=new Trainer("JOHN","DIMITRIOU","JAVASCRIPT",c1);
    Trainer t10=new Trainer("JOHN","DIMITRIOU","JAVASCRIPT",c4 );
    
    
    Trainer.allTrainers.add(t1);
    Trainer.allTrainers.add(t2);
    Trainer.allTrainers.add(t3);
    Trainer.allTrainers.add(t4);
    Trainer.allTrainers.add(t5);
    Trainer.allTrainers.add(t6);
    Trainer.allTrainers.add(t7);
   Trainer.allTrainers.add(t8);
    Trainer.allTrainers.add(t9);
    Trainer.allTrainers.add(t10);
    
    
    //3. Students
    //----------------------------------------------------------------------------------------------------   
    // System.out.println("Synthetic Data Students:"); 
     
    Student s1=new Student("GIANNIS","KARAMITROS","01/01/1980",2500,c1);
    Student s2=new Student("GIANNIS","KARAMITROS","01/01/1980",2500,c4);
    
    Student s3=new Student("ALEXIS","KARAPIPERIS","01/06/1980",2250,c1);
    Student s4=new Student("ALEXIS","KARAPIPERIS","01/06/1980",2250,c6);

    Student s5=new Student("BLASIS","KYRIAKOY","15/06/1980",2500,c2);
    Student s6=new Student("GIORGOS","GOUDINAKIS","15/06/1981",2500,c3);
    Student s7=new Student("GIORGOS","DRAKOYLIS","15/07/1982",2500,c4);
    Student s8=new Student("MARIA","DIMITRIOY","10/11/1982",2500,c5);
    Student s9=new Student("DIMITRA","PAPADOPOULOU","1/11/1981",2500,c6);
    Student s10=new Student("SOFIA","PAPADAKI","05/03/1982",1500,c6);
    Student s11=new Student("KOSTAS","CHRISTOU","06/04/1981",1500,c2);
    Student s12=new Student("CHRISA","AYGEROPOYLOY","06/04/1984",1500,c2);
    Student s13=new Student("GIORGOS","MAKRIDIS","02/02/1980",2000,c3);
    Student s14=new Student("MARIOS","PAPADIONISIOY","06/03/1984",2000,c5);
    Student s15=new Student("GIANNIS","POLYMEROY","06/05/1985",2000,c6);
    
    
    Student.allStudents.add(s1);
    Student.allStudents.add(s2);
    Student.allStudents.add(s3);
    Student.allStudents.add(s4);
    Student.allStudents.add(s5);
    Student.allStudents.add(s6);
    Student.allStudents.add(s7);
    Student.allStudents.add(s8);
    Student.allStudents.add(s9);
    Student.allStudents.add(s10);
    Student.allStudents.add(s11);
    Student.allStudents.add(s12);
    Student.allStudents.add(s13);
    Student.allStudents.add(s14);
    Student.allStudents.add(s15);
    
    
    //4. Assignments
    //----------------------------------------------------------------------------------------------------   
    // System.out.println("Synthetic Data Students:"); 
    
    Assignment a1=new Assignment("title of Assignment 1","Description of Assignment1 ","15/02/2020",20,80,100,c1);
    Assignment a2=new Assignment("title of Assignment 2","Description of Assignment2 ","15/02/2020",20,80,100,c2);
    Assignment a3=new Assignment("title of Assignment 3","Description of Assignment3 ","15/02/2020",20,80,100,c3);
    Assignment a4=new Assignment("title of Assignment 4","Description of Assignment4 ","15/02/2020",20,80,100,c4);
    Assignment a5=new Assignment("title of Assignment 5","Description of Assignment5 ","15/02/2020",20,80,100,c5);
    Assignment a6=new Assignment("title of Assignment 6","Description of Assignment6 ","15/02/2020",20,80,100,c6);

    Assignment a7=new Assignment("title of Assignment 7","Description of Assignment7 ","15/02/2020",20,80,100,c1);
    Assignment a8=new Assignment("title of Assignment 8","Description of Assignment8 ","15/02/2020",20,80,100,c1);

    Assignment a9=new Assignment("title of Assignment 9","Description of Assignment9 ","15/02/2020",20,80,100,c2);
    Assignment a10=new Assignment("title of Assignment 10","Description of Assignment10 ","15/02/2020",20,80,100,c2);
    
    
    
    
    Assignment.allAssignments.add(a1);
    Assignment.allAssignments.add(a2);
    Assignment.allAssignments.add(a3);
    Assignment.allAssignments.add(a4);
    Assignment.allAssignments.add(a5);
    Assignment.allAssignments.add(a6);
    Assignment.allAssignments.add(a7);
    Assignment.allAssignments.add(a8);
    Assignment.allAssignments.add(a9);
    Assignment.allAssignments.add(a10);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


    










    }   
    
}
