/**
 *
 * @author sheshui
 * @date 2020/12/31
 * @description
 */
fun main() {
//    val a = readLine()
//    val b = a + readLine()?.split(" ")
//    var c = println("${"${b.plus(123123)} $a"} is now").toString()
//
//    println(c)
//    c = println("sout").toString()
//    println(sum(10, 42))

//    getStringLength(String.javaClass)
//    println(getStringLength("setreinhg"))
//    for (i in list.indices) {
//        println("$i is ${list[i]}")
//        println(i)
//    }
//    var i = 0
//    while (i < list.size) {
//        println("$i is ${list[i]}")
//        i++
//    }
//    var str= readLine()
//    while (!str.isNullOrEmpty())
//    {
//
//        println(tWhen(str))
//        str= readLine()
//
//    }


// 区间
//    val x=10
//    val y=9
//    if (x in 1..y+10){
//        println(x)
//    }

//    if (-1 !in 1..list.lastIndex) println(list)
    println(list.indices)
    if (-1 !in list.indices) println(list)


}


fun tWhen(obj: Any) =
    when (obj) {
        1 -> "One"
        "one" -> "string one"
//        is String -> "string"
        !is String -> "not string"
        else -> 1L
    }


fun sum(a: Int, b: Int) = a + b


var list = listOf(1, 2, 3, 4, 5)


fun getStringLength(str: Any) = if (str is String) str.length else null

fun muti(a: Int, b: Int) = a * b