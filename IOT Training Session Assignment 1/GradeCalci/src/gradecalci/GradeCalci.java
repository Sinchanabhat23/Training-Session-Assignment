package gradecalci;
import java.util.*;
public class GradeCalci {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a marks");
      int marks=sc.nextInt();
      int grade;
      if(marks>=90)
      {
          grade=1;
      }
      else if(marks>=80)
      {
          grade=2;
      }
      else if(marks>=70)
      {
          grade=3;
      }
      else if(marks>=60)
      {
          grade=3;
      }
      else if(marks>=50)
      {
          grade=4;
      }
      else{
          grade=5;
        }
      switch(grade)
      {
          case 1:
              System.out.println("Grade 1");
              break;
          case 2:
              System.out.println("Grade 2");
              break;
          case 3:
              System.out.println("Grade 3");
              break;
          case 4:
              System.out.println("Grade 4");
              break;
          case 5:
              System.out.println("Grade 5");
              break;
          default:
              System.out.println("Invalid input");
      }
    }
}
           
           