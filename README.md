# **Программа Sales Manager**


## Что она делает?

Выводит на экран информацию в виде текста о лучшем результате работы конкретного сотрудника.

## Как ей пользоваться?
1. Создайте экземпляр класса SalesManager, указав в качестве параметров имя сотрудника и результаты его продаж в виде массива целых чисел: 


    ```java
    SalesManager manager1 = new SalesManager("Иван Иванов", new int[]{10, 40, 60});
    ```
    Вы можете создать сколько угодно экземпляров класса SalesManager:

    ```java
    SalesManager manager2 = new SalesManager("Петр Петров", new int[]{30, 4, 1} );

    SalesManager manager3 = new SalesManager("Мария Сидорова", new int[]{10, 5, 10});
    //..........
    ```

1. Вызовите метод toString() у интересующего вас экземпляра класса:
    ```java
    System.out.println(manager2.toString());

    ```


## Результат работы
Результат работы отобразится на экране в виде строки: 

*Максимальная продажа менеджера Петр Петров cоставляет 30 единиц товара.*