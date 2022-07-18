

object Question5 
{
  def main(args: Array[String])
  {
    def easy(r:Int) : Int = r*8;
    def tempo(r:Int) : Int = r*7;
    println(easy(2) + tempo(3) + easy(2));
  }
}