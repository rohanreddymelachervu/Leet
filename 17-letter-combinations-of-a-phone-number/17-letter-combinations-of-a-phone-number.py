class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        result=[]
        if len(digits)==0:
            return result
        maps={}
        maps[0]='0'; maps[1]='1'; maps[2]='abc'; maps[3]='def'; maps[4]='ghi'; maps[5]='jkl'; maps[6]='mno';
        maps[7]='pqrs'; maps[8]='tuv'; maps[9]='wxyz';
        self.find_combinations(result,maps,digits,'',0)
        return result
    def find_combinations(self,result,maps,digits,current,index):
        if index==len(digits):
            result.append(current)
            return
        letters=maps[(int)(digits[index])]
        for i in range(len(letters)):
            self.find_combinations(result,maps,digits,current+letters[i],index+1)
        