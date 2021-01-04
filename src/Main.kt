import kotlin.math.sqrt

/**
 *
 * @author sheshui
 * @date 2020/12/31
 * @description
 */
//fun main() {
////    val a = readLine()
////    val b = a + readLine()?.split(" ")
////    var c = println("${"${b.plus(123123)} $a"} is now").toString()
////
////    println(c)
////    c = println("sout").toString()
////    println(sum(10, 42))
//
////    getStringLength(String.javaClass)
////    println(getStringLength("setreinhg"))
////    for (i in list.indices) {
////        println("$i is ${list[i]}")
////        println(i)
////    }
////    var i = 0
////    while (i < list.size) {
////        println("$i is ${list[i]}")
////        i++
////    }
////    var str= readLine()
////    while (!str.isNullOrEmpty())
////    {
////
////        println(tWhen(str))
////        str= readLine()
////
////    }
//
//
//// 区间
////    val x=10
////    val y=9
////    if (x in 1..y+10){
////        println(x)
////    }
//
////    if (-1 !in 1..list.lastIndex) println(list)
////    println(list.indices)
////    if (-1 !in list.indices) println(list)
////    if (1 in list) println(list)
//
////    for (x in 10 downTo 0 step 3) {
////        println(x)
////    }
//    println(list)
//    var changeList = list.filter { it % 2 == 0 }.map { it - 1 }
//    println(changeList)
//    changeList = changeList.flatMap { listOf(it * 4) }
//    println(changeList)
//
//
//}


fun tWhen(obj: Any) =
    when (obj) {
        1 -> "One"
        "one" -> "string one"
//        is String -> "string"
        !is String -> "not string"
        else -> 1L
    }


fun sum(a: Int, b: Int) = a + b


var list = (1..10).toList()


fun getStringLength(str: Any) = if (str is String) str.length else null

fun muti(a: Int, b: Int) = a * b


fun main() {
    val rectangle = Rectangle(80.0, 2.0)
    val triangle = Triangle(3.0, 4.0, 5.0)
    println("Area of rectangle is ${rectangle.calculateArea()}, its perimeter is ${rectangle.perimeter}")
    println("Area of triangle is ${triangle.calculateArea()}, its perimeter is ${triangle.perimeter}")
}

abstract class Shape(private val sides: List<Double>) {
    val perimeter: Double get() = sides.sum()
    abstract fun calculateArea(): Double
}

interface RectangleProperties {
    val isSquare: Boolean
}

class Rectangle(
    var height: Double,
    var length: Double
) : Shape(listOf(height, length, height, length)), RectangleProperties {
    override val isSquare: Boolean get() = length == height
    override fun calculateArea(): Double = height * length
}

class Triangle(
    var sideA: Double,
    var sideB: Double,
    var sideC: Double
) : Shape(listOf(sideA, sideB, sideC)) {
    override fun calculateArea(): Double {
        val s = perimeter / 2
        return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}