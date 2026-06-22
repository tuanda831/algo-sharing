package task1

func Solution(S string) int {
	isA := true
	for i := 0; i < len(S); i++ {
		if isA && S[i] == 'a' {
			continue
		}
		if !isA && S[i] == 'a' {
			return 0
		}
		isA = false
	}
	return 1
}
