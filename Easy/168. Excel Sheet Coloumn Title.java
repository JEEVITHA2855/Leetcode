class Solution {
    public String convertToTitle(int columnNumber) {
        List<Character> characters = new ArrayList<>();

        while (columnNumber > 0) {
            int remainder = columnNumber % 26;
            if (remainder == 0) {
                characters.add('Z');
                columnNumber = (columnNumber / 26) - 1;
            } else {
                characters.add((char) ('A' + remainder - 1));
                columnNumber /= 26;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = characters.size() - 1; i >= 0; i--) {
            result.append(characters.get(i));
        }

        return result.toString();
    }
}
