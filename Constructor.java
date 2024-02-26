import java.util.Scanner;
class student1{
    public 
        student1(){
            System.out.println("Hi! constructer has been created");
        }
        String fullName;
        int rollNum;
        double semPerentage;
        String collegeName;
        int collegeCode;
}
class student{
    public static void main(String[] args){
        Scanner op=new Scanner(System.in);
        student1 sasi=new student1();
        System.out.println("Enter your name :");
        sasi.fullName=op.next();
        System.out.println("Enter your rollnumber :");
        sasi.rollNum=op.nextInt();
        System.out.println("Enter your sempercantage :");
        sasi.semPerentage=op.nextInt();
        System.out.println("Enter your collegename :");
        sasi.collegeName=op.next();
        System.out.println("Enter your collegecode :");
        sasi.collegeCode=op.nextInt();
        System.out.println("Name : "+sasi.fullName+"\nRoll number : "+sasi.rollNum+"\nSempercentage : "+sasi.semPerentage+"\nCollegename : "+sasi.collegeName+"\nCollegecode : "+sasi.collegeCode);

    }
}
