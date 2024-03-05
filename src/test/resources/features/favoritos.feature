# language: es

Característica: Favoritos

  @FAV-123
  Escenario: Agregar producto a favoritos
    Dado que el usuario ingresa a la pantalla de inicio
    Y el usuario se loguea en la aplicacion
    Cuando el usuario agrega un producto a favoritos
    Entonces se valida que se agrego un producto a favoritos

#  Escenario: Agregar producto a favoritos
#    Dado que el usuario se encuentra logueado en la aplicacion <-- Equivale a los steps Dado e Y de arriba


  # Escenario mas especifico del de arriba
#  Escenario: Agregar producto a favoritos
#    Dado que el usuario ingresa a la pantalla de inicio
#    Y el usuario se loguea con credenciales validas
#    Cuando el usuario ingresa a la seccion Camaras
#    Y el usuario agrega Canon EOS 5D a favoritos
#    Entonces se valida que se agrego Canon EOS 5D a favoritos
