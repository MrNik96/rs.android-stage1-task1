package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        input.sort()
        return intArrayOf(minSum(input), maxSum(input))
    }

    private fun minSum(array: IntArray) : Int{
        return array.sum() - array.last()
    }

    private fun maxSum(array: IntArray) : Int{
        val reversedArray = array.reversedArray()
        return reversedArray.sum() - reversedArray.last()
    }
}
