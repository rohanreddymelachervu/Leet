class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix)==0:
            return False
        rows=len(matrix); columns=len(matrix[0]);
        left=0; right=rows*columns-1;
        while left<=right:
            mid=int(left+(right-left)/2)
            midElement=matrix[int(mid/columns)][int(mid%columns)]
            if midElement==target:
                return True
            elif midElement>target:
                right=mid-1
            else:
                left=mid+1
        return False