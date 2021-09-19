import org.junit.Test

class Main {
    @Test
    fun main() {
        val persona: Persona =
            Persona(
                nombre = "Manuel",
                apellido = "Avila",
                fNacimiento = "1950-09-10",
                mSoltera = false
            )

        val zona: Zona = Zona(clave = "URB", zona = "Urbano", costo = 10.00)
        val predial: PredialPago = PredialPago(persona = persona, zonas = zona)

        println("Nombre: "+(persona.nombre +" ")+(persona.apellido))
        println("Edad: "+persona.edad)
        persona.predios.add(Predio(zona = "URB", tamaño = 700.0))
        println("El impuesto predial es: $" + predial.calcularImpuesto(persona.predios.get(0)))
        predial.calcularDescuento(persona = persona, mesPago = 2)
        println("El descuento es de: $" + predial.descuento)
        println("El impuesto predial total es: $" + predial.calcImpuestoTotal(persona.predios.get(0)))
    }
}