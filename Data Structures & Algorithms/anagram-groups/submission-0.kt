class Solution {
   fun groupAnagrams(strs: Array<String>): List<List<String>> {

    val groups = mutableMapOf<String, MutableList<String>>()

    strs.forEach { word ->
        val key = word.toCharArray().sorted().joinToString("")   // canonical key: sorted chars

        if (!groups.containsKey(key)) {
            groups[key] = mutableListOf()
        }
        groups.getValue(key).add(word)
    }

    return groups.values.toList()
}


    fun isAnagram(s: String, t: String): Boolean {

        val sMap = mutableMapOf<Char, Int>()  
        val tMap = mutableMapOf<Char, Int>()

        if (s.length != t.length){
            return false
        }
        else {
            s.forEach {
                sMap[it] = sMap.getOrDefault(it, 0) + 1   
            }

            t.forEach {
                tMap[it] = tMap.getOrDefault(it, 0) + 1
            }

            sMap.forEach { (key, value) ->
                if (tMap[key] != value) return false  
            }

            return true
        }

    }
}
