def solution(code):
    ret= ""
    mode = 0
    
    for i in range(len(code)) :
        if mode == 0:
            if code[i] != "1":
                if i % 2 == 0:
                    ret += code[i]
            else:
                mode = 1
        elif mode == 1:
            if code[i] != "1":
                if i % 2 == 1:
                    ret += code[i]
            else:
                mode = 0
    if not ret:
        ret = "EMPTY"
    
    return ret
                    