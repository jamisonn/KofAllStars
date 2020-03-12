import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int n = 1;
        while (n==1){
            CoinGrind();
        }
        MaterialsGrind();

    }
    public static void CoinGrind(){
        int time= 1;
        System.out.println("How many coins are needed");
        Scanner scanner = new Scanner(System.in);
        int coinsneeded = scanner.nextInt();
        System.out.println("How many coins do you already have?");
        int coinsgained =scanner.nextInt();
        int coinmultiplier =24000;
        int loops = 0;

        for(int p = 0; coinsneeded>coinsgained;p++){
            coinsgained+=coinmultiplier;
            loops++;
            time++;
        }
        System.out.println("Loops: "+loops+" \n Time: "+time+" minutes");
    }
    public static void MaterialsGrind(){
        System.out.println("What color cores are needed? 1. Blue 2. Green 3. Yellow 4. Red 5. Purple");
        ArrayList Colors = new ArrayList();
        Colors.add("1. Blue");
        Colors.add("2. Green");
        Colors.add("3. Yellow");
        Colors.add("4. Red");
        Colors.add("5. Purple");
        Scanner scanner = new Scanner(System.in);
        int Colorchooser = scanner.nextInt();
        Colors.get(Colorchooser);
        System.out.println("How many are needed?");
        int coresMax = scanner.nextInt();
        System.out.println("How many do you have?");
        int coresobtained = scanner.nextInt();
        Random random = new Random();
        int counter=0;
        int loops = 0;
        while (coresobtained<coresMax){
            coresobtained+=2;
            int x= random.nextInt(5);
            if(x == Colorchooser){
                coresobtained++;
            }
            loops++; }
            System.out.println("Loops"+loops);


        }
    }
