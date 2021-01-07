//A range is a dynamic value represented between min-max

def range='a'..'z'

assert range instanceof ObjectRange
assert range.size()==26

def values=range.join(',')

assert values=='a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z'



println "all test passed"




