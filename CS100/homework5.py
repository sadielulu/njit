"""
problem 1
Define a function eWordsCounts that takes a string parameter called paragraph. 
A paragraph may contain multiple sentences with no spaces in between. Each sentence 
contains words sparated by spaces and ends in a period. The function returns a list
 of total number or words containing ‘e’ for each sentence.

For example
>>>eWordsCounts(‘The cat in a hat.He played then.we like python.’)
>>>[1,3,2]"""

def eWordsCounts(paragraph):
    countList=[]
    count=0
    for words in paragraph:
        if words =='.':
            countList.append(count)
            count=0
        if words =='e':
            count=count+1
    return countList
 
"""""
Problem 2
We define the letters 'a', 'e', 'i', 'o' and 'u' as vowels. We do not consider any other letter as a vowel. 
Write a function named vowelFrequency() that counts how many times each vowel occurs in a body of text. 
Input:    a string named text. You may assume that all letters in text are lower case.
Return:  a dict in which each vowel is a key and the value of each key is the number of occurrences of that vowel in text.
For example, the following would be correct output:
>>> renault = 'round up the usual suspects'
>>> print(vowelFrequency(renault))
{'o': 1, 'e': 2, 'i': 0, 'a': 1, 'u': 5} """""

def vowelFrequency(text):
    cList{}
    acount=0
    ecount=0
    icount=0
    ocount=0
    ucount=0
    for word in text:
        if 'a' ==word:
            acount=acount+1
        if 'e' ==word:
            ecount=ecount+1
        if 'i' ==word:
            icount=icount+1
        if 'o' ==word:
            ocount=ocount+1
        if 'u' ==word:
            ucount=ucount+1
    cList['a']=acount
    cList['e']=ecount
    cList['i']=icount
    cList['o']=ocount
    cList['u']=ucount
    
    return cList
    
    """
    Problem 3
    Define a function wordsD that takes one parameter:
    1. text, a string
    text contains sentences with words separated by spaces and ending in periods.
    The function returns a dictionary of word/sentenceList pairs, where word is each distinct
    word in the text and sentenceList is the list of sentence indices the word appear in.
    Note: your code is insensitive to case lettering
    for example
    if text='I say what I mean. I mean what I say. i do."
    function returns
    {'i":[0,1,2],'say':[0,1],'what':[0,1],'mean':[0,1],'do':[2]}
    """



def wordsD(text):
    newText = text.lower().split('.')
    wordList = {}
    i = -1
    for sentence in newText:
        i += 1
        for word in sentence.split():
            if word not in wordList:
                wordList[word] = [i]
            elif wordList[word][-1] != i:
                wordList[word].append(i)
    return wordList


text= "I say what I mean. I mean what I say. i do."
print(wordsD(text))
