# Prueba técnica para Genetsis

<<<<<<< HEAD
# Funcionalidad desarrollada
=======
#Funcionalidad desarrollada
>>>>>>> d7e8a3b2219bf2741109376a902b4db623b0f6cb
1. Proyecto web JSF que permita la creación, listado y borrado de usuarios (en memoria). El proyecto se debe construir con Maven.
La información los usuarios será:
  * Email
  * Nombre
  * Apellidos
  * Fecha de nacimiento

2. Añadir validación de campos al proyecto
  * El email debe cumplir el formato correcto
  * El nombre y apellidos debe contener caracteres correctos (ej: no
se pueden introducir números)

# Compilación y despliegue
(Será necesario tener un servidor instalado, por ejemplo Tomcat)
1. Acceder a la carpeta del proyecto y ejecutar _mvn clean compile instal_
2. Desplegar el proyecto compilado _UserManagement-1.0.war_ en el servidor.
3. Acceder a <ip-maquina-servidor>:<puerto-servidor>/UserManagement-1.0/faces/index.xhtml mediante un navegador.
  * Ejemplo: http://localhost:8080/UserManagement-1.0/faces/index.xhtml
