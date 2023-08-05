# spring-boot-webapp

Este repositorio contiene una aplicación de ejemplo que utiliza Spring Boot para implementar un proyecto web utilizando el patrón Modelo-Vista-Controlador (MVC). En este documento, se describirá cómo configurar el proyecto, las principales anotaciones utilizadas, las dependencias necesarias, y cómo pasar datos a la vista utilizando Thymeleaf como motor de plantillas.

## Dependencias

El proyecto utiliza varias dependencias de Spring Boot para su funcionamiento. A continuación, se enumeran las principales:

1.  **Spring Boot Dev Tools:** Esta dependencia proporciona una serie de herramientas útiles para el desarrollo, como reinicio automático de la aplicación cuando se realizan cambios en el código.
    
2.  **Thymeleaf:** Thymeleaf es un motor de plantillas para el desarrollo web basado en XML/HTML. Nos permite generar vistas dinámicas en la aplicación web.
    
3.  **Spring Web:** Esta dependencia contiene las funcionalidades web de Spring, como el soporte para el protocolo HTTP y el manejo de solicitudes y respuestas.

##  Pasar Datos a la Vista con Thymeleaf

En este proyecto, utilizamos Thymeleaf para pasar datos desde el controlador a la vista. Thymeleaf permite la incorporación de variables y expresiones dentro de las plantillas HTML, lo que facilita la visualización de información dinámica.

## Anotaciones Principales

En este proyecto, utilizaremos las siguientes anotaciones clave de Spring Boot:

1.  **@SpringBootApplication:** Esta anotación marca la clase principal de la aplicación y permite que Spring Boot configure automáticamente los componentes de la aplicación.
    
2.  **@Controller:** Anotamos las clases que actúan como controladores con esta anotación. Estos controladores manejan las solicitudes HTTP y devuelven las vistas.
    
3.  **@RequestMapping:** Utilizamos esta anotación para mapear las URL a métodos específicos en los controladores.
    
4.  **@GetMapping:** Esta anotación es una versión específica de `@RequestMapping` que se utiliza para mapear solicitudes HTTP GET a métodos del controlador.
    
5.  **@ModelAttribute:** Con esta anotación, podemos pasar objetos a la vista como atributos. Estos atributos estarán disponibles en la plantilla Thymeleaf.
    
6.  **@RequestParam:** Utilizamos esta anotación para mapear los parámetros de la solicitud HTTP a los parámetros del método del controlador.
    
7.  **@PathVariable:** Con esta anotación, podemos extraer variables de la URL y utilizarlas como parámetros en los métodos del controlador.
    
8.  **@Value:** Con esta anotación, podemos inyectar valores de propiedades definidas en el archivo `application.properties` o `application.yml`.

## Conclusión

Este es solo un ejemplo básico de cómo utilizar Spring Boot en un proyecto web siguiendo el patrón MVC y cómo pasar datos a la vista utilizando Thymeleaf. A partir de esta base, puedes desarrollar aplicaciones web más complejas y ricas en funcionalidades utilizando el amplio ecosistema de Spring Boot y sus extensiones.
