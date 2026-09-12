def solution(number):
    answer = 0
    for i in  str(number):
        answer += int(i)
    
    return answer % 9