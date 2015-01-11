def vowelFrequency(text):
    cList={}
    acount=0
    ecount=0
    icount=0
    ocount=0
    ucount=0
    for word in text:
        if 'a' == word:
            acount=acount+1
        if 'e' == word:
            ecount=ecount+1
        if 'i'==word:
            icount=icount+1
        if 'o' ==word:
            ocount=ocount+1
        if 'u'==word:
            ucount=ucount+1

    cList['a']=acount
    cList['e']=ecount
    cList['i']=icount
    cList['o']=ocount
    cList['u']=ucount
    
    return cList


print(vowelFrequency('round up the usual suspects'))
