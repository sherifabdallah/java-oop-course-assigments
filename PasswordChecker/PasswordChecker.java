import java.util.Scanner;
public  class PasswordChecker
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String password = input.next();

        boolean isValid = true;
        int numdigit = 0;

        if(password.length() >= 8)
        {
            // ahmed1234 -> length = 9
            for(int i = 0; i < password.length(); i++) // 0 -> 8
            {
                char ch = password.charAt(i);
                if(Character.isLetterOrDigit(ch))
                {
                    if(Character.isDigit(ch))
                    {
                        numdigit++;
                    }
                }
                else {
                    isValid = false;
                    break;
                }
            }

            if(isValid && numdigit < 2) {
                isValid = false;
            }
        }
        else
        {
            isValid = false;
        }

        if(isValid) {
            System.out.println("Your password is correct");
        } else {
            System.out.println("Your password is incorrect");
        }
    }
}
