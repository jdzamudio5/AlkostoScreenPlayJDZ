#language: es
  Característica:Agregar productos Alkosto
  @agregarCarritoAlkosto
    Escenario: Agregar productos Alkosto
      Dado que el Usuario abre el navegador e ingresa a la página Alkosto.com
      Cuando busca un producto en la caja de texto
      Y selecciona dos productos de forma aleatoria al carrito de compras
      Entonces podrá ver los productos seleccionados en el carrito de compras
