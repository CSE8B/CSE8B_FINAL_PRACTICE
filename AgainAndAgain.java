public class AgainAndAgain
{
  public static void main(String[]args)
  {
    again(5.0);
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
