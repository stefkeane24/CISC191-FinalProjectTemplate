import java.util.Scanner;
public class Election
{
    private Candidate candidate1;
    private Candidate candidate2;
    private Candidate candidate3;
    public Election(){
        candidate1 = new Candidate("Barack Obama", "President");
        candidate2 = new Candidate("Democratic", "Republican", "Green");
        candidate3 = new Candidate("Joe Biden", "President");
    }
    public void runElection(Scanner scan){
        System.out.println("We have 3 candidates for this election, here are the options:");
        System.out.println("1)"+ candidate1.getName() + "from the" + candidate1.getParty() +"Party");
        System.out.println("2)"+ candidate2.getName() + "from the" + candidate2.getParty() +"Party");
        System.out.println("3)"+ candidate3.getName() + "from the" + candidate3.getParty() +"Party");

        System.out.print("Please enter the next vote");

            int guess = 0;
            while(guess != 1)
            {
                System.out.print("Please enter the next vote");
                guess = Scan.nextInt();
                if (guess ==1) {

    candidate1.incrementVotes();
                }
                else if (guess == 2) {
    candidate2.incrementVotes();
                }
                else if (guess == 3) {
    candidate3.incrementVotes();
                } 
             }
            System.out.println(" The count for the votes are:");
            System.out.println(candidate1.getName() + "," + candidate1.getVotes());

            System.out.println(candidate2.getName() + "," + candidate2.getVotes());

            System.out.println(candidate3.getName() + "," + candidate3.getVotes());

                if (candidate1.getvotes())> candidate2.getVotes() && candidate1.getVotes() > candidate3.getVotes() 
            }                     
            System.out.print(candidate1.getName() + "from the" + candidate1.getParty() + "party is the winner of the election");

                else if (candidate2.getVotes) > candidate1.getVotes() && candidate3.getVotes() < candidate2.getVotes();  

            System.out.print(candidate1.getName() + "from the" + candidate1.getParty() + "party is the winner of the election");
            }

                else if (candidate3.getVotes) > candidate1.getVotes() && candidate3.getVotes() > candidate2.getVotes();

            System.out.print(candidate1.getName() + "from the" + candidate1.getParty() + "party is the winner of the election");
    }
}