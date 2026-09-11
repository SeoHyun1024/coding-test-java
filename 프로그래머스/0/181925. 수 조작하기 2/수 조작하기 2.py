def solution(numLog):
    result = ""
    
    for i in range(len(numLog) - 1):
        a = numLog[i]
        b = numLog[i+1]
        
        if a - b == 1:
            result += "s"
        elif a - b == -1:
            result += "w"
        elif a - b == 10:
            result += "a"
        elif a - b == -10:
            result += "d"
    
    return result