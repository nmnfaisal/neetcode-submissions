class Solution {
    fun isAnagram(s: String, t: String): Boolean {

    val sMap = mutableMapOf<Char, Int>()   // fixed: Char, not String
    val tMap = mutableMapOf<Char, Int>()

    if (s.length != t.length) return false  // fixed: "lenght" typo
    else {
        s.forEach {
            sMap[it] = sMap.getOrDefault(it, 0) + 1   // fixed: "plus 1" isn't valid syntax
        }

        t.forEach {
            tMap[it] = tMap.getOrDefault(it, 0) + 1
        }

        sMap.forEach { (key, value) ->
            if (tMap[key] != value) return false   // fixed: compare actual counts, not just key existence
        }

        return true   // fixed: every path now returns a Boolean
    }
}
}
