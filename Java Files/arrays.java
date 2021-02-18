class arrays {

    public static void main(String[] args) {

        if (args.length < 3) { // Check to make sure that the client entered at least 3 or more words, if not, print message and exit
            System.out.print("Please enter 3 or more words\n");
            System.exit(1);
        }

        for (int i = 0; i < args.length; i++) {
            args[i] = args[i].toLowerCase();
        }

        String singleString = "";

        for (int i = 0; i < args.length; i++) { //Print all entered words each on a separate line
            System.out.println(args[i]);

            singleString = singleString + args[i] + " "; //Concatenate all those words into a single string with only a space between the words
        }

        System.out.println(singleString); //Print the string

        String[] sortedArgs = sortWords(args);

        StringBuffer largeResult = new StringBuffer();

        for (int i = 0; i < args.length; i++) {
            StringBuffer result = new StringBuffer(); //Take each word from the sorted array, copy it to a StringBuffer, and print that StringBuffer on a separate line
            result.append(sortedArgs[i]);

            System.out.println(result);

            largeResult.append(result + " "); //Concatenate all those StringBuffer words into a single StringBuffer with a space between the words
        }

        System.out.print(largeResult); //Print the StringBuffer
    }

    static String[] sortWords(String[] words) {

        boolean finishedSort = true; //to check if still sorting because we will enter a while loop

        while (finishedSort) { //bubble sort
            finishedSort = false;
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].compareToIgnoreCase(words[i + 1]) > 0) { //compare adjacent elements and swap if necessary
                    String tmp;
                    tmp = words[i];
                    words[i] = words[i + 1]; //swap elements
                    words[i + 1] = tmp;
                    finishedSort = true;
                }
            }

        }

        return words;

    }

}