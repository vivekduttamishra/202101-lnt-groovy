
//groovy list can hold value of different types,

def values= [1, "hello", true, 20.5]

assert values.class==ArrayList.class

assert values[0].class==Integer.class

assert values[1].class==String.class

assert values[3].class==BigDecimal.class





println "all test passed"