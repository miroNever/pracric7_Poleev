import com.sun.tools.javac.Main

fun Zad2()
{
    try {
        println("Введите номера эл-тов прогрессии: ")
        var m = readLine()!!.toDouble()
        var n = readLine()!!.toDouble()
        while(true)
        {
            if (m > 0)
            {
                break
            }
            else
            {
                println("Введите номера эл-тов прогрессии: ")
                m = readLine()!!.toDouble()
            }
        }
        while(true)
        {
            if (n > 0)
            {
                break
            }
            else
            {
                println("Введите номера эл-тов прогрессии: ")
                n = readLine()!!.toDouble()
            }
        }
        var sum: Double = 0.0
        println("Введите значения эл-тов: ")
        var ma = readLine()!!.toDouble()
        var na = readLine()!!.toDouble()
        sum = (ma + na) * (n - m + 1) / 2
        println("Сумма членов от М до N" + sum)
    }
    catch (e: NumberFormatException)
    {
        println("Возникла ошибка")
    }

}
fun main()
{
    Zad2()
}