package task46

import "testing"

func TestMain(t *testing.T) {
	testCases := []struct {
		name     string
		L1       string
		L2       string
		expected int
	}{{
		name:     "basic case",
		L1:       ".XXX...X",
		L2:       "..X.XXXX",
		expected: 6,
	}}

	for _, v := range testCases {
		res := Solution(v.L1, v.L2)

		t.Run(v.name, func(t *testing.T) {
			if res != v.expected {
				t.Fatalf("Expected %v but got %v", v.expected, res)
			}
		})
	}
}
