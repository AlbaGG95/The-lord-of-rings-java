# El Señor de los Anillos - Java

## 1. Descripción
Este proyecto aplica Programación Orientada a Objetos en Java con personajes de El Señor de los Anillos.
Se trabajan tres pilares clave: encapsulamiento, herencia y polimorfismo.
La idea es mostrar estos conceptos de forma simple y práctica.

## 2. Estructura del proyecto
El proyecto se organiza con una superclase base y cinco subclases especializadas.

### Superclase
`Character`:
- Atributos comunes (`name`, `age`, `weapon`, `region`, `health`)
- Método `getDetails()`
- Encapsulamiento con `private` + getters/setters

### Subclases
- `Elf`
- `Dwarf`
- `Human`
- `Hobbit`
- `Orc`

Cada subclase:
- Hereda de `Character`
- Añade atributos propios
- Sobrescribe `getDetails()`

## 3. Polimorfismo
Se usa `List<Character>` para guardar todos los personajes en una sola colección.
Luego, con un `for-each`, se llama a `getDetails()` en cada objeto.
Así se demuestra polimorfismo dinámico, porque cada subclase imprime su propio detalle.

## 4. Cómo ejecutar el proyecto

### En IntelliJ
1. Abrir el proyecto.
2. Ejecutar `Main.java`.

### Por terminal (Maven)
```bash
mvn clean compile
```

## 5. Ejemplo de salida
```text
Name: Legolas | Age: 2931 | Weapon: Bow | Region: Mirkwood | Health: 95 | Bow Skill: 98 | Immortal: true
Name: Gimli | Age: 139 | Weapon: Axe | Region: Erebor | Health: 97 | Beard Length: 45.0 | Axe Type: Battle Axe
Name: Aragorn | Age: 87 | Weapon: Anduril | Region: Gondor | Health: 99 | Kingdom: Gondor | Leadership: 100
Name: Frodo | Age: 50 | Weapon: Sting | Region: Shire | Health: 85 | Stealth: 92 | Loves Food: true
```

## 6. Entregables
- Repositorio GitHub
- Captura de consola (ejecución en IntelliJ)
- Diagrama UML 

## 7. Checklist de requisitos cumplidos
- [x] 1 superclase
- [x] 5 subclases
- [x] Encapsulamiento (`private` + getters/setters)
- [x] Polimorfismo real (`override getDetails`)
- [x] 15 personajes creados
- [x] Uso de `List<Character>` y `for-each`
- [x] Commits estructurados en Git
