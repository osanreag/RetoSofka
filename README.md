# RetoSofka
# Quien quiere ser millonario. 
Este es un juego que imita al reconocido programa presentado en varios paises. Esta diseñado en el leguaje de programacion java y es con la finalidad de presentar el reto de la empresa Sofka. 

# Comentarios
Para este programa se uso una base de datos local, el codigo para la creacion de la base de datos fue realizado en MySQL en PhpMyAdmin y esta escrito a continuacion. 
CREATE TABLE `juego_preguntas`.`jugadores` ( `id` INT(11) NOT NULL AUTO_INCREMENT , `nombre` VARCHAR(50) NOT NULL , `documento` VARCHAR(12) NOT NULL , `puntos` INT(10) NOT NULL , PRIMARY KEY (`id`)) ENGINE = MyISAM;  

Este programa almacena la informacion de dos maneras en un txt y en una base de datos. 
Hay un par de metodos comentados, los cuales se dejaron de esta manera, por que asi el usuario debia ingresar todas las preguntas y respuestas cada que se ejecutaba el juego. Por lo tanto se vuelve una tarea tediosa. 

# Elaborado por Oscar Regino
