# 🏋 Sistema de Gestión – Centro Deportivo

## 🎯 Objetivo

Aplicar de forma autónoma el patrón trabajado en clase utilizando:

- Clases y objetos
- Composición
- Arrays unidimensionales de tamaño fijo
- Métodos bien estructurados
- Javadoc correcto
- Código limpio y ordenado

> Este ejercicio tiene exactamente la misma estructura técnica que el examen.

---

## 📖 Escenario

Un centro deportivo gestiona un máximo de **15 entrenadores activos**.

Cada entrenador está identificado mediante un **id único** y dispone de la siguiente información:

- id (int)
- nombre (String)
- especialidad (String)
- añosExperiencia (int)

El sistema debe permitir registrar entrenadores, buscarlos, mostrarlos y contar cuántos están actualmente almacenados.

Recuerda crear los commits adecuados según vas desarrollando la solución

---

## 🧩 Requisitos técnicos

### 1️⃣ Clase `Entrenador`

Debe incluir:

- Atributos privados.
- Constructor completo.
- Métodos getters.
- Método `toString()`.
- Javadoc en:
    - Clase
    - Constructor
    - Métodos públicos

---

### 2️⃣ Clase `CentroDeportivo`

Debe incluir:

#### Atributos

```java
private Entrenador[] entrenadores;
private final int NUM_MAX_ENTRENADORES;
````

#### Constructor

- Asegúrate de que el número de entrenadores recibido sea positivo

---

### Métodos obligatorios

```java
public Entrenador buscarEntrenador(int id)
private int buscarPrimerHuecoLibre()
public boolean registrarEntrenador(Entrenador entrenador)
public String mostrarEntrenadores()
public int contarEntrenadores() 
```

---

## 🔍 Comportamiento esperado

### `buscarEntrenador(int id)`
- Devuelve el entrenador con ese id.
- Devuelve `null` si no existe.

### `buscarPrimerHuecoLibre()`
- Devuelve la primera posición `null`.
- Devuelve `-1` si el array está completo.

### `registrarEntrenador(Entrenador entrenador)`
- Solo añade si no existe otro con el mismo id.
- Solo añade si hay hueco disponible.
- Devuelve `true` si se añade.
- Devuelve `false` si no puede añadirse.

### `mostrarEntrenadores()`
- Devuelve el listado de entrenadores con su información.

### `contarEntrenadores()`
- Devuelve el número real de entrenadores almacenados.


---

## 🖥 Clase `Main`

Debe:
- Crear un `CentroDeportivo`, con capacidad para 15 entrenadores
- Registrar al menos 3 entrenadores.
- Mostrar entrenadores.
- Mostrar el total almacenado.
- Probar una búsqueda existente y otra inexistente.

---

## 📊 Criterios de evaluación

|Criterio|Peso|
|---|---|
|Diseño correcto de clases|20%|
|Encapsulación adecuada|10%|
|Uso correcto del array fijo|20%|
|Método registrarEntrenador correcto|15%|
|Recorrido y visualización correctos|10%|
|Conteo correcto|10%|
|Javadoc adecuado|10%|
|Orden y claridad del código|5%|

---

## ⚠️ Errores frecuentes a evitar

- No inicializar el array en el constructor.
- Usar `ArrayList`.
- No comprobar `null` antes de acceder a un objeto.
- Sobrescribir posiciones ocupadas.
- No devolver `false` cuando el catálogo está lleno.
- No documentar correctamente.
- Hacer atributos públicos.

---

## 📌 Entrega

- Proyecto completo.
- Código funcional.
- Compila sin errores.
- Nombres claros y coherentes.

---

## 💬 Importante

Si eres capaz de resolver correctamente este ejercicio, estás preparado para el examen.
