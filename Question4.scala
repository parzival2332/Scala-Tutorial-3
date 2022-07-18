

object Question4 
{
  def main(args: Array[String])
  {
    def BookPriceAfterDiscount(x:Double) : Double = x*24.95*0.6;
    def ShippingCost(x:Int) : Double = 3*x+(x-50)*0.75;
    println(BookPriceAfterDiscount(60) + ShippingCost(60)); 
  }
}