class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        x= [i for i, o in enumerate(words) if x in o]
        return x