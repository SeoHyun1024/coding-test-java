def solution(num_list):
    a = num_list[len(num_list) - 1] #  맨끝 원소
    b = num_list[len(num_list) - 2] # 맨 끝 전 원소
    
    if a > b:
        num_list.append(a-b)
    else:
        num_list.append(a*2)
        
    return num_list