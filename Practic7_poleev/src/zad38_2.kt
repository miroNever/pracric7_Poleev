fun Zad38_2()
{
    try {
        println("Укажите числа а, b, c, d(a < b < c < d):")
        var a = readLine()!!.toDouble()
        var b = readLine()!!.toDouble()
        var c = readLine()!!.toDouble()
        var d = readLine()!!.toDouble()
        while (true)
        {
            if (a < b && b < c && c< d)
            {
                break;
            }
            else
            {
                println("Укажите числа а, b, c, d(a < b < c < d):")
                a = readLine()!!.toDouble()
                b = readLine()!!.toDouble()
                c = readLine()!!.toDouble()
                d = readLine()!!.toDouble()
            }
        }
        println("введите х: ")
        var x = readLine()!!.toDouble()
        when
        {
            a < x && x < b -> println("Число $x входит в отрезок [$a,$b]")
            c < x && x < d -> println("Число $x входит в отрезок [$c,$d]")
            a > x || x > d -> println("Число $x не входит в отрезок [$a,$b] и [$c,$d]")
        }
    }
    catch (e: NumberFormatException)
    {
        println("Возникла ошибка")
    }

}
fun main()
{
    Zad38_2()
}