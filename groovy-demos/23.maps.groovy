//groovy maps are like python dictionary 
//they contain key:value pairs 


def countryCode=[91:'India', 1:'USA', 45:'Tunisia', 'in':'India', 'uk':'Great Britain']




assert countryCode instanceof LinkedHashMap

assert countryCode.size()==5

assert countryCode[91]=='India'

assert countryCode['in']=='India'

assert countryCode['jp'] == null   //returns null for invalid key

//we can add a new key by simply assigning a value

countryCode['jp']='Japan'

assert countryCode['jp']=='Japan'
assert countryCode.size()==6


//we can replace existing value for key

assert countryCode['uk']=='Great Britain'

countryCode['uk']="United Kingdom" //replaces the existing value

assert countryCode['uk']=='United Kingdom'




println 'end of tests'



