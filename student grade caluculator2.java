import java.util.Scanner;
class studentGradeCaluculator{
    public static void main(String arg[]){
        System.out.println("STUDENT GRADE CALUCULATOR");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int numOfSubs=s.nextInt();
        int[] marks = new int[numOfSubs];
        int totalMarks=0;
        for(int i=0;i<numOfSubs;i++){
            System.out.println("Enter the marks of subject"+(i+1));
            marks[i]=s.nextInt();
            totalMarks = totalMarks+marks[i];
        }
            System.out.println("Marks Secured: "+totalMarks);
            double avgP = totalMarks/numOfSubs;
            System.out.println("Percentage Secured: "+avgP);
            if(avgP > 90){
                System.out.println("You got A grade");
            }
            else if(avgP>80){
                System.out.println("You got B grade");
            }
            else if(avgP>70){
                System.out.println("You got c grade");
            }
            else if(avgP>60){
                System.out.println("You got D grade");
            }
            else if(avgP>50){
                System.out.println("You got E grade");
            }
            else{
                System.out.println("You got F grade");
            }
      s.close();  
    }
}