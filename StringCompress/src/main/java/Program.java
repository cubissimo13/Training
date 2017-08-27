public class Program {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(compressString("aaabbccccddee"));
    }

    private static StringBuilder compressString(String string){
        StringBuilder result = new StringBuilder();
        char word = string.charAt(0);
        int sum = 1;
        int iterator = 1;
        while(iterator < string.length()){
            if (word == (string.charAt(iterator))){
                sum++;
            } else {
                result.append(sum).append(word);
                sum=1;
                word = string.charAt(iterator);
            }
            iterator++;
            if (iterator == string.length()){
                result.append(sum).append(word);
            }
        }
        return result;
    }
}
