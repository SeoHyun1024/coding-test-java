def solution(str1, str2):
    new_string = ""
    for i in range(len(str1)):
        new_string += str1[i]
        new_string += str2[i]
        
    return new_string