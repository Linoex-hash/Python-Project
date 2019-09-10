class D
{
  int x;
  public D(int x)
  {
   this.x=x;
  }
  public int findY(int Slope, int Yint)
  {
   return Slope*x + Yint;
  }
}
class Main
{
  public static void main(String[] args)
  {
  D d=new D(5);
  System.out.println(d.findY(4,7));
  }
}