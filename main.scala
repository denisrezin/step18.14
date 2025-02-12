// object Main {
//     def main(args: Array[String]): Unit = {
//         var age: Int = 25
//         age = 30
//         println(age)
//     }
// }



// object InventoryManagement extends App {
//   var apples: Int = 100
//   var oranges: Int = 50
//   val storeName: String = "Магазин фруктов"

//   println(s"Первоначальная инвентаризация: Яблоки: $apples, Апельсин: $oranges")
//   println(s"Название магазина: $storeName")

//   apples -= 10
//   oranges += 20

//   println(s"Обновленный инвентарь: Яблоки: $apples, Апельсин: $oranges")

//   // Попробуйте изменить значение storeName
//   // storeName = "New Fruit Shop"
//   // Ошибка: переменная 'storeName' не может быть изменена
// }




// object StudentGrades extends App {
//   val studentName: String = "Alice"
//   var mathGrade: Int = 90
//   var scienceGrade: Int = 85
//   var literatureGrade: Int = 88

//   var averageGrade: Double = (mathGrade + scienceGrade + literatureGrade) / 3.0

//   println(s"Студент: $studentName")
//   println(s"Математика: $mathGrade, Наука: $scienceGrade, Литература: $literatureGrade")
//   println(f"Средний балл: $averageGrade%.2f")
// }



// object LazyInitialization extends App {
//   lazy val data: String = {
//     println("Loading data...")
//     "Lazy data"
//   }

//   println("Before accessing 'data'")

//   // Первый вызов переменной 'data'
//   println(data)

//   println("After accessing 'data'")

//   // Повторный вызов переменной 'data'
//   println(data)
// }


// object ShoppingList extends App {
//   val shoppingList: List[String] = List("Молоко", "Хлеб", "Яблоки")

//   // Добавление "Сыра" в начало списка покупок
//   val updatedList = "Сыр" :: shoppingList

//   println("Список покупок:")
//   println(updatedList) 
// }


// object ArrayExample extends App {
//   val numbers = Array(1, 2, 3, 4, 5)

//   // Изменение третьего элемента на 10
//   numbers(2) = 10

//   println("Измененный массив:")
//   for (number <- numbers) {
//     println(number)
//   }
// }


// import scala.collection.mutable.Set

// object MutableSetExample extends App {
//   val mutableSet = Set(1, 2, 3, 4)

//   // Добавляет 5
//   mutableSet += 5

//   // Удаляет 3
//   mutableSet -= 3

//   println("Измененное множество:")
//   println(mutableSet)
// }


// object Check extends App {
//     def sumToN(n: Int): Int = {
//       var sum = 0
//       var i = 1
//       while (i <= n) {
//         sum += i
//         i += 1
//       }
//       sum
//     }

//     println(sumToN(3))
// }



// import scala.io.StdIn.readLine

// object CheckEvenOdd extends App {
//   //Получение целого числа от пользователя
//   val number = readLine("").toInt

//   //Проверка на четность
//   if (number % 2 == 0) {
//     println(s"Число $number является четным")
//   } else {
//     println(s"Число $number является нечетным")
//   }
// }


// import scala.io.StdIn.readLine


// object MaxOfThree extends App {
//   //Получение целых числел от пользователя
//   val num1 = readLine("").toInt
//   val num2 = readLine("").toInt
//   val num3 = readLine("").toInt

//   //Выявление максимального числа
//   if (num1 > num2 && num1 > num3) {
//     println(num1)
//   } else {
//     if (num2 > num1 && num2 > num3) {
//         println(num2)
//     } else {
//         if (num3 > num1 && num3 > num2) {
//             println(num3)
//         }
//     }
//   }
// }


// object PrintNumbersFor extends App {
//   //Получение значений от пользователя
//   val n = io.StdIn.readLine("").toInt
//   val step = io.StdIn.readLine("").toInt

//   //Основной цикл вывода
//   for (i <- 1 to n by step) {
//     println(i)
//   }
// }



// object FactorialWhile extends App {
//   //Получение целого числа от пользователя
//   val number = io.StdIn.readLong()

//   //Вычисление факториала
//   var i = 1
//   var result = 1
//   while (i <= number) {
//     result = result * i
//     i += 1
//   }
//   println(result)
// }


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

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}


object MyStringProcessor extends App {
  def processStrings(strings: List[String], l: Int = 3): List[String] = {
    strings.filter(_.length > l).map(_.toUpperCase)
  }

  val strings = List("apple", "cat", "banana", "dog", "elephant")
  // val my_processed_Strings = processStrings(strings)
  val my_processed_Strings = processStrings(strings, 5)
  println(s"Processed strings: $my_processed_Strings")
}

