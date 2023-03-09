fun main() {
var decimalNumber = readln().toInt()
    var answer = Character.toChars(decimalNumber)
    var answer1 = answer.single()
  	//var decimalNumber = 97
   // var character = readln().toString()
    //var character = 'a'
    //var character1 = character.single()
    var character = readln().toString()
    var character1 = character.single()
    
    if(character1 == answer1)
    	print(true)
    else print(false)
}