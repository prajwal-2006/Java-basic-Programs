import java.util.Scanner;
class Grades
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks");
int marks=sc.nextInt();
if(marks>90)
{
System.out.println("Grade A");
}
else if(marks>70)
{
System.out.println("Grade B");
}
else if(marks>=40)
{
System.out.println("Grade C");
}
else if(marks>=20)
{
System.out.println("Grade D");
}
else
{
System.out.println("FAIL");
}
}
}
