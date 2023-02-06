fun Zad8_2()
{
    try
    {
        println("Введите 1 число:")
        var num1 = readLine()!!.toDouble()
        println("Введите 2 число:")
        var num2 = readLine()!!.toDouble()
        when
        {
            num1 < num2 || num1 == num2 -> num1 = 0.0
        }
        println("Число 1 = $num1, Число 2 = $num2")
    }
    catch(e: NumberFormatException)
    {
        println("Возникла ошибка")
    }

}
fun main()
{
    Zad8_2()
}