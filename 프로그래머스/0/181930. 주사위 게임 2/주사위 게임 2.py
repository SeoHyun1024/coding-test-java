def solution(a, b, c):
    numbers = [a,b,c]
    numbers.sort()
    
    score = 0
    if numbers[0] == numbers[2]:
        score = 3
    elif numbers[0] == numbers[1] or numbers[1] == numbers[2]:
        score = 2
    else:
        score = 1
    
    result = 1
    for s in range(score, 0, -1):
        result *= a**s + b**s + c**s
    
    return result
            
    
            