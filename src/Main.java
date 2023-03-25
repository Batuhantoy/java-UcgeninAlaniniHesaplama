import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degişkenler
        int k1,k2,k3;
        Scanner input = new Scanner(System.in);

        //Üçgenin kenarlarını kullanıcıdan al
        System.out.print("1. Kenarın Uzunluğu : ");
        k1= input.nextInt();

        System.out.print("2. Kenarın Uzunluğu : ");
        k2= input.nextInt();

        System.out.print("3. Kenarın Uzunluğu : ");
        k3= input.nextInt();

        //Hesapla
        int u = (k1+k2+k3)/2;
        double cevre = 2*u;
        double alan = Math.sqrt(u*(u-k1)*(u-k2)*(u-k3));
        System.out.println("Çevre : "+cevre);
        System.out.println("Alan : "+alan);
    }
}