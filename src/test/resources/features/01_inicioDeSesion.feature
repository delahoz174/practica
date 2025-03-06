# language: es

Característica: Inicio de sesion
    Como usuario del sistema
    Quiero ingresar con mis credenciales
    Para acceder a la plataforma


    Escenario: Login no exitoso
        Dado que el usuario abre la pagina de inicio de sesion
        Cuando ingrese credenciales no validas
        Entonces deberia ver el error "Invalid credentials"


    Escenario: Login exitoso
        Dado que el usuario abre la pagina de inicio de sesion
        Cuando ingrese las credenciales validas
        Entonces deberia ver el texto "Dashboard"

