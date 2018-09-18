def linearSearch(nums, target):
    if type(nums) is not list:
        print("Error! First parameter should be a list.")
        return -1

    end = len(nums)

    for i in range(0, end):
        if nums[i] == target:
            return i
    
    return -1