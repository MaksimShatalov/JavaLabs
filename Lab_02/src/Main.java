import java.util.Scanner; // импорт сканера


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввеідть текст");
        String text = in.nextLine();
        String[] straArr = text.split(" " );
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < straArr.length;i++)
        {
            char first = straArr[i].charAt(0);
            if((((first != 'ц') && (first != 'к')&&(first != 'н')&&(first != 'г')&&(first != 'ш')&&(first != 'щ')&&(first != 'з')&&(first != 'х')&&((first != 'ф')&&(first != 'в')&&(first != 'в'))&&(first != 'п')&&(first != 'р')&&(first != 'л')&&(first != 'д')&&(first != 'ж')&&((first != 'ч')&&(first != 'с')&&(first!='м')&&((first != 'т')&&(first != 'б'))))))
            {
                sb.append(straArr[i]).append(" ");
            }
            String txt = sb.toString().trim();
            System.out.print(txt+" ");
        }
    }
}