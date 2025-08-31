class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1 or numRows >= len(s):
            return s
        rows = [''] * numRows
        crow = 0
        down = False
        for char in s:
            rows[crow] += char
            if crow == 0 or crow == numRows - 1:
                down = not down
            if down:
                crow += 1
            else:
                crow -= 1
        return "".join(rows)