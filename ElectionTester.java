import java.util.Scanner;
public class ElectionTester
{
    public static void main(String[]args)
{
    Scanner scnr = new Scanner(System.in);
    Candidate one = new Candidate("Joe Biden", "President");
    Candidate one = new Candidate("Messi", "Soccer Player");
    System.out.println( one.getVotes() + one.getName() + one.getParty() );
    System.out.println( two.getVotes() + two.getName() + two.getParty() );
    one.incrementVotes(); 
    System.out.println( one.getVotes() + one.getName() + one.getParty() );

    Election elec1 = new Election();
    Election elec2 = new Election();

    elec1.runElection(scnr);
    elec2.runElection(scnr);
scnr.close();
    }
}