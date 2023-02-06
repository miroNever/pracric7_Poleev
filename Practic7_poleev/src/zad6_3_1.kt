import kotlin.math.*
fun Zad6_3()
{
    try {
        var znam = 0.0
        var chisl = 0.0
        println("Введите значение х: ")
        var x = readLine()!!.toDouble()
        chisl = Math.sqrt(Math.abs(x)) * ln(Math.pow(x,2.0))
        znam = -5/(4 * x) + Math.pow(Math.E, x / 2)
        var result : Double = chisl / znam
        print(String.format("%.4f", result))
    }
    catch (e: NumberFormatException)
    {
        println("Возникла Ошибка")
    }
}
fun main()
{
    Zad6_3()
}