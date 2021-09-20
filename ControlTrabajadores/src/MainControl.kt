import org.junit.jupiter.api.Test

class MainControl {
    val grados = listOf<GradoAcademico>(
        GradoAcademico(1,"Bachillerato"),
        GradoAcademico(2,"Universidad"),
        GradoAcademico(3,"Postgrado"),
    )

    @Test
    fun main(){
        print("ingrese su nombre de usuario")
        val nombre = "Damian Martinez Jimenez"
        print("ingrese su curp")
        val curp = "MAJD980910HOCRMM09"
        print("ingrese su fecha de ingreso")
        val fechaI = "2021-09-18"
        print("ingrese su género")
        val genero = "M"
        print("ingrese su clave presupuestal")
        val clavePresupuestal = "ClavePresupuestal"


        val personal: Personal = Personal(
            id_Personal = 1, nombre, curp,
            fechaI, genero, grados[0],clavePresupuestal)

        print("por favor asigne un horario al trabajador")

        print("ingrese la hora de entrada")
        val horaE = "8:00"
        print("ingrese la hora de salida")
        val horaS = "15:00"
        println("ingrese el dia de la semana")
        val dia = 1

        val horarios: List<Horario> = listOf(
            Horario(1,personal.id_Personal,horaE, horaS, dia),
            Horario(2,personal.id_Personal,"8:00", "15:00", 2),
            Horario(3,personal.id_Personal,"8:00", "15:00", 3),
            Horario(4,personal.id_Personal,"8:00", "15:00", 4),
            Horario(5,personal.id_Personal,"8:00", "15:00", 5),
        )
        val registros: List<Registro> = listOf(
            Registro(personal.id_Personal, "2021-09-13", "8:15","15:00"),
            Registro(personal.id_Personal, "2021-09-14", "8:15","15:00"),
//            Registro(personal.id_Personal, "2021-09-15", "8:00","15:00"),
            Registro(personal.id_Personal, "2021-09-16", "8:15","15:00"),
            Registro(personal.id_Personal, "2021-09-17", "8:15","15:00"),
            Registro(personal.id_Personal, "2021-09-20", "8:15","15:00"),//1
            Registro(personal.id_Personal, "2021-09-21", "8:00","14:59"),
            Registro(personal.id_Personal, "2021-09-22", "8:15","15:00"),
            Registro(personal.id_Personal, "2021-09-23", "8:00","15:00"),
            Registro(personal.id_Personal, "2021-09-24", "8:00","15:00"),
            Registro(personal.id_Personal, "2021-09-27", "8:15","15:00"),//2
            Registro(personal.id_Personal, "2021-09-28", "8:00","15:00"),
            Registro(personal.id_Personal, "2021-09-29", "8:15","15:00"),
            Registro(personal.id_Personal, "2021-09-30", "8:15","14:50"),
            Registro(personal.id_Personal, "2021-10-01", "8:00","15:00"),
            Registro(personal.id_Personal, "2021-10-02", "8:15","15:00"),
            Registro(personal.id_Personal, "2021-10-03", "8:15","15:00"),
        )

        val registroAsistencias = Reporte(personal, horarios, registros)

        println("Reporte")
        registroAsistencias.generarReporte("2021-09-16", "2021-09-30")

    }

}