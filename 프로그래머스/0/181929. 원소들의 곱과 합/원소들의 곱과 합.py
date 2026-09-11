def solution(num_list):
    multiply = 1
    for num in num_list:
        multiply *= num
        
    return 1 if multiply < sum(num_list)**2 else 0