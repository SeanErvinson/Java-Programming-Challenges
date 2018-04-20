/*
* ONG, Sean Ervinson C.
* ICS 112 7-11A (M to F)
*/

public class MailManProblem_ONG_SEAN
{
	public static void main(String args[])
	{
	   boolean[] mailBox = new boolean[101];

     for(int i = 1; i <= mailBox.length; i++)
     {
       for(int j = i; j < mailBox.length; j+=i)
       {
				 mailBox[j] = j % i == 0 ? !mailBox[j] : mailBox[j];
       }
     }
     for(int j = 0; j < mailBox.length; j++)
     {
       if(mailBox[j])
         System.out.println("Mailbox " + j + " is open");
     }

  }
}
