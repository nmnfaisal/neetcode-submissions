class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {


            var i: Int = 0
            var j: Int = 0

            val seen = mutableMapOf<Int, Int>()
            
        nums.forEachIndexed { index, item -> 

          val remaining = target - item

            if (seen.containsKey(remaining)){
                i = seen.getValue(remaining)
                j = index
            }
            else{
                seen.put(item, index)
            }

        }

        return intArrayOf(i, j)

    }
}
