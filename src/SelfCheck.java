import java.util.Scanner;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SelfCheck
{
    private static PrintStream console;
    private static Scanner scan;


    public static void testStarString()
    {
        int[] inputs = {-5, 0, 1, 2, 3, 4};
        String[] results = {"",
                "*",
                "**",
                "****",
                "********",
                "****************"};

        for(int i = 0; i < inputs.length; i++)
        {
            int input = inputs[i];
            String result = results[i];

            // CHANGE THIS LINE
            String fromCode = ProblemA.starString(input);

            if(result.equals(fromCode))
            {
                System.out.println("Test starString("+input+") passed.");
            }
            else
            {
                System.out.println("Test starString("+input+") failed.");
                System.out.println("Expected: " + result);
                System.out.println("Got:      " + fromCode);
            }

        }
    }



    public static void testPrintSequence()
    {
        int[] inputs = {-5, 0, 1, 2, 3, 4, 8, 9};
        String[] results = {"",
                "",
                "1",
                "1 1",
                "2 1 2",
                "2 1 1 2",
                "4 3 2 1 1 2 3 4",
                "5 4 3 2 1 2 3 4 5"};


        for(int i = 0; i < inputs.length; i++)
        {
            int input = inputs[i];
            String result = results[i];

            // Re-route console output.
            PrintStream normal = System.out;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            // CHANGE THIS LINE
            ProblemB.printSequence(input);


            String fromCode = out.toString();
            System.setOut(normal);

            if(result.equals(fromCode))
            {
                System.out.println("Test starString("+input+") passed.");
            }
            else
            {
                System.out.println("Test starString("+input+") failed.");
                System.out.println("Expected: " + result);
                System.out.println("Got:      " + fromCode);
            }

        }
    }


    public static void main(String[] args)
    {
        scan = new Scanner(System.in);
        console = System.out;

        testStarString();
        testPrintSequence();

        System.out.println("Which mystery would you like to check?");
        System.out.println("(1-5, or \"a\" for all)");
        String choice = scan.nextLine();

        if(choice.equals("1"))
        {
            if(check1())
            {
                System.out.println("All correct on mystery1");
            }
        }
        else if(choice.equals("2"))
        {
            if(check2())
            {
                System.out.println("All correct on mystery2");
            }
        }

        else if(choice.equals("3"))
        {
            if(check3())
            {
                System.out.println("All correct on mystery3");
            }
        }

        else if(choice.equals("4"))
        {
            if(check4())
            {
                System.out.println("All correct on mystery3");
            }
        }
        else if(choice.equals("5"))
        {
            if(check5())
            {
                System.out.println("All correct on mystery3");
            }
        }
        else if(choice.equals("a"))
        {
            int countCorrect = 0;
            if(check1())
            {
                countCorrect++;
            }
            if(check2())
            {
                countCorrect++;
            }
            if(check3())
            {
                countCorrect++;
            }
            if(check4())
            {
                countCorrect++;
            }
            if(check5())
            {
                countCorrect++;
            }

            if(countCorrect == 5)
            {
                System.out.println("You got them all completely correct, show this to your teacher!");

            }
        }
        else
        {
            System.out.println("1-6 or \"a\" only");
        }






    }

    public static boolean check1()
    {
        int[] inputs = {1, 2, 5};
        int countCorrect = 0;

        for(int input: inputs)
        {

            System.out.println("What is the console output from the call mystery1("+input+")");
            String response = scan.nextLine();

            // Re-route console output.
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));
            Mysteries.mystery1(input);
            String result = out.toString();
            setConsoleOut();

            if(result.equals(response))
            {
                System.out.println("Correct!");
                countCorrect++;
            }
            else
            {
                System.out.println("Incorrect");
            }

        }

        System.out.println("You got " + countCorrect + " out of " + inputs.length + " correct.");
        return countCorrect == inputs.length;


    }


    public static boolean check2()
    {
        int[] inputs = {1, 4, 30};
        int countCorrect = 0;

        for(int input: inputs)
        {

            System.out.println("What is the console output from the method call mystery2("+input+")");
            String response = scan.nextLine();

            // Re-route console output.
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));
            Mysteries.mystery2(input);
            String result = out.toString();
            setConsoleOut();

            if(result.equals(response))
            {
                System.out.println("Correct!");
                countCorrect++;
            }
            else
            {
                System.out.println("Incorrect");
            }

        }

        System.out.println("You got " + countCorrect + " out of " + inputs.length + " correct.");
        return countCorrect == inputs.length;


    }


    public static boolean check3()
    {
        int[] inputs = {0, 1, 2, 5};
        int countCorrect = 0;

        for(int input: inputs)
        {

            System.out.println("What is the console output from the call mystery3("+input+")");
            String response = scan.nextLine();

            // Re-route console output.
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));
            Mysteries.mystery3(input);
            String result = out.toString();
            setConsoleOut();

            if(result.equals(response))
            {
                System.out.println("Correct!");
                countCorrect++;
            }
            else
            {
                System.out.println("Incorrect");
            }

        }

        System.out.println("You got " + countCorrect + " out of " + inputs.length + " correct.");
        return countCorrect == inputs.length;


    }

    public static boolean check4()
    {
        int[][] inputs = {{6, 13},
                {17, 10},
                {37, 10},
                {37, 12}};
        int countCorrect = 0;

        for(int[] input: inputs)
        {

            System.out.println("What is the returned value from the call mystery4("+input[0]+", "+input[1]+")");
            int response = scan.nextInt();
            scan.nextLine(); // clear the buffer for the next input

            // Re-route console output.
            int result = Mysteries.mystery4(input[0], input[1]);

            if(result == response)
            {
                System.out.println("Correct!");
                countCorrect++;
            }
            else
            {
                System.out.println("Incorrect");
            }

        }

        System.out.println("You got " + countCorrect + " out of " + inputs.length + " correct.");
        return countCorrect == inputs.length;



    }

    public static boolean check5()
    {
        int[] inputs = {28, 132, -410, 52101};
        int countCorrect = 0;

        for(int input: inputs)
        {

            System.out.println("What is the returned value from the call mystery5("+input+")");
            int response = scan.nextInt();
            scan.nextLine(); // clear the buffer for the next input

            // Re-route console output.
            int result = Mysteries.mystery5(input);

            if(result == response)
            {
                System.out.println("Correct!");
                countCorrect++;
            }
            else
            {
                System.out.println("Incorrect");
            }

        }

        System.out.println("You got " + countCorrect + " out of " + inputs.length + " correct.");
        return countCorrect == inputs.length;



    }

    public static void setConsoleOut()
    {
        System.setOut(console);
    }
}