package task13

func Solution(P, S []int, N int) int {
	cars := 0
	carType := make(map[int]int)
	numberOfPeople := 0
	for i := 1; i <= 9; i++ {
		carType[i] = 0
	}
	for i := 0; i < N; i++ {
		numberOfPeople += P[i]
		carType[S[i]] = carType[S[i]] + 1
	}
	for i := 9; i >= 1; i-- {
		if carType[i] == 0 {
			continue
		}

		if numberOfPeople/i >= carType[i] {
			cars += carType[i]
			numberOfPeople = numberOfPeople - carType[i]*i
			continue
		}

		if numberOfPeople%i == 0 {
			return cars + numberOfPeople/i
		}

		return cars + numberOfPeople/i + 1
	}

	return cars
}
