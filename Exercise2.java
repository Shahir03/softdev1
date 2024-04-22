import java.util.Scanner;

public class QuizExapmle{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
int x= 0;
int y= 0;
int result = 0;

System.out.println("Enter the first number: ");
x= input.nextInt();
System.out.println("Enter the second number: ");
y= input.nextInt();

result = (x + y) * 4;

System.out.println();
System.out.println("(" + x + " + " + y + ") * 4= " + result);

input.close();

 }
}