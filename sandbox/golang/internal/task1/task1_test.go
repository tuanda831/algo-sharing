package task13

import "testing"

func TestSolution(t *testing.T) {
	testCases := []struct {
		name          string
		p             []int
		s             []int
		n             int
		expectedValue int
	}{{
		name:          "Should return 2 when [1, 4, 1] and [1, 5, 1]",
		p:             []int{1, 4, 1},
		s:             []int{1, 5, 1},
		n:             3,
		expectedValue: 2,
	}, {
		name:          "Should return 3 when {4, 4, 2, 4} and {5, 5, 2, 5}",
		p:             []int{4, 4, 2, 4},
		s:             []int{5, 5, 2, 5},
		n:             4,
		expectedValue: 3,
	}, {
		name:          "Should return 2 when {2, 3, 4, 2} and {2, 5, 7, 2}",
		p:             []int{2, 3, 4, 2},
		s:             []int{2, 5, 7, 2},
		n:             4,
		expectedValue: 2,
	}}
	for _, v := range testCases {
		t.Run(v.name, func(t *testing.T) {
			result := Solution(v.p, v.s, v.n)
			if result != v.expectedValue {
				t.Fatalf("Expect %d but we get, %d", v.expectedValue, result)
			}
		})
	}
}
