def solution(arr, queries):
    for q in queries:
        for i in range(q[0], q[1]+1):
            if i == 0:
                arr[i] += 1
            elif i % q[2] == 0:
                arr[i] += 1
    return arr
        