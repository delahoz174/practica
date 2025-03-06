# practicascreenplay_N2
# Descripción
Este caso de prueba automatizado verifica la funcionalidad de gestión de usuarios en la plataforma OrangeHRM, asegurando tanto el flujo feliz (creación y búsqueda exitosa de un usuario) como un flujo no feliz (validación de error de inicio de sesión).
# Requisitos Previos
Para ejecutar el proyecto, debe de tener instalados los siguientes componentes:

- IntelliJ IDEA (o cualquier otro IDE compatible con Java)
- JDK 11
- Gradle 8.4
  
# Tecnologías Utilizadas
- Serenity BDD: Framework de automatización de pruebas.
- Screenplay: Modelo de diseño para pruebas estructuradas y reutilizables.
- Gradle: Herramienta de construcción y gestión de dependencias.
- JUnit: Framework de pruebas unitarias.

#  Instalación
Clonar el repositorio con Git
- Ejecutar el siguiente comando en la terminal:
git clone https://github.com/delahoz174/practica.git

Descarga Manual (ZIP):
1. Ve a Repositorio en GitHub.
2. Haz clic en el botón Code.
3. Selecciona Download ZIP.
4. Extrae el contenido en tu equipo.

# Uso y Pruebas
Ejecutar pruebas desde IntelliJ:
- Colocar nombre del empleado y usurio en las constantes NOMBRE_EMPLEADO, USUARIO en utils/constantes
- Navega hasta la clase PrincipalRunner.
- Haz clic derecho sobre la clase y selecciona Run 'PrincipalRunner'.
  
Ejecutar pruebas desde la consola:
- Abre una terminal en la raíz del proyecto y ejecuta: gradle test --tests PrincipalRunner
