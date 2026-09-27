class Solution {
    function isAnagram($s, $t) {
        if (strlen($s) != strlen($t)) {
            return false;
        }
        $count = array_fill(0, 26, 0);
        for ($i = 0; $i < strlen($s); $i++) {
            $count[ord($s[$i]) - ord('a')]++;
            $count[ord($t[$i]) - ord('a')]--;
        }
        for ($i = 0; $i < 26; $i++) {
            if ($count[$i] != 0) {
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna