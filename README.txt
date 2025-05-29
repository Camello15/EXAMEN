--CAMILO VELEPUCHA
--PROMPTS EXAMEN


--1er prompt:
Eres el mejor programador avanzado y tienes que simular un partido de tenis de 16 jugadores con eliminatoria instantánea, es decir que el que pierde queda eliminado para siempre, son octavos, cuartos, semifinales y finales. 
Los partidos son de 3 sets y gana el que tiene 2 victorias, se avanza al siguiente partido y queda eliminado el perdedor. Las rondas se juegan en simultaneo, y asi mismo la siguiente ronda inicia cuando todos los partidos de la ronda actual han terminado. 
Cada set se gana aleatoriamente, se muestra el ganador de cada set y el resultado final del partido. 
Te voy a dar unas cuantas ideas que tuve para poder desarrollar este programa en java maven: Pense que con un Random podriamos simular la aleatoriedad del partido y el jugador que saque el numero mas alto gana, 
también que se comparen 2 variables (ejm: Ronda) entre 2 jugadores y el que tenga las 2 victorias gana, asi mismo no estaba seguro si sale mejor tener un hilo por cada partido(creo que es lo mejor) o tener un hilo por cada jugador, 
pense tambien en usar el future o callable para que se espere a que todos los demas hilos terminen de ejecutarse. Todo esto son unas simples ideas y si crees que hay mejores maneras o metodos de sacar el resultado adelante. 
Recuerda que el programa debe mostrar una sección que sea en paralelo y la seccion que se ejecute de forma simultanea, tiene que tener el uso de callable, future, Executor service, simular partidos con hasta 3 sets con resultados visibles por set, 
tambien simular el tiempo de duracion de cada partido en un rango entre 1.5 y 2 segundos, realizar la implementacion necesaria y facil de entender.



--2do promt:
Necesito que hagas unos arreglos al codigo ya que presenta de manera desordenada ===== CUARTOS DE FINAL =====
Jugador 2 vs Jugador 3
Jugador 5 vs Jugador 7
Jugador 10 vs Jugador 11
Jugador 14 vs Jugador 15
Set 1: Jugador 3
Set 1: Jugador 14
Set 1: Jugador 5
Set 1: Jugador 11
Set 2: Jugador 15
Set 2: Jugador 7
Set 2: Jugador 3
Ganador del partido: Jugador 3

Set 2: Jugador 11
Ganador del partido: Jugador 11

Set 3: Jugador 14
Ganador del partido: Jugador 14

Set 3: Jugador 7
Ganador del partido: Jugador 7  y buscamos presentar tal que asi: ===== CUARTOS DE FINAL =====
Jugador 1 vs Jugador 2
Set 1: Jugador 1
Set 2: Jugador 1
Ganador del partido: Jugador 1

Jugador 14 vs Jugador 4
Set 1: Jugador 14
Set 2: Jugador 4
Set 3: Jugador 14
Ganador del partido: Jugador 14


--3er Prompt:
ok ya esta lo unico que falta es agregar la simulacion por tiempo de cada partido en un rango comprendido entre 1.5 y 2 segundos 


-- 4to prompt:
Perfecto, como ultima correcion el maximo que puede durar un partido es de 2 segundos y hay partidos que duraron 5
