def solution(arr, queries):
    for swap in queries:
        temp = arr[swap[0]]
        arr[swap[0]] = arr[swap[1]]
        arr[swap[1]] = temp
        
    return arr