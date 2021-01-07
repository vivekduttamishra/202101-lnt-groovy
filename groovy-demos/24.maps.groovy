//groovy maps are like python dictionary 
//they contain key:value pairs 


def countryCode=[ 'uk':'Great Britain', 'jp':'Japan']

def inKey= 'in'

countryCode[inKey]='India'

println countryCode

//a map key can be used as property using dot notation

assert countryCode['in']== countryCode.in
assert countryCode['jp']== countryCode.jp

//we can add a dynamic key using dot notation

countryCode.de="Germany"     //we can add a new key using dot notation
assert countryCode.size()==4

assert countryCode["de"]=="Germany"  //key added using dot notation can be accessed using []

//dot notation can be used for those keys only that can be used as valid identifiers
//must start with alphabate and must not have special characters other than underscore

countryCode[91]='India' //can't use countryCode.91='India' as 91 is not a valid variable name

assert countryCode[91]=='India'



//if map keys are strings, we can drop the double quotes around them while creating map
//those keys shouldn't be reserved words

def map=[   
        jp:'Japan',
        usa:"United States",
        in:'India'
        ]


assert map.jp=='Japan'

assert map.in=='India'












println 'end of tests'



