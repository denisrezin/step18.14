# Итак, это выполнение степа 18.14

ссылка на задание: https://stepik.org/lesson/1391051/step/1?auth=login&unit=1407770

Вам дан фрагмент кода, который выполняет операции над списком строк. 
Код написан в императивном стиле, использует изменяемые переменные и циклы. Ваша задача — преобразовать этот код в функциональный стиль. 
```
object StringProcessor {
  def processStrings(strings: List[String]): List[String] = {
    var result = List[String]()
    for (str <- strings) {
      if (str.length > 3) {
        result = result :+ str.toUpperCase
      }
    }
    result
  }

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}
```

## Описание репозитория
* Файл main.scala

Собственно, исполняемый файл, приведён изначальный код и отредактированный код.

## Что изменено
* убраны заранее определённые переменные
* убраны циклы
* исправлена главная функция processStrings - зашит опциональный параметр l, отвечающий за длину фильтрации списка. По умолчанию равен 3
* функция processStrings использует функции высшего порядка filter и map
* создан extends App, чтобы код выполнялся автоматически
* убрана функция main
