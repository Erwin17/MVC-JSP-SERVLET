# MVC-JSP-SERVLET

Les quiero presentar un ejemplo utilizando mvc con jsp y servlet.

Lo mas importante a destacar es un filtro el cual captura cualquier petición que haga el usuario al  intentar llamar a un archivo con extensión .jsp lanzado un not found o como mejor lo conocemos el famoso error 404.

El objetivo aqui fue que en ningun momento se le diera a entender al usuario que la aplicación estaba desarrollada con jsp.

Para el mapeo de las demas páginas se aplico un servlet utlizando la anotación @WebServlet y su propiedad urlPatterns={} pasandoles valores como (contacto.html, registro.html) ya que es la manera que queriamos manejar las url de las paginas.

