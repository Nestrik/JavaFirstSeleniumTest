# Подготовка окружения
## Java
jdk какой-то (последней) версии, прописать в PATH
Скачать и установить maven

## Создание проекта
Создать проект из архитипа с помощью maven:
```
mvn archetype:generate -DarchetypeGroupId=ru.stqa.selenium -DarchetypeArtifactId=webdriver-testng-archetype -DarchetypeVersion=2.0 -DgroupId=com.example -DartifactId=my_example_project
```
[источник](https://selenium2.ru/articles/117-maven-selenium-archetypes.html)

Сконфигурировать IDE: 
[источник](http://www.autotest.org.ua/perviy-autotest-s-selenium-webdriver-i-java-chast-2/)
```
Open Module Settings >>> Language level >>> 8.0
Settings >>> «Build, Execution, Deployment» -> «Compiler» -> «Java Compiler» >>> 1.8
```

# Простейший тест
Размещение кода тестов и пэйджей: 
```
src/test/java/<groupId>/pages
src/test/java/<groupId>/tests
```

Основноые оптимизации: 
1. Использование page-object паттерна (совместно с PageFactory)
2. Нотации JUnit для тестов
3. Вынос управления браузером в базовый абстрактный класс