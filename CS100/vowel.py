"""
def wordsD(text):
    wordList={}
    i=-1
    text = text.lower().split('.')
    for sentence in text:
    i+=1
        for word in sentence.split():
            wordList[word]=wordList
            if word in wordList:
                countList.append(count)
            wordList[word]=countList
        count+=1
    return wordList


print(wordsD("I say what I mean. I mean what I say. i do."))
"""

def wordsD(text):
    sentences = text.lower().split('.')
    dic = {}
    i = -1
    for sen in sentences:
        i += 1
        for word in sen.split():
            if word not in dic:
                dic[word] = [i]
            elif dic[word][-1] != i:     
                dic[word].append(i)
    return dic
 
text= "I say what I mean. I mean what I say. i do."
print(wordsD(text))
