public class AgainAndAgain
{
  public static void main(String[]args)
  {
    for(double i = 0; i < 5.0; i++)
       again(i);
  }

  public static void again(double d)
  {
    System.out.println(d+1);
    if(d > 1.0)
      again(d-1);
    System.out.println(d-1);
    if(d%2 == 0 && d > 0)
      again(d-2);
    System.out.println(d-2);
  }
}
