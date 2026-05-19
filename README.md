Licenciatura en Sistemas
Orientación a Objetos II
Trabajo Práctico 4 – Template Method & Composite

1. La empresa “Laser X” posee los siguientes roles de empleados: directores, gerentes,
mandos medios, líderes de proyecto y empleados regulares. Todos tienen gente a su
cargo, salvo los empleados regulares. Los directores tienen a su cargo gerentes, los
gerentes a mandos medios, los mandos medios a líderes de proyecto y éstos a
empleados regulares.

a) Implemente en Java el modelo de objetos para permitir calcular el monto total salarial
de la empresa utilizando el patrón Composite. Escriba dos casos de test.


3. Un Proyecto en Scrum está compuesto de muchos ítems de trabajo. Un ítem del
proyecto puede ser una historia de usuario, y las historias se componen de tareas.
También tenemos ítems de tipo spike (tareas de análisis).

a) Aplicando el patrón Composite diseñe el diagrama de clases que permita modelar este
escenario y que permita calcular el tiempo necesario para completar un proyecto o
alguna parte del mismo.

b) Implemente la solución en Java y escriba dos casos de test.


5. Se desea desarrollar una aplicación de gestión de seguros que pueda manejar seguros
de distinto tipo (hogar, automóvil, vida y médicos) y que permita crear paquetes de
seguros que agrupen seguros (y también otros paquetes). El costo de cada paquete está
dado por el costo individual de cada seguro, pero aplica un descuento del 5%,
acumulativo, por cada seguro incluido en el paquete.

a) Aplicando el patrón Composite, diseñe el diagrama de clases que permita modelar este
escenario y que permita calcular el costo de cada seguro y de los paquetes de seguros
ofrecidos por la compañía.

b) Implemente la solución en Java y dos casos de prueba.


7. El Supermercado “Amigos del Viento” lanzó una promoción en la cual se hacen cargo ellos
de parte del IVA que se le cobra a los productos. Para implementar esto, se desarrollaron las
siguientes clases:
import static java.time.LocalDate.now;
import static java.time.Month.of;
public class CalculadorJubilado implements Calculador {
private LogTransaction log;
private int mesEnPromocion;
public double calcularPrecio(double precioProducto) {
double precioTotal = precioProducto;
if (!of(mesEnPromocion).equals(now().getMonth())) {
precioTotal += precioProducto * 0.1;
}
log.log(CalculadorJubilado.class.getName());
return precioTotal;
}
}
import static java.time.LocalDate.now;
import static java.time.Month.of;
public class CalculadorNoJubilado implements Calculador {
private LogTransaction log;
private int mesEnPromocion;
public double calcularPrecio(double precioProducto) {
double precioTotal = precioProducto;
if (of(mesEnPromocion).equals(now().getMonth())) {
precioTotal += precioProducto * 0.15;
} else {
precioTotal += precioProducto * 0.21;
}
log.log(CalculadorNoJubilado.class.getName());
return precioTotal;
}
}
interface Calculador {
double calcularPrecio(double precioProducto);
}

a) Remueva el código duplicado utilizando Template Method. Escriba dos casos de test, uno
para el cálculo para jubilados y otro no.


8. Un negocio comercializa diferentes tipos de remeras. Las remeras pueden ser importadas o
nacionales. Para el cálculo del precio de venta se deben tener en cuenta que ambos tipos de
remeras poseen un precio unitario. Además las remeras importadas sobre el precio unitario
tienen un 3% de recargo más un 5% de impuesto aduanero. Por último el comercio aplica un
25% para determinar el precio final.
Las remeras nacionales tienen un recargo de 1,5 % del costo de transporte y una bonificación
del 20%. Por último el comercio aplica un 15% para determinar el precio final.

a) Aplicando el patrón Template Method, diseñe un modelo de clases que represente el
problema descripto, donde se detalle el proceso de cálculo del precio de venta de las remeras.

b) Implemente la solución en Java y escriba dos casos de test.
