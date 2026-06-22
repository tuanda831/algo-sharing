package task3

func Solution(N int) int {
	smallestInt := N % 9
	for i := 0; i < N/9; i++ {
		smallestInt = smallestInt*10 + 9
	}

	return smallestInt
}
