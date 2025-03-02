# Serenity BDD project using Cucumber and Screenplay 

01/03/2025

* Screenplay Pattern es un patrón de diseño que enfoca las pruebas en las acciones que un actor realiza en el sistema.
* Las pruebas son más legibles, modulares y mantenibles.
* Se abstraen las interacciones de los elementos de la interfaz y se combinan en tareas reutilizables.<br>
Fomenta una separación clara de responsabilidades y es altamente escalable.
Este patrón se usa principalmente en herramientas como Serenity BDD, Cucumber o JBehave, para escribir pruebas de automatización que sean fáciles de entender y de mantener.

### Prerequisites
* Java 17 installed
* Gradle  (Suggested version 7.5.1)
* IDE installed (Suggested IntelliJ IDEA 2022.2)
* Sourcetree
* Google Chrome installed

### Basic Commands

To run a specific Runner
`gradle clean test --parallel`


### Bugs login
id:1<br>
titulo: login no tiene la opcion de registrarse<br>
Descripcion: El login necesita la opcion de registro para poder acceder a una cuenta para realizar las pruebas de login<br>
Pasos: <br>
       1. ingresar a la siguietne url "https://demos.devexpress.com/rwa/dxhotels/"<br>
       2. Dar clic en el boton login
Resultado esperado: ver el boton de registrese<br>
Resultado actual: No esta implementada esta opcion<br>
Prioridad: Alta<br>
Impacto: usuarios no pueden realizar login en la plataforma de dxhotels<br>
Estado: Abierto

id:2<br>
titulo: login tiene captcha<br>
Descripcion: Para realizar un login exitoso o fallido dentro de la aplicacion el login no debe tener captcha, por que la automatizacion no es capaz de mapear dicho campo por que es un campo de seguridad.<br>
Pasos:<br> 
       1. ingresar a la siguietne url "https://demos.devexpress.com/rwa/dxhotels/"<br>
       2. Dar clic en el boton login<br>
	   3. ingresar usuarios<br>
	   4. Ingresar contraseña
Resultado esperado: dar clic en Login e ingresar a la pagina<br>
Resultado actual: cuanta con captcha y al dar clic en el login nos sale este mensaje "The submitted code is incorrect"<br>
Prioridad: Alta<br>
Impacto: usuarios no pueden realizar login en la plataforma de dxhotels<br>
Estado: Abierto

### Bugs proceso de compras
id:3<br>
titulo: dar clic en el comprar nos deja en una pantalla negra<br>
Descripcion: Al realizar el proceso de compra del producto nos esta saliendo una pantalla negra y no sale mensaje de exito<br>
Pasos: <br>
       1. ingresar a la siguietne url "https://demos.devexpress.com/rwa/dxhotels/"<br>
       2. Ingresar la informacion de la reserva: [Paris, fechaActualMasDosDiasMas, fechaActualMasSieteDiasMas, Habitaciones: 2, adultos: 3, Niños: 2]
	   3. Dar clic en buscar
	   4. Filtrar los elementos por hoteles de 3 o mas estrellas y que su precio sea mayor a 200
	   5. Dar clic en el boton Book It
	   6. Dar clic en el boton Print Invoce
Resultado esperado: ver el mensaje de exito<br>
Resultado actual: No esta desplegando una pantalla negra<br>
Prioridad: Alta<br>
Impacto: usuarios no pueden realizar compras en la plataforma de dxhotels<br>
Estado: Abierto

id:4<br>
titulo: precio oferta diferente a pago factura<br>
Descripcion: Al realizar el proceso de compra del producto estamos obteneniendo una diferencia entre el precio de la oferta y el precio a pagar
Pasos: <br>
       1. ingresar a la siguietne url "https://demos.devexpress.com/rwa/dxhotels/"<br>
       2. Ingresar la informacion de la reserva: [Paris, fechaActualMasDosDiasMas, fechaActualMasSieteDiasMas, Habitaciones: 2, adultos: 3, Niños: 2]
	   3. Dar clic en buscar
	   4. Filtrar los elementos por hoteles de 3 o mas estrellas y que su precio sea mayor a 200
	   5. Dar clic en el boton Book It
Resultado esperado: el precio de venta es el mismo a la hora del pago<br>
Resultado actual: El valor de oferta es diferente al del pago<br>
Prioridad: Alta<br>
Impacto: usuarios se confunden con el precio real del articulo<br>
Estado: Abierto

id:5<br>
titulo: no esta aplicando bien el filtro de los precios<br>
Descripcion: Al realizar el proceso de filtrado de un producto podemos ver que no saca los valores de manera correcta
Pasos: <br>
       1. ingresar a la siguietne url "https://demos.devexpress.com/rwa/dxhotels/"<br>
       2. Ingresar la informacion de la reserva: [Paris, fechaActualMasDosDiasMas, fechaActualMasSieteDiasMas, Habitaciones: 2, adultos: 3, Niños: 2]
	   3. Dar clic en buscar
	   4. Filtrar los elementos por hoteles de 3 o mas estrellas y que su precio sea mayor a 200
Resultado esperado: Ninguno de los elementos debe estar por fuera del filtro<br>
Resultado actual: Esta mostrando un producto que no cumple con el filtro<br>
Prioridad: Alta<br>
Impacto: usuarios se confunden con la lista filtrada por precio<br>
Estado: Abierto


