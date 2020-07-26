import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Average of list\n2. Get string start with 'a' and length 3\n3. get all palindrome strings.\nEnter your choice");
        int n=sc.nextInt();

        if(n>0 && n<=3){
            System.out.println("Enter list length:");
            int m=sc.nextInt();
            if(n==1){
                System.out.println("Enter list of integers:");
                List<Integer> b = new ArrayList<>();
                for(int i=0;i<m;++i){
                    b.add(sc.nextInt());
                }
                ListAverage a=new ListAverage();
                System.out.println("Average: "+a.calculate(b));
            }
            else if(n==2){
                System.out.println("Enter strings line by line:");
                List<String> b=new ArrayList<>();
                for(int i=0;i<=m;++i){
                    b.add(sc.nextLine());
                }
                TypeofString a=new TypeofString();
                b=a.calculate(b);
                System.out.println("List that matches");
                for(String i: b){
                    System.out.println(i);
                }
            }
            else if(n==3){
                System.out.println("Enter strings ny line:");
                List<String> b=new ArrayList<>();
                for(int i=0;i<=m;++i){
                    b.add(sc.nextLine());
                }
                ListStrings a=new ListStrings();
                b=a.calculate(b);
                System.out.println("List of Palindrome strings");
                for(String i: b){
                    System.out.println(i);
                }
            }
        }
    }
}
