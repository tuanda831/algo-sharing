package task3

import "testing"

func TestMain(t *testing.T) {
	testCases := []struct {
		name     string
		N        int
		expected int
	}{{
		name:     "Should return 2 digis",
		N:        16,
		expected: 79,
	}, {
		name:     "Should return 3 digits",
		N:        19,
		expected: 199,
	}, {
		name:     "Should return 1 digits",
		N:        7,
		expected: 7,
	}}

	for _, v := range testCases {
		t.Run(v.name, func(t *testing.T) {
			result := Solution(v.N)

			if result != v.expected {
				t.Fatalf("Expected %v but got %v", v.expected, result)
			}
		})
	}
}
