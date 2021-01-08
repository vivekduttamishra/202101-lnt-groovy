

def freq(*args):
    table={}
    for key in args:
        if key in table:
            table[key]+=1
        else:
            table[key]=1

    return table


print( freq(2,3,4,2,2,2,4,4,5,3,5,5,2,5,5))