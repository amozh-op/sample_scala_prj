import java.util.{Date, Locale}
import java.text.DateFormat._

/**
  * Created by amozh on 5/24/16.
  */
object AppleApp {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}
