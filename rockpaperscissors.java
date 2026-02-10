import java.util.Scanner;
import java.util.Random;//for random choices
public class rockpaperscissors {
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    Random random=new Random();
    String [] choices = { "rock", "paper" ,"scissors" };//I used array form for choices(0,1,2)
    int randomIndex=random.nextInt(3);
    String computerChoices=choices[randomIndex];//translate ındex numbers to string.0 for rock...
    System.out.println("Choose:rock,paper,scissors");
    String userChoices=scanner.next();
    if (userChoices.equals(computerChoices)){
        System.out.println("Draw!Love won!");

    }
    else if (userChoices.equals("rock")&&computerChoices.equals("scissors")){
        System.out.println("You won.Well done.I choosed " + computerChoices);

    }
    
    else if (userChoices.equals("paper")&&computerChoices.equals("rock")){
        System.out.println("You won.Well done. I choosed " + computerChoices);

    
    }

    else if (userChoices.equals("scissors")&&computerChoices.equals("paper")){
        System.out.println("You won.Well done.I choosed :" + computerChoices);

    
    }
    else//for other posibilities computer wins
        System.out.println("I won.Don't worry one day u can beat me :)I choosed " + computerChoices);
 }
 }