package subtask3

//import com.sun.tools.javac.util.List

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        val strNumber = number.toString()
        val len = strNumber.length
        var listOfNumbers = mutableListOf<String>()

        for(i in strNumber.indices){
            if(!strNumber[i].isDigit()) return null
            var currList: List<Char> = listOfNeighbours(strNumber[i])
            for(c in currList){
                if(i == 0){
                    listOfNumbers.add(c + strNumber.substring(1))
                }
                else{
                    if(i==len-1)
                    {
                        listOfNumbers.add(strNumber.substring(0, len-1)+c)
                    }
                    else{
                        listOfNumbers.add(strNumber.substring(0, i)+c+strNumber.substring(i+1, len))
                    }
                }
            }
        }
        print(listOfNumbers)
        return listOfNumbers.toTypedArray()

        //throw NotImplementedError("Not implemented")
    }

    fun listOfNeighbours(n: Char) :List<Char> {
        val res: List<Char> = when(n) {
            '0' -> listOf('8')
            '1' -> listOf('2', '4')
            '2' -> listOf('1', '3', '5')
            '3' -> listOf('2', '6')
            '4' -> listOf('1', '5', '7')
            '5' -> listOf('2', '4', '6', '8')
            '6' -> listOf('3', '5', '9')
            '7' -> listOf('4', '8')
            '8' -> listOf('0', '5', '7', '9')
            '9' -> listOf('6', '8')
            else -> listOf(n)
        }
        return res
    }
}
