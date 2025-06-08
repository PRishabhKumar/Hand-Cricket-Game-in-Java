import java.util.Scanner;
public class hand_cricket
{
    public void process()
    {
        System.out.println("WELCOME TO THIS MATCH OF HAND CRICKET !!!");
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 1;
        int range = max-min;
        int x = (int)(Math.random()*(range+1) + min);
        String[] toss = {"HEADS","TAILS"};
        System.out.println("ENTER YOUR CHOICE, HEADS OR TAILS");
        String my_choice = sc.next();
        String toss_choice;
        String actual_toss_result = toss[x];
        int[] runs = {0,1,2,3,4,5,6,7,8,9,10};
        int max1 = 10;
        int min1 = 0;
        int range1 = max1-min1;
        int y = (int)(Math.random()*(range1+1) + min);
        int my_run;
        int computer_move;
        int my_score = 0,computer_score = 0;
        System.out.println();
        System.out.println("COIN LANDED ON : " + actual_toss_result);
        String[] toss_choice_arr = {"BAT","BOWL"};
        int x1 = (int)(Math.random()*(range+1) + min);
        String toss_choice_computer = toss_choice_arr[x1];
        if(my_choice.equalsIgnoreCase(actual_toss_result))
        {
            System.out.println("YOU WON THE TOSS !!!");
            System.out.println("ENTER YOUR CHOICE");
            System.out.println("'BAT' FOR BATTING AND 'BOWL' FOR FIELDING");
            toss_choice = sc.next();
            if (toss_choice.equalsIgnoreCase("BAT")) {
                System.out.println("         1st INNINGS           ");
                System.out.println("KEEP ENTERING NUMBERS BETWEEN 0 TO 10 AS YOUR RUNS");
                my_run = sc.nextInt();
                computer_move = y;
                my_score += my_run;
                while (my_run != computer_move)
                {
                    my_run = sc.nextInt();
                    computer_move = y;
                    my_score += my_run;
                    if (my_run == 0)
                    {
                        my_score += computer_move;
                    }
                    y = (int) (Math.random() * (range1 + 1) + min);
                }
                System.out.println("YOU ARE DEFEATED BY THE COMPUTER NOW");
                System.out.println("THE TARGET RUN FOR THE COMPUTER IS " + (my_score + 1));
                System.out.println("        2nd INNINGS        ");
                System.out.println("KEEP ENTERING THE NUMBERS BETWEEN 0 TO 10 AS YOU BOWLING MOVE");
                my_run = sc.nextInt();
                computer_move = y;
                computer_score += computer_move;
                while (my_run != computer_move) {
                    my_run = sc.nextInt();
                    computer_move = y;
                    computer_score += computer_move;
                    if (computer_move == 0) {
                        computer_score += my_run;
                    }
                    y = (int) (Math.random() * (range1 + 1) + min);
                }
                if(computer_score>=(my_score+1))
                {
                    System.out.println("TARGET RUNS REQUIRED : " + (my_score+1));
                    System.out.println("THE COMPUTER'S SCORE : " + computer_score);
                    System.out.println("YOU LOSE THE MATCH BY " + (computer_score -  my_score) + " RUNS");
                }
                else
                {
                    System.out.println("TARGET RUNS REQUIRED : " + (my_score+1));
                    System.out.println("THE COMPUTER'S SCORE : " + computer_score);
                    System.out.println("YOU WIN THE MATCH BY : " + (my_score-computer_score) + " RUNS");
                }
            }
            else if (toss_choice.equalsIgnoreCase("BOWL")) {
                System.out.println("YOU CHOSE BOWLING");
                System.out.println("    1st INNINGS        ");
                System.out.println("KEEP ENTERING THE NUMBERS BETWEEN 0 TO 10 AS YOU BOWLING MOVE");
                my_run = sc.nextInt();
                computer_move = y;
                computer_score += computer_move;
                while (my_run != computer_move) {
                    my_run = sc.nextInt();
                    computer_move = y;
                    computer_score += computer_move;
                    if (computer_move == 0) {
                        computer_score += my_run;
                    }
                    y = (int) (Math.random() * (range1 + 1) + min);
                }
                System.out.println("YOU DEFEATED THE COMPUTER NOW");
                System.out.println("COMPUTER SCORE = " + computer_score);
                System.out.println("COMPUTER GAVE YOU A TARGET OF " + (computer_score + 1) + " RUNS");
                System.out.println("        2nd INNINGS        ");
                System.out.println("KEEP ENTERING NUMBERS BETWEEN 0 TO 10 AS YOUR RUNS");
                my_run = sc.nextInt();
                computer_move = y;
                my_score += my_run;
                while (my_run != computer_move)
                {
                    my_run = sc.nextInt();
                    computer_move = y;
                    my_score += my_run;
                    if (my_run == 0) {
                        my_score += computer_move;
                    }
                    y = (int) (Math.random() * (range1 + 1) + min);
                    if(my_score>=computer_score+1)
                    {
                        break;
                    }
                }
                if(my_score>=(computer_score+1))
                {
                    System.out.println("TARGET RUNS REQUIRED : " + (computer_score+1));
                    System.out.println("YOUR SCORE : " + my_score);
                    System.out.println("YOU WIN THE MATCH ");
                }
                else
                {
                    System.out.println("TARGET RUNS REQUIRED : " + (computer_score+1));
                    System.out.println("YOUR SCORE : " + my_score);
                    System.out.println("YOU LOSE THE MATCH ");
                }
            }
        }
        else
        {
            System.out.println("YOU LOSE THE TOSS");
            System.out.println("THE COMPUTER CHOSE TO : " + toss_choice_computer);
            if(toss_choice_computer.equalsIgnoreCase(("BAT")))
            {
                System.out.println("        1st INNINGS        ");
                System.out.println("KEEP ENTERING THE NUMBERS BETWEEN 0 TO 10 AS YOU BOWLING MOVE");
                my_run = sc.nextInt();
                computer_move = y;
                computer_score += computer_move;
                while (my_run != computer_move)
                {
                    my_run = sc.nextInt();
                    computer_move = y;
                    System.out.println("COMPUTER MOVE = " + computer_move);
                    computer_score += computer_move;
                    if (computer_move == 0) {
                        computer_score += my_run;
                    }
                    y = (int) (Math.random() * (range1 + 1) + min);
                }
                System.out.println("THE COMPUTER IS NOW OUT !!!");
                System.out.println("THE COMPUTER GAVE YOU A TARGET OF " + (computer_score+1) + " RUNS");
                System.out.println("        2nd INNINGS        ");
                System.out.println("KEEP ENTERING NUMBERS BETWEEN 0 TO 10 AS YOUR RUNS");
                my_run = sc.nextInt();
                computer_move = y;
                my_score += my_run;
                while (my_run != computer_move)
                {
                    my_run = sc.nextInt();
                    computer_move = y;
                    my_score += my_run;
                    if (my_run == 0) {
                        my_score += computer_move;
                    }
                    y = (int) (Math.random() * (range1 + 1) + min);
                    if (my_score > computer_score + 1)
                    {
                        System.out.println("YOU WON THE MATCH");
                        break;
                    }
                    else
                    {
                        continue;
                    }
                }
                if(my_score<computer_score+1)
                {
                    System.out.println("YOU LOSE THE MATCH !!!");
                }

            }
            else if(toss_choice_computer.equalsIgnoreCase("BOWL"))
            {
                System.out.println("KEEP ENTERING NUMBERS BETWEEN 0 TO 10 AS YOUR RUNS");
                my_run = sc.nextInt();
                computer_move = y;
                my_score += my_run;
                while (my_run != computer_move)
                {
                    my_run = sc.nextInt();
                    computer_move = y;
                    my_score += my_run;
                    if (my_run == 0)
                    {
                        my_score += computer_move;
                    }
                    y = (int) (Math.random() * (range1 + 1) + min);
                }
                System.out.println("YOU ARE DEFEATED BY THE COMPUTER NOW");
                System.out.println("THE TARGET RUN FOR THE COMPUTER IS " + (my_score + 1));
                System.out.println("        2nd INNINGS        ");
                System.out.println("KEEP ENTERING THE NUMBERS BETWEEN 0 TO 10 AS YOUR BOWLING MOVE");
                my_run = sc.nextInt();
                computer_move = y;
                computer_score += computer_move;
                while (my_run != computer_move) {
                    my_run = sc.nextInt();
                    computer_move = y;
                    computer_score += computer_move;
                    if (computer_move == 0) {
                        computer_score += my_run;
                    }
                    y = (int) (Math.random() * (range1 + 1) + min);
                }
                if(computer_score>=(my_score+1))
                {
                    System.out.println("TARGET RUNS REQUIRED : " + (my_score+1));
                    System.out.println("THE COMPUTER'S SCORE : " + computer_score);
                    System.out.println("YOU LOSE THE MATCH ");
                }
                else
                {
                    System.out.println("TARGET RUNS REQUIRED : " + (my_score+1));
                    System.out.println("THE COMPUTER'S SCORE : " + computer_score);
                    System.out.println("YOU WIN THE MATCH ");
                }
            }
        }
        sc.close();
    }
    public static void main(String[] args)
    {
        hand_cricket obj1 = new hand_cricket();
        obj1.process();
    }
}