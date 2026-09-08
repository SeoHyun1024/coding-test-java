def solution(num_list):
    even_list = [str(n) for n in num_list if n % 2 == 0]
    odd_list = [str(n) for n in num_list if n % 2 == 1]
    
    return int("".join(even_list)) + int("".join(odd_list))