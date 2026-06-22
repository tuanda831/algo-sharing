package task1

import "testing"

func TestSolution(t *testing.T) {
	testCases := []struct {
		name          string
		S             string
		expectedValue int
	}{{
		name:          "Test the all a then b",
		S: "aabbb",
		expectedValue: 1,
	}, {
		name:          "Test the b then a",
		S: "ba",
		expectedValue: 0,
	}, {
		name:          "Test the all b",
		S: "b",
		expectedValue: 1,
	}, {
		name:          "Test the all a",
		S: "aaa",
		expectedValue: 1,
	}, {
		name:          "Test the all a then b then a",
		S: "aabba",
		expectedValue: 0,
	}}
	for _, v := range testCases {
		t.Run(v.name, func(t *testing.T) {
			result := Solution(v.S)
			if result != v.expectedValue {
				t.Fatalf("Expect %d but we get, %d", v.expectedValue, result)
			}
		})
	}
}
