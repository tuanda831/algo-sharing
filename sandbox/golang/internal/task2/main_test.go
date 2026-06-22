package task2

import "testing"

func TestMain(t *testing.T) {
	testCases := []struct {
		message  string
		S        string
		expected int
	}{{
		message:  "Test a and b locate randomly",
		S:        "abbaa",
		expected: 3,
	}, {
		message:  "Test all a",
		S:        "aaaa",
		expected: 4,
	}, {
		message:  "Test a and b turn",
		S:        "abab",
		expected: 0,
	}, {
		message:  "Test all a and b",
		S:        "aaabb",
		expected: 4,
	}}

	for _, v := range testCases {
		t.Run(v.message, func(t *testing.T) {
			actualResult := Solution(v.S)
			if v.expected != actualResult {
				t.Fatalf("Expected %v but got %v", v.expected, actualResult)
			}
		})
	}
}
