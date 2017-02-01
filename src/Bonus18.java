import java.util.Scanner;
/**
 * Created by Coleman Alexander
 */
public class Bonus18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name;


        //Prints intro graphic
        String intro = "                ***     **   *    * ** *****\n"
                    +  "                *  *   *  *  **   * *    *  \n"
                    +  "                *  *  *    * * *  *      *  \n"
                    +  "                *  *  *    * *  * *      *  \n"
                    +  "                *  *   *  *  *   **      *  \n"
                    +  "                ***     **   *    *      *  \n"
                    +"\n"
                    + "                      ***  *****  ***** \n"
                    + "                      *  *   *    *      \n"
                    + "                      *  *   *    ****   \n"
                    + "                      *  *   *    *   \n"
                    + "                      *  *   *    *     \n"
                    + "                      ***  *****  *****";
        System.out.println(intro);
        System.out.println("                 CHOOSE YOUR OWN ADVENTURE!");


        //asks for user info and makes sure input is either a y or no
        System.out.println("                      WHAT IS YOUR NAME?");
        name = scan.nextLine();
        System.out.println("            ARE YOU SURE YOU WANT TO PLAY " + name + "?");
        System.out.println("                         START(y/n)?");
        String start = scan.nextLine();
        if(!start.equals("y") && !start.equals("n")){
            System.out.println("That was not an option. Try again!");
            start = scan.nextLine();
        }

        //First users choice.  Would you rather see or would you rather be able to fight?
        switch(start){
            case "y":
                System.out.println("What item will you choose to start with?\n"
                +     "Sword or Flashlight?");
                break;
            case "n":
                System.out.println("You have accepted defeat.");
                System.exit(1);
                break;
            default:
                break;
        }
            String tool = scan.nextLine();

        //prevents user from picking something other than the two options.
        if(!tool.equals("sword") && !tool.equals("flashlight")){
            System.out.println("You must pick one of these items: Sword or Flashlight");
            tool = scan.nextLine();
        }

        //Decision tree if user picks sword
        switch (tool){
            case "sword":
                System.out.println("You have chosen to fight first!");
                System.out.println("You enter the thick forrest. The trees rise high above you and about 20 paces in \n"
                + "you can barely see the sun peeking through the canopy. As the light fades, you hear a distant low rumble. \n"
                + "After a few minutes you barely make out a fork in the road.  Which way do you decide to go? \n"
                + "Left or Right?");
                String path = scan.nextLine();
                if(!path.equals("left")&&!path.equals("right")){
                    System.out.println("You must choose a path");
                    path = scan.nextLine();
                }

                //Decision tree user picks sword and the left path
                switch(path) {
                    case "left":
                        System.out.println("You trudge left, swinging your sword through the thicket in front of you \n"
                        +"walking slowly. You can barely see. After a few minutes it's so bad that you must use the \n"
                        +"sword to tap in front of you. Suddenly the sword is tapping air!\n"
                        + "You must have come upon some kind of cliff or pass. Who knows how far the drop is. You turn\n "
                        +" and begin to make you way back up the path. All of the sudden the distant rumbling begins \n"
                        +"to get closer. As the horrendous sound grows louder, you can't help but wonder if this is the\n"
                        +"famed monster in the woods. As the sound becomes deafening you wonder what would have \n"
                        +"have happened if you had been able to see.\n"
                        +"YOU ARE DEAD!!");
                        System.exit(1);
                        break;

                        //Decision tree user picks sword and right path
                    case "right":
                        System.out.println("You trudge right, swinging your sword through the thicket in front of you \n"
                        +"walking slowly. You can barely see.  After a few minutes it's so bad that you must use the \n"
                        +"sword to tap in front of you. Suddenly the low distant rumbling quickly begins to get louder.\n"
                        +"As the deafening noise grows louder and louder your one wish is that you could see. The\n"
                        +"outline of a figure comes lumbering into view. You pause, sword held high.  The figure dashes\n"
                        +"at you before you can swing\n"
                        +"YOU ARE DEAD!!");
                        System.exit(1);
                        break;
                    default:
                        break;
                }


            //Decision tree user picks flashlight
            case "flashlight":
                System.out.println("You have chosen to see in the dark first!");
                System.out.println("You enter the thick forrest. The trees rise high above you and about 20 paces in \n"
                +"you can barely see the sun peeking through the canopy. As the light fades, you hear a distant low rumble \n"
                +"and hastily switch on your flashlight. Just up ahead you see a sign showing a fork in the road.  \n"
                +"To the left shows a man falling.  To the right shows a terrible monster. You keep walking on and \n"
                +"sure enough after a few minutes you come to a fork in the road. Which way do you choose to go?\n"
                +"Left or Right?");
                path = scan.nextLine();
                if(!path.equals("left")&&!path.equals("right")){
                    System.out.println("You must choose a path");
                    path = scan.nextLine();
                }
                //Decision tree user picks flashlight and branches to left or right
                switch(path) {

                    //Decision tree user picks flashlight and left
                    //Only choice allowing user to win
                    case "left":
                        System.out.println("You trudge left, shining your flashlight across the path in front of you. \n"
                       +"You figure better to face gravity than to face a monster. After a few minutes you come across\n"
                       +"the gorge.  It stretches over a mile.  There's no way across and it is treacherous to climb\n"
                       + "You must have come upon some kind of cliff or pass. Who knows how far the drop is. You turn\n"
                       +"back to the path and all of the sudden the distant rumbling begins to get closer. Panicking slightly you \n"
                       +"look around, hopelessly searching for anything that could aid you against the monster. \n"
                       +"Your flashlight catches a glimmer and you see a sword next to a pile of bones.\n"
                       +"\"One of the monsters previous victims.\" you think to yourself.  The sound becomes \n"
                       +"deafening and the monster lumbers into view. Throwing the light to the ground to shine on the\n"
                       +"path you rush to the sword and as the monster charges for you, it impales itself on your weapon\n"
                       +"YOU HAVE WON THE GAME!!!\n"
                       +"CONGRATULATIONS " + name);
                        System.exit(1);
                        break;

                    //Decision tree user picks flashlight and right
                    case "right":
                        System.out.println("You trudge right, swinging the flashlight across the path in front of you. \n"
                        +"The path starts to grow more and more crooked even the rees become more menacing. Signs of the\n"
                        +"monsters work are strewn on either side of the path. The low distant rumbling quickly begins to get louder.\n"
                        +"As the deafening noise grows louder and louder your one wish is that maybe you had a weapon. The\n"
                        +"monster comes lumbering into view. You pause, light shining on it's face.  The figure dashes\n"
                        +"at you before you can turn and run.\n"
                        +"YOU ARE DEAD!!");
                        System.exit(1);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;



            }


        }

    }

