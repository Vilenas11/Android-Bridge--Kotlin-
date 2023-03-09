fun main() {
    val value = readln().toInt()
    var aCounter: Int = 0
    var bCounter: Int = 0
    var cCounter: Int = 0
    var dCounter: Int = 0
    repeat(value) {
        val next = readln().toInt()
        if(next == 2) dCounter++
        else if(next == 3) cCounter++
        else if(next == 4) bCounter++
        else if(next == 5) aCounter++
    }
    println("$dCounter $cCounter $bCounter $aCounter")
}
