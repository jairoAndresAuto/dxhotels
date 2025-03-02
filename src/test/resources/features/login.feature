#language: es
Característica: Como analista de automatizacion de pruebas o desarrollador
  Quiero probar el iniciar de sesion de la aplicacion
  Para verificar la calidad del desarrollo realizado

  Esquema del escenario: Validar que al ingresar el usuario
    Dado que el usuario ingreso a la pagina de dxhotels
    Cuando que el usuario procede a loguearse en la pagina
      | usuario   | contrasenia   |
      | <usuario> | <contrasenia> |
    Entonces el sistema debera mostrar el siguente "<mensaje>"

    Ejemplos:
      | usuario         | contrasenia | mensaje |
      | jairo@gmail.com | Andres123.  |         |
