package task2

func Solution(S string) int {
	counter := 0
	endPointer := len(S) - 1

	for startPointer := 0; startPointer < len(S); startPointer++ {
		if S[startPointer] == S[endPointer] {
			counter++
		}
		endPointer = (endPointer + 1) % len(S)
	}

	return counter
}
