class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        return sentence.toSet().count() == 26
    }
}