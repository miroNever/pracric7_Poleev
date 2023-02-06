fun Zad28_2()
{
    try {
        println("Введите значение а:")
        var a = readLine()!!.toDouble()
        println("Введите значение b:")
        var b = readLine()!!.toDouble()
        println("Введите значение c:")
        var c = readLine()!!.toDouble()
        println("Введите значение d:")
        var d = readLine()!!.toDouble()
        println("Введите значение e:")
        var e = readLine()!!.toDouble()
        println("Введите значение f:")
        var f = readLine()!!.toDouble()
        var x = (c * e - f * b) / (a * e - d * b)
        var y = (a * f - d * c) / (a * e - d * b)
        println(" x = $x, y = $y")
    }
    catch (e: NumberFormatException)
    {
        println("Возникла ошибка")
    }

}
fun main()
{
    Zad28_2()
}