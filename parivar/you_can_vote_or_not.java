package parivar;
public class you_can_vote_or_not {
    public static void vote(int age) {
        if (age>18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }
        
    }
    public static void main(String[] args) {
        int age=16;
        vote(age);
    }
}
