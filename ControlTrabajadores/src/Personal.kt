import java.time.LocalDate

class Personal(
    id_Personal: Int, nombre: String, curp: String, fecha_Ingreso:
    String, genero: String, gradoAcademico: GradoAcademico, clavePresupuestal: String
) {

    val id_Personal = id_Personal
    val nombre = nombre
    var curp = curp
    val fecha_Ingreso = fecha_Ingreso
    val genero = String
    val clavePresupuestal = String
    val antiguedad = calcularAntigüedad()

    fun calcularAntigüedad(): Int {

        val fecha_Ingreso = LocalDate.parse(this.fecha_Ingreso)
        val fechaActual = LocalDate.now()
        val antigüedad = fechaActual.getYear() - fecha_Ingreso.getYear()
        return antigüedad
    }

}

