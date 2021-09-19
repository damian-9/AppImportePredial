import java.time.LocalDate

class Persona(
    nombre: String, apellido: String, fNacimiento: String, mSoltera: Boolean
) {

    val nombre = nombre
    val apellido = apellido
    val feNacimiento = fNacimiento
    val maSoltera = mSoltera
    val edad = this.calcularEdad()
    var predios: ArrayList<Predio> = arrayListOf()

    fun calcularEdad(): Int {

        val fechaNacimiento = LocalDate.parse(this.feNacimiento)
        val fechaActual = LocalDate.now()
        val edad = fechaActual.getYear() - fechaNacimiento.getYear()
        return edad
    }

}

