package pkg100.myfirstproject;

public class AllData {

    public static void showAllCourses() {

        //------------------------------------------------------------------------------------        
        //1. Εμφάνιση όλων των Courses. 
        //System.out.println(Course.allCourses);              
        System.out.println("\nΕχεις εισάγει τα Courses:");

        int count2 = 0;
        for (Course element1 : Course.allCourses) {

            System.out.println(Course.allCourses.get(count2).getTitle() + "   "
                    + Course.allCourses.get(count2).getStream() + "   "
                    + Course.allCourses.get(count2).getType() + "   "
                    + Course.allCourses.get(count2).getStart_date() + "   "
                    + Course.allCourses.get(count2).getEnd_date() + "   ");
            count2++;
        }

    }
    //------------------------------------------------------------------------------------

    //------------------------------------------------------------------------------------
    //2. Εμφάνιση όλων των Καθηγητών.
    public static void showAllTrainers() {

        System.out.println("\nΈχεις κάνει εισαγωγή τους Καθηγητές.");
        //System.out.println(Trainer.allTrainers);              

        // Εμφάνιση όλων των Trainers.
        int count1 = 0;
        for (Trainer element1 : Trainer.allTrainers) {
            System.out.println(Trainer.allTrainers.get(count1).getFirstName() + "  "
                    + Trainer.allTrainers.get(count1).getLastName() + "  "
                    + Trainer.allTrainers.get(count1).getSubject() + "  "
                    + Trainer.allTrainers.get(count1).course.getTitle() + "  "
            );
            count1++;
        }

    }
    //------------------------------------------------------------------------------------

    //------------------------------------------------------------------------------------
    //2. Εμφάνιση όλων των Μαθητών.
    public static void showAllStudents() {

        System.out.println("\nΈχεις κάνει εισαγωγή τους Μαθητές.");
        //System.out.println(Trainer.allTrainers);              

        // Εμφάνιση όλων των Trainers.
        int count3 = 0;
        for (Student element1 : Student.allStudents) {
            System.out.println(Student.allStudents.get(count3).getFirstName() + "  "
                    + Student.allStudents.get(count3).getLastName() + "  "
                    + Student.allStudents.get(count3).getDateOfBirth() + "  "
                    + Student.allStudents.get(count3).getTuitionFees() + "  "
                    + Student.allStudents.get(count3).course.getTitle() + "  "
            );
            count3++;
        }

    }
    //------------------------------------------------------------------------------------

    //------------------------------------------------------------------------------------
    //2. Εμφάνιση όλων των Assignemnts.
    public static void showAllAssignments() {

        System.out.println("\nΈχεις κάνει εισαγωγή τα Assignments.");
        //System.out.println(Trainer.allTrainers);              

        // Εμφάνιση όλων των Trainers.
        int count4 = 0;
        for (Assignment element4 : Assignment.allAssignments) {
            System.out.println(Assignment.allAssignments.get(count4).getTitleAssignment() + "  "
                    + Assignment.allAssignments.get(count4).getDescription() + "  "
                    + Assignment.allAssignments.get(count4).getSubDateTime() + "  "
                    + Assignment.allAssignments.get(count4).getOralMark() + "  "
                    + Assignment.allAssignments.get(count4).getWriteMark() + "  "
                    + Assignment.allAssignments.get(count4).getTotalMark() + "  "
                    + Assignment.allAssignments.get(count4).getOralMark() + "  "
                    + Assignment.allAssignments.get(count4).course.getTitle() + "  "
            );
            count4++;
        }

    }
    //------------------------------------------------------------------------------------  

}
