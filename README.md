##Пример приложения-очереди с использование ActiveMQ

----

###Сборка приложения ( в корне проекта ) при помощи команды:
`gradle build`

###Запуск:
` docker compose up`

###Отправка сообщения: 
`curl --location --request POST '127.0.0.1:8080/api/message' \
--header 'Content-Type: application/json' \
--data-raw '{
    "text": "Hello World!"
}'`
 
#### Посмотреть очереди можно перейдя по `http://localhost:8161/admin/` пароль `admin/admin`