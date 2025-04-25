# 📚 Sistema de Biblioteca

Este proyecto simula un sistema de gestión de recursos de biblioteca como libros, revistas y DVDs.

## 📂 Estructura

- `app/`: Contiene el Main
- `enums/`: Enumeraciones como `Categorias` y `EstadoRecurso`.
- `interfaces/`: interfaz de Prestamista implementada por `Biblioteca`.
- `menu/`: Contiene los métodos para los diferentes menus que utilizaremos en la aplicación.
- `model/`: Contiene las clases de la apliación. la explicamos de forma más extendida a continuación. por ahora solo las nombraremos `Biblioteca`, `DVD`,`Libro`, `RecursosBiblioteca`, `Revista`, `Usuario` y `Usuarios`
- `ok/`: Utilidades para entrada y validación (`Ok.java`).

### Paquete `model`

**1. Biblioteca 🏢**
   - La clase principal para gestionar la biblioteca y sus recursos.
   - Permite realizar acciones como agregar, retirar, devolver, y reservar recursos.
   - Funcionalidades:
     - Gestionar los recursos disponibles.
     - Realizar el seguimiento de los usuarios y sus recursos.

**2. Usuario 👤**
   - Representa a un usuario individual de la biblioteca.
   - Contiene la información del usuario (dni, contraseña,  ArrayList<RecursoBiblioteca> y ArrayList<RecursoBiblioteca>).
   - Funcionalidades:
     - Autenticación del usuario.
     - Consulta y gestión de recursos que el usuario ha reservado o retirado.

**3. Usuarios 👥**
   - Clase que gestiona todos los usuarios de la biblioteca.
   - Permite registrar nuevos usuarios, iniciar sesión y mantener la lista de usuarios registrados.

**4. RecursoBiblioteca 📦**
   - Clase abstracta base para todos los recursos de la biblioteca (libros, DVD y revistas).
   - Atributos comunes id, título, year, EstadoRecurso y categoría.

**5. DVD 🎬**
   - Subclase de `RecursoBiblioteca`.
   - Representa un recurso específico de tipo DVD.
   - Atributos adicionales relacionados con el tipo de recurso (director).

**6. Libro 📖**
   - Subclase de `RecursoBiblioteca`.
   - Representa un recurso específico de tipo libro.
   - Atributos adicionales relacionados con el tipo de recurso (ISBN, autor y edición).

**7. Revista 📅**
   - Subclase de `RecursoBiblioteca`.
   - Representa un recurso específico de tipo revista.
   - Atributos adicionales relacionados con el tipo de recurso (edición).


## 🛠Funcionalidades

1. **Gestión de usuarios**:
    - **Iniciar sesión**: Los usuarios pueden iniciar sesión con sus credenciales.
    - **Registrar nuevo usuario**: Los usuarios pueden crear nuevas cuentas para acceder al sistema.

2. **Gestión de recursos**:
    - **Mostrar recursos**: Los usuarios pueden consultar los recursos disponibles en la biblioteca.
        - Mostrar por ID.
        - Mostrar en orden alfabético.
        - Filtrar por categorías.
        - Filtrar por tipo (Libro, DVD, Revista).
    - **Agregar recursos**: Los usuarios pueden agregar nuevos recursos (Libros, DVDs, Revistas) a la biblioteca.
    - **Retirar recursos**: Los usuarios pueden retirar un recurso de la biblioteca.
    - **Devolver recursos**: Los usuarios pueden devolver los recursos retirados.
    - **Reservar recursos**: Los usuarios pueden reservar recursos para su posterior retirada.
    - **Cancelar reservas**: Los usuarios pueden cancelar reservas de recursos.
    - **Consultar estado de usuario**: Los usuarios pueden consultar su estado actual en la biblioteca (recursos retirados, reservados, etc.).

## 👤 Autora
María Laguillo del Moral