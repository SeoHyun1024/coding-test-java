def solution(l, r):
    result = []
    for i in range(l, r+1):
        new_list = list(str(i))
        
        flag = 1
        for j in new_list:
            if j != '5' and j != '0':                  
                flag = 0
                break
        if flag == 1:            
            result.append(int(''.join(new_list)))
                
    if not result:
        result.append(-1)
    
    return result
        
    