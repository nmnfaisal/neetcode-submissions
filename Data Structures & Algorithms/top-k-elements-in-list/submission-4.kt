class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

    val elements = mutableMapOf<Int, Int>()

    nums.forEach {
        elements[it] = elements.getOrDefault(it, 0) + 1
    }

    // Step 1: turn the map into a list of (number, count) pairs
    val entryList: List<Map.Entry<Int, Int>> = elements.entries.toList()

    // Step 2: sort that list, biggest count first
    val sortedList: List<Map.Entry<Int, Int>> = entryList.sortedByDescending { it.value }

    // Step 3: keep only the first k entries
    val topK: List<Map.Entry<Int, Int>> = sortedList.take(k)

    // Step 4: we only want the NUMBERS, not their counts — extract just the keys
    val result = mutableListOf<Int>()
    topK.forEach { entry ->
        result.add(entry.key)
    }

    return result.toIntArray()
}
}
