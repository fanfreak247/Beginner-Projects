public class Start
{
   public static void main(String[] args)
   {
     Hangman game = new Hangman("Hello");
     System.out.println("Welcome to Hangman. Make sure to guess letters.");
     while (!game.isCompleted())
     {
       System.out.println(game + "\n");
       game.enterInput();
     }
     System.out.println("You got it! The word was: " + game);
   }
}