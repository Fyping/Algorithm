class Solution:
    """
    @param matrix: the given matrix
    @return: True if and only if the matrix is Toeplitz
     [[1,2,3,4],
     [5,1,2,3],
     [9,5,1,2]]
    2 0
    2 1    1 0
    2 2    1 1    0 0
    2 3    1 2    0 1
    1 3    0 2     
    0 3
    """
    def isToeplitzMatrix(self, matrix):
        # Write your code here
        result = False
        M = len(matrix)
        N = len(matrix[0])
        for n in range(1,N):
            x=M-1 ; y=n
            temp = matrix[x][y]
            print("temp now is [%d][%d]"%(x,y))
            #x=x-1 ; y=y-1
            #print("x= %d y = %d "%(x,y))
            while x>=0 and y>=0:
                print("temp=%d matrix[%d][%d]=%d"%(temp, x, y, matrix[x][y]))
                if not temp ==matrix[x][y]:
                    return False
                x=x-1 ; y=y-1
        for m in range(M-2,-1,-1):
            x=m ; y=N -1 
            temp= matrix[x][y]
            print("-----yyy-----temp now is [%d][%d]"%(x,y))
            x=x-1 ; y=y-1
            while x>=0 and y>=0:
                print("temp=%d matrix[%d][%d]=%d"%(temp, x, y, matrix[x][y]))
                if not temp ==matrix[x][y]:
                    return False
                x=x-1 ; y=y-1
        return True
test = [[1,2,3,4],
     [5,1,2,3],
     [9,5,2,2]]
tests=[[1,2],[2,1]] 
temp = Solution()
print(temp.isToeplitzMatrix(tests))