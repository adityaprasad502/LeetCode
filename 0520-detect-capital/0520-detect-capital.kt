class Solution {
    fun detectCapitalUse(word: String): Boolean {
        return word == word.uppercase() || word == word.lowercase() || (word.first().isUpperCase() && word.drop(1) == word.drop(1).lowercase())
    }
}