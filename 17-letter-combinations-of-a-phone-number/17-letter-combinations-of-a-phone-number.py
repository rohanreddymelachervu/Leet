class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        result=[]
        if digits==None or len(digits)==0:
            return result
        mapping=['0','1','abc','def','ghi','jkl','mno','pqrs','tuv','wxyz']
        self.findCombinations(result,digits,mapping,0,'')
        return result
    def findCombinations(self,result:List[str],digits:str,mapping:List[str],index:int,current:str)->None:
        if index==len(digits):
            result.append(current)
            return
        letters=mapping[int(digits[index])]
        for i in range(len(letters)):
            self.findCombinations(result,digits,mapping,index+1,current+letters[i])