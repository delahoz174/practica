# language: es

Característica: Gestión de usuarios en la aplicación
  Como usuario administrador
  Quiero agregar un nuevo usuario en la aplicación
  Para gestionar los accesos correctamente

  Escenario: Agregar un nuevo usuario en la aplicacion
    Cuando el usuario administrador autenticado ingrese a la opcion Admin
    Y Presione el boton 'Agregar', complete el formulario y guarde la informacion
    Entonces el sistema debera mostrar un mensaje de exito indicando que el usuario fue creado correctamente
