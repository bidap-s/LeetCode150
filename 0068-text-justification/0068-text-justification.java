class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int n = words.length;

        while (i < n) {
            
            int j = i;
            int lineLen = 0; 
            while (j < n && lineLen + words[j].length() + (j - i) <= maxWidth) {
                lineLen += words[j].length();
                j++;
            }

            int numWords = j - i;
            int gaps = numWords - 1;
            StringBuilder line = new StringBuilder();

            boolean lastLine = (j == n);

            if (gaps == 0 || lastLine) {
            
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k != j - 1) line.append(' ');
                }
                while (line.length() < maxWidth) line.append(' ');
            } else {
                int totalSpaces = maxWidth - lineLen;
                int spaceEach = totalSpaces / gaps;
                int extra = totalSpaces % gaps;

                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k != j - 1) {
                        int spacesHere = spaceEach + (k - i < extra ? 1 : 0);
                        for (int s = 0; s < spacesHere; s++) line.append(' ');
                    }
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
}