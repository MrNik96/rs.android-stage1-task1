package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val charArray = digitString.toCharArray()
        var count = 0
        for (index in charArray.indices) {
            if (index > charArray.size / 2) break

            if (charArray[index] != charArray[charArray.size - 1 - index]) {
                if (charArray[index] == '0') {
                    charArray[index] = '9'
                }
                charArray[charArray.size - 1 - index] = charArray[index]
                count++
            } else if (count > k) {
                return "-1"
            }
        }
        return String(charArray)
    }
}
