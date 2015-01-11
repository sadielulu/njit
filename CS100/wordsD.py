def wordsD(text):
    newText = text.lower().split('.')
    wordList = {}
    i = -1
    for sentence in newText:
        i+=1
        for word in sentence.split():
            if word not in wordList:
                wordList[word] = [i]
            elif wordList[word][-1] != 1:
                wordList[word].append(i)
    return wordList


text= "I say what I mean. I mean what I say. i do."
print(wordsD(text))
