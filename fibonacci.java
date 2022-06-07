import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter series count:- ");
        int count= c.nextInt();
        int i, n1=0, n2=1;
        System.out.print(n1+" "+n2);
        for(i=2;i<count;i++){
            int n3= n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }

    }

}
