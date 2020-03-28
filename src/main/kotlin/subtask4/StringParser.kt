package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val parseStrings = arrayListOf<String>()

        for (i in inputString.indices){
            when {
                inputString[i] == '<' ->  parseStrings.add(getString(inputString.substring(i),'<', '>'))
                inputString[i] == '(' ->  parseStrings.add(getString(inputString.substring(i),'(', ')'))
                inputString[i] == '[' ->  parseStrings.add(getString(inputString.substring(i),'[', ']'))
            }
        }
        return parseStrings.toTypedArray()
    }

    private fun getString(string: String, start: Char, end: Char): String {
        var count = 0
        var result = ""
        for (i in 1 until string.length) {
            if (string[i] == start) {
                count++
            }
            if (string[i] == end && count != 0) {
                count--
            }
            else if (string[i] == end && count == 0) {
                result = string.substring(1, i)
                break
            }
        }
        return result
    }
}
