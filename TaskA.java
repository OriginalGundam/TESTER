//Task A
//Matthew Yeung
//CS1400
//Assignment 4
//10-08-2023
import java.io.IOException;
import java.util.Scanner;
public class TaskA{
    public static void main(String[] args) throws IOException
    {
        int Health;
        int Attack;
        int Defense;
        int Experience;
        int Bonus;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Enter Health: ");
            Health = keyboard.nextInt();
            HyphensConvert("Health: " , Health);
            System.out.println("\nEnter Attack: ");
            Attack = keyboard.nextInt();
            HyphensConvert("Attack: ", Attack);
            System.out.println("\nEnter Defense: ");
            Defense = keyboard.nextInt();
            HyphensConvert("Denfense: ", Defense);
            System.out.println("\nEnter Experience: ");
            Experience = keyboard.nextInt();
            HyphensConvert("Experience: " , Experience);
            System.out.println("\nEnter Bonus: ");
            Bonus = keyboard.nextInt();
            HyphensConvert("Bonus: " , Bonus);
        }
    }
    public static void HyphensConvert(String elements, int input)
    {
    System.out.print(elements);
    int Hyphen = input/10;
        if (input > 10)
        {
            for (int Count = 0; Count < Hyphen; Count++)
            {
                System.out.print("-");
            }
        }
        else
        {
            System.out.print("Level Failed. Restart?");
        }
    }
}