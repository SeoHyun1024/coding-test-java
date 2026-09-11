def solution(arr, queries):
    result = []
    for q in queries:
        temp = arr[q[0]:q[1]+1]
        
        new_list = [t for t in temp if q[2] < t]    
        
        if new_list:            
            result.append(min(new_list))
        else:
            result.append(-1)

    return result