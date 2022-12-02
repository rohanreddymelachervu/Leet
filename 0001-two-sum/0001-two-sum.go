func twoSum(nums []int, target int) []int {
    nums_map := make(map[int]int)
    for i := 0; i < len(nums); i++ {
        if _, ok := nums_map[target-nums[i]]; ok {
            return []int {i, nums_map[target-nums[i]]}
        }else {
            nums_map[nums[i]] = i
        }
    }
    return nil
}