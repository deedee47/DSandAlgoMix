package com.deedee.oop;

import java.util.HashMap;

public class LongestSequence {

    //this program is designed to find the longest sequence in a given string without repeating characters

    public int findLongestSequence(String sequence)
    {
        if(sequence == null || sequence == "") return 0;

        int highestSequenceCount = 0;
        int tempCount = 0;
        HashMap<Character, Integer> letterBank = new HashMap<Character, Integer>();

        //remove casing
        sequence = sequence.toLowerCase();

        for(int letterIndex = 0; letterIndex < sequence.length(); letterIndex++)
        {
            char letter = sequence.charAt(letterIndex);
            if(!letterBank.containsKey(letter))
            {
                letterBank.put(letter, letterIndex); //save the unique letter and its index
                tempCount++;

            }else //there's a repeat
            {
                //return index to the first occurence of the letter
                letterIndex = letterBank.get(letter);
                letterBank.clear(); //empty the bank to start over

                //check if the sequence so far is highest
                if(highestSequenceCount < tempCount)
                {
                    highestSequenceCount = tempCount; // replace highest
                }
                tempCount = 0; //restart the counter
            }
        }

        if(highestSequenceCount < tempCount) //assuming there were no repeats
        {
            highestSequenceCount = tempCount; // replace highest
        }

        return highestSequenceCount;
    }
}
