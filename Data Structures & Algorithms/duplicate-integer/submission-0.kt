class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

    val count: Int = 0
    val seen = mutableSetOf<Int>()

        nums.forEach{
            if (seen.contains(it)) return true
           
            seen.add(it)   
        }

        return false

    }
}
