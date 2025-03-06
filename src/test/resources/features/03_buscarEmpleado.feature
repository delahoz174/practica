# language: es

Característica: Búsqueda de un empleado recién agregado en System Users
  Como usuario administrador
  Quiero buscar un empleado recién agregado en "System Users"
  Para verificar que se haya registrado correctamente

  Escenario: Buscar un empleado recién agregado en la lista de System Users
    Cuando el usuario sea redirigido a System Users
    Y escriba el nombre de usuario y presione el boton Search
    Entonces el sistema debe mostrar en la lista al empleado recien agregado

