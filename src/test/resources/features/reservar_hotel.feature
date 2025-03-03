#language: es
Característica: Como analista de automatizacion de pruebas o desarrollador
  Quiero probar la reserva de hotel
  Para verificar la calidad del desarrollo realizado

  Esquema del escenario: validar reserva hotel
    Dado que el usuario ingreso a la pagina de dxhotels
    Cuando procede a llegar los datos de la reservacion
      | posicion_habitaciones   | adultos   | childs   | ciudad   | dias_ida   | dias_vuelta   |
      | <posicion_habitaciones> | <adultos> | <childs> | <ciudad> | <dias_ida> | <dias_vuelta> |
    Y realizar los filtros
    Y escoger el hotel de precio mas bajo
    Y llenar la informacion de la reserva
    Entonces el sistema debera mostrar el siguente "<mensaje>"

    Ejemplos:
      | posicion_habitaciones | adultos | childs | ciudad | dias_ida | dias_vuelta |
      | 36                    | 3       | 2      | Paris  | 2        | 7           |

  Esquema del escenario: Validar campos ciudad
    Dado que el usuario ingreso a la pagina de dxhotels
    Cuando procede a llegar los datos de la reservacion
      | posicion_habitaciones   | adultos   | childs   | ciudad   | dias_ida   | dias_vuelta   |
      | <posicion_habitaciones> | <adultos> | <childs> | <ciudad> | <dias_ida> | <dias_vuelta> |
    Entonces se valida que muestre el siguiente mensaje

    Ejemplos:
      | posicion_habitaciones | adultos | childs | ciudad | dias_ida | dias_vuelta |
    #  | 6                     | 3       | 2      |        | 2        | 7           |

  Esquema del escenario: Validar campos checkin y checkout
    Dado que el usuario ingreso a la pagina de dxhotels
    Cuando procede a llegar los datos de la reservacion
      | posicion_habitaciones   | adultos   | childs   | ciudad   | dias_ida   | dias_vuelta   |
      | <posicion_habitaciones> | <adultos> | <childs> | <ciudad> | <dias_ida> | <dias_vuelta> |
    Entonces se valida que concuerden con el "<mensaje>"

    Ejemplos:
      | posicion_habitaciones | adultos | childs | ciudad | dias_ida | dias_vuelta | mensaje                    |
  #    | 36                    | 3       | 2      | Paris  |          | 7           | Check in date is required  |
    #  | 36                    | 3       | 2      | Paris  | 2        |             | Check out date is required |