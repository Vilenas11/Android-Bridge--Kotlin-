fun main() {
    var initialNumber = readln().toInt()
    print("$initialNumber ")
    while(initialNumber != 1) {
        if(initialNumber % 2 == 0) initialNumber /= 2
        else {
            initialNumber *= 3
            initialNumber += 1
        }
        print("$initialNumber ")
    }
}