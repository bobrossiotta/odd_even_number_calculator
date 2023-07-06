import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int n,total=0;
                Scanner bob = new Scanner(System.in);
                do {
                    System.out.println("Number : ");
                    n = bob.nextInt();
                    if (n % 2 == 0 || n % 4 == 0){
                        total +=n;
                    }else {
                        System.out.println("tek sayı girdin");
                    }

                }while (n>0);
                System.out.println("TOTAL:"+total);




            }
        }