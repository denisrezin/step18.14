// Это изначальный код, его можно раскомментировать и посмотреть
// object StringProcessor {
//   def processStrings(strings: List[String]): List[String] = {
//     var result = List[String]()
//     for (str <- strings) {
//       if (str.length > 3) {
//         result = result :+ str.toUpperCase
//       }
//     }
//     result
//   }
//
//  def main(args: Array[String]): Unit = {
//    val strings = List("apple", "cat", "banana", "dog", "elephant")
//    val processedStrings = processStrings(strings)
//    println(s"Processed strings: $processedStrings")
//  }
// }


// Это мой исправленный код
object MyStringProcessor extends App {
  def processStrings(strings: List[String], l: Int = 3): List[String] = {
    strings.filter(_.length > l).map(_.toUpperCase)
  }

  val strings = List("apple", "cat", "banana", "dog", "elephant")
  // val my_processed_Strings = processStrings(strings)
  val my_processed_Strings = processStrings(strings, 5)
  println(s"Processed strings: $my_processed_Strings")
}

