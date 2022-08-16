class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows = len(matrix); cols = len(matrix[0])
        top = 0; bottom = rows-1;
        while top<bottom:
            mid = (top + bottom) // 2
            if matrix[mid][cols-1]<target:
                top = mid+1
            elif matrix[mid][0]>target:
                bottom = mid-1
            else:
                break
        if top>bottom:
            return False
        row = (top+bottom) // 2
        left=0; right=cols-1
        while left<=right:
            mid = (left+right) // 2
            if matrix[row][mid] == target:
                return True
            elif matrix[row][mid] > target:
                right = mid-1
            else:
                left = mid+1
        return False