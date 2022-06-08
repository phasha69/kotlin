# Задача

## Цель домашнего задания

* Попрактиковаться в работе с коллекциями: списками, множествами, представлениями.

## Что нужно сделать

Разработайте консольную программу, имитирующую работу телефонного справочника.

1. Введите число N с клавиатуры. Вводимые символы должны проверяться на соответствие условию N > 0. В случае
   невыполнения условия программа должна указывать на ошибку ввода и предлагать ввести число до тех пор, пока не будет
   введено корректное значение.
2. Введите следующие N телефонных номеров пользователей. Каждый номер должен представлять из себя строку.
3. Сохраните введённые номера в список. Используйте для этого MutableList. Заносите в него значения с помощью цикла.
4. Вынесите шаги 2 и 3 в функцию, которая принимает число N и возвращает список из N номеров телефонов, введённых с
   клавиатуры.
5. Выведите в консоль только номера телефонов, начинающиеся с приставки +7. Для этого отфильтруйте список с помощью
   функции filter и распечатайте его.
6. Выведите в консоль количество уникальных введённых номеров. Для этого преобразуйте список в множество c помощью
   функции toSet() и получите размер множества size.
7. Вычислите и распечатайте сумму длин всех номеров телефонов с помощью агрегирующей функции коллекции sumOf.
8. Создайте изменяемое представление — MutableMap. Для каждого уникального номера из множества введите имя человека и
   заполните Map так, чтобы в качестве ключа выступал номер телефона, а в качестве значения — введённое с консоли имя
   человека.
   ## Пример работы:

Введите имя человека с номером телефона +79110123456: Андрей

Введите имя человека с номером телефона +79229876543: Олег

По окончании ввода Map должно содержать записи:

      (key=+79110123456, value:Андрей)
      (key=+79229876543, value:Олег)

### Выведите содержимое Map в консоль в следующем виде:

      Абонент: Андрей. Номер телефона: +79110123456 
      Абонент: Олег. Номер телефона: +79229876543 

9. *По желанию выведите содержимое Map, отсортированное по номерам телефона.
10. *По желанию выведите содержимое Map, отсортированное по имени абонента.