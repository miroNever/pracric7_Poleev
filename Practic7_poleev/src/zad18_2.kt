fun Zad18_2()
{
    try {
        println("Введите A: ")
        var a = readLine()!!.toDouble()
        while(true)
        {
            if (a > 0)
            {
                break
            }
            else
            {
                println("Введите A: ")
                a = readLine()!!.toDouble()
            }
        }
        println("Введите B: ")
        var b = readLine()!!.toDouble()
        while(true)
        {
            if (b > 0)
            {
                break
            }
            else
            {
                println("Введите B: ")
                b = readLine()!!.toDouble()
            }
        }
        println("Введите размеры кирпича x: ")
        var x = readLine()!!.toDouble()
        while(true)
        {
            if (x > 0)
            {
                break
            }
            else
            {
                println("Введите размеры кирпича x: ")
                var x = readLine()!!.toDouble()
            }
        }
        println("Введите размеры кирпича y: ")
        var y = readLine()!!.toDouble()
        while(true)
        {
            if (y > 0)
            {
                break
            }
            else
            {
                println("Введите размеры кирпича y: ")
                var y = readLine()!!.toDouble()
            }
        }
        println("Введите размеры кирпича z: ")
        var z = readLine()!!.toDouble()
        while(true)
        {
            if (z > 0)
            {
                break
            }
            else
            {
                println("Введите размеры кирпича z: ")
                var z = readLine()!!.toDouble()
            }
        }
        when
        {
            x < a && y < b || x < b && y < a -> print("Кирпич проходит в отверстие")
            x < a && z < b || x < b && z < a -> print("Кирпич проходит в отверстие")
            y < a && z < b || y < b && z < a -> print("Кирпич проходит в отверстие")
            x > a || x > b  || y > a || y > b || z > a || z > b ->  print("Кирпич не проходит в отверстие")
        }
    }
    catch (e: NumberFormatException)
    {
        println("Возникла ошибка")
    }

}
fun main()
{
    Zad18_2()
}
