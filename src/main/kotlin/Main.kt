fun main() {

    val arr = arrayOf(3,2,13,5,8,0,12,7,1,0,12)

    //1
    val arrD = arr.map{it * 2}.toTypedArray()
    println(arrD.joinToString(", "))

    //2
    val arrT = arr.flatMap { listOf(it, it, it) }.toTypedArray()
    println(arrT.joinToString(", "))

}