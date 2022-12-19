import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zmagannya zm = new Zmagannya();
        Chempionat ch = new Chempionat();
        Scanner in = new Scanner(System.in);
        int k;
        String pibtren;
        System.out.println("Кількість команд : ");
        Scanner scn1 = new Scanner(System.in);
        int km = in.nextInt();
        zm.setkilkcom(km);
        int i;
        for(i = 0;i < km;i++)
        {

             System.out.println("Назва команди № "+ i);
             Scanner nm = new Scanner(System.in);
             String nmcom = nm.next();
             zm.setnamecom(nmcom);
             System.out.println("ПІБ тренера команди № "+i);
             pibtren = nm.nextLine();
             zm.setpib(pibtren);
             System.out.println("Кількість гравців команди № "+ i);
             int s = in.nextInt();
             zm.setkilksport(s);
            System.out.println("Кількість особистих змагань команди № "+ i);
            int kosobzmag = in.nextInt();
            zm.setKilkosobzmag(kosobzmag);
            int komzmag = in.nextInt();
            System.out.println("Кількість командних змагань команди № "+ i);
            zm.setKilkosobzmag(komzmag);
            pibtren = in.nextLine();

        }


    }
}