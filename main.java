import java.util.Random;
import java.util.Scanner;

public class main 
{
    public static void main(String[] args) {
        Game player1 = new Game();
        player1.takeUserInput();
        player1.check();
    }
}

class Game
{
    int random_number;
    int entered_number;
    int counter;
    public Game(){
        Random random = new Random();
        random_number = random.nextInt(100); 
        //System.out.println(random_number);
        counter = 0;
    }

    public void takeUserInput(){
        System.out.print("Enter Number - ");
        Scanner sc = new Scanner(System.in);
        entered_number = sc.nextInt();
        System.out.println("");
    }

    public void check(){
        while(true){
            if(entered_number > random_number){
                System.out.println("Number Is Greater !");
                counter++;
                takeUserInput();
            }
            else if(entered_number < random_number ){
                System.out.println("Number Is Smaller !");
                counter++;
                takeUserInput();
            }
            else{
                System.out.println("Number Of Guess - " + counter );
                break;
            }
        }
    }
}
