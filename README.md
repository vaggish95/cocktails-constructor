# Конструктор Коктейлей 

## Цель создания проекта 
Настоящий проект создан для демонстрации навыков программирования потенциальным работодателям, а также для получения дополнительного практического
опыта создания Web - приложений. 

## Практическая применимость проекта
Одной из основных проблем, с которыми сталкивается бармен в своей работе, является ситуация, когда гость заведения просит сделать ему
коктейль, но при этом не называет точное название напитка, а описывает его вкусовые качества или входящие в него ингредиенты. 
Настоящее Web - приложение поможет подобрать коктейль на основе введеных критериев.

## Текстовое описание проекта. 
Проект содержит 5 страниц: 
1. Основная страница
2. Страница авторизации 
3. Страница регистрации нового пользователя 
4. Личный кабинет 
5. Страница смены пароля 
6. Страница с информацией о проекте. 

### Основная страница 
На основной странице осуществляется формирование запроса (выбор нужных ингредиентов + выбор способа поиска) и вывод полученного результата пользователю. 
При нажатии на наименование коктейля пользователь будет перенаправлен на страницу Международной ассоциации барменов, где будет более полная информация о напитке. 
Также через основную страницу можно авторизоваться, после чего будет доступна возможность добавлять коктейли в свой собственный список избранных коктейлей.
Кроме того, на основной странице указаны способы связи с создателем проекта, нажав на которые, приложение автоматически перенаправит пользователя в нужную социальную сеть. 

<img width="1133" alt="Снимок экрана 2022-06-29 в 04 07 16" src="https://user-images.githubusercontent.com/71041467/176330364-347cc891-742c-455b-b87c-61629c37e5cf.png">
 
 <img width="949" alt="Снимок экрана 2022-06-29 в 04 08 38" src="https://user-images.githubusercontent.com/71041467/176330481-57c8c5f0-1593-4aa7-8e0d-6c5baa82fe63.png">

### Страницы авторизации, регистрации и смены пароля 
На этоих страницах происходит создание новых пользователей, их авторизация и смена существующих паролей. При смене пароля или создании нового пользователя 
новый пароль и повтор пароля будут проверены на идентичность, в случаи если пароли будут разными - будет показана ошибка. Все поля обязательны к заполнению, 
в противном случае форма заполнения не отправиться. Также осуществляется проверка на наличие уже существующих пользователей с аналогичным e-mail адресом, в случаи 
нахождении такого пользователя будет предложено ввести другой e-mail адрес 

<img width="938" alt="Снимок экрана 2022-06-29 в 04 10 03" src="https://user-images.githubusercontent.com/71041467/176331342-981e9dd2-4f6b-4127-bc62-28f0e0858732.png">

<img width="946" alt="Снимок экрана 2022-06-29 в 04 09 43" src="https://user-images.githubusercontent.com/71041467/176331359-c207bcc7-92fb-4701-9a65-0e6379bf697c.png">

### Личный кабинет 
Основное предназначение личного кабинета - хранить список избранных коктейлей пользователя, а также обеспечить сокрытие этого списка от других пользователей. 
Пользователю представляется возможностьудалить свою страницу, а также в случае необходимости связаться со службой поддержки. 

<img width="1243" alt="Снимок экрана 2022-06-29 в 04 11 08" src="https://user-images.githubusercontent.com/71041467/176331626-5f8a10f2-b195-4f5d-8c5e-d9803c02c416.png">

### Страница с информацией 
Дает краткое описание проекта 

<img width="1243" alt="Снимок экрана 2022-06-29 в 04 11 37" src="https://user-images.githubusercontent.com/71041467/176331680-b692a901-1a16-400e-9b9c-8f094f1ab960.png">


## Техническая информация
### Стэк технологий: 
1. Java (JDK 17)
2. Spring Boot 
3. Spring Security 
4. Spring Data 
5. PostgreSQL 
6. HTML 
7. CSS 
8. Maven 

