class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while(columnNumber > 0){
            --columnNumber;
            int r = (columnNumber % 26);
            columnNumber = columnNumber /26;
            result.append((char)('A'+r));
        }
        result.reverse();
        return result.toString();
    }
}
