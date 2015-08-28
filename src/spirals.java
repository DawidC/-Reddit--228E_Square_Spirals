/**
 * Created by Dawid Czarneta on 23.08.2015.
 */
import  java.util.Scanner;
public class spirals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj rozmiar kwadratu (liczba nieparzysta): ");
        int roz = sc.nextInt();
        if(roz%2==0){
            System.out.println("Zły rozmiar!");
            System.exit(123);
        }
        int x = roz;
        int y = roz;


        int[][] tablica = new int[x][y];

        for(int i = 0;i<x;i++){
            for(int j = 0;j<y;j++){
                tablica[i][j] = 0;
            }
        }
        int srx = x/2;
        int sry = y/2;
        int liczba = 1;
        tablica[srx][sry] = 1;
        int klawisz = 1;
        while(klawisz == 1){

            for(int i = 0;i<x;i++){
                for(int j = 0;j<y;j++){
                    System.out.print(tablica[i][j]);
                }
                System.out.println();
            }
            klawisz = sc.nextByte();
            System.out.println("\n\n\n\n\n\n\n\n\n"); //
        }

    }
}
