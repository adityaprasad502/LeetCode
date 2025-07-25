class Solution {
    fun isValid(word: String): Boolean {
        if (word.length < 3) return false

        var v = 0;
        var c = 0;

        for (x in word) {
            when {
                x.isLetter() -> {
                    if (x in listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')) {
                        ++v;
                    } else {
                        ++c;
                    }
                }
                !x.isDigit() -> {
                    return false
                }
            }
        }
        return v>=1 && c>=1;
    }
}