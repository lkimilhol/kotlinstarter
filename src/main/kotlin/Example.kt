fun multiplicationTable() {
    for (i in 2.. 9) {
        for (j in 1.. 9) {
            println("$i * $j = ${i * j}")
        }
    }
}

fun main(args: Array<String>) {
    multiplicationTable()
}