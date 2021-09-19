class PredialPago(persona: Persona, zonas: Zona) {
    var ImpPre: Double = 0.0
    var descuento: Double = 0.0
    var ImpTotal: Double = 0.0
    var zonas = arrayOf(
        Zona(clave = "MAR", zona = "Marginado", costo = 2.00),
        Zona(clave = "RUR", zona = "Rural", costo = 8.00),
        Zona(clave = "URB", zona = "Urbano", costo = 10.00),
        Zona(clave = "RES", zona = "Residencial", costo = 25.00)
    )

    fun calcularImpuesto(predio: Predio): Double {
        zonas.forEach { zona: Zona ->
            if (zona.clave == predio.zona) {
                ImpPre = zona.costo * predio.tamaño
                return ImpPre
            }
        }
        return ImpPre
    }

    fun calcularDescuento(persona: Persona, mesPago: Int) {
        var edad = persona.calcularEdad()
        val madreSoltera = persona.maSoltera
        if (edad >= 70 && mesPago <= 2 || madreSoltera.equals(true) && mesPago <= 2) {
            println("Tendra un descuento de 70%")
            descuento = ((ImpPre / 100) * 70)
        } else if (edad >= 70 && mesPago > 2 || madreSoltera.equals(true) && mesPago > 2) {
            println("Tendra un descuento del 50%")
            descuento = ((ImpPre / 100) * 50)
        } else if (mesPago <= 2) {
            println("Tendra un descuento del 40%")
            descuento = ((ImpPre / 100) * 40)
        } else {
            println("No tendra un descuento ")
            descuento = 0.0
        }

    }

    fun calcImpuestoTotal(predio: Predio): Double {
        ImpTotal = ImpPre - descuento

        return ImpTotal
    }

}






